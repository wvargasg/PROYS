package com.websystique.springmvc.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bsh.Console;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	EmployeeService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		/*List<Employee> employees = service.findAllEmployees();
		model.addAttribute("employees", employees);*/
		return "index";
	}
	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/sitio" }, method = RequestMethod.POST)
	public String sitio() {
		return "menu";
	}
	@RequestMapping(value = { "/sitio" }, method = RequestMethod.GET)
	public String inicio() {
		return "index";
	}
	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/Usuario" }, method = RequestMethod.POST)
	public String usuarioliente() {
		return "Usuario";
	}
	@RequestMapping(value = { "/Usuario" }, method = RequestMethod.GET)
	public String usuariog() {
		return "Usuario";
	}
	@RequestMapping(value = { "/Permiso" }, method = RequestMethod.POST)
	public String permiso() {
		return "Permiso";
	}
	@RequestMapping(value = { "/Permiso" }, method = RequestMethod.GET)
	public String permisog() {
		return "Permiso";
	}
	@RequestMapping(value = { "/Cliente" }, method = RequestMethod.POST)
	public String cliente() {
		return "comercial/Cliente";
	}
	@RequestMapping(value = { "/Cliente" }, method = RequestMethod.GET)
	public String clienteg() {
		return "comercial/Cliente";
	}
	@RequestMapping(value = { "/Empleado" }, method = RequestMethod.POST)
	public String empleado() {
		return "Empleado";
	}
	@RequestMapping(value = { "/Empleado" }, method = RequestMethod.GET)
	public String empleadog() {
		return "Empleado";
	}
	@RequestMapping(value = { "/Requerimiento" }, method = RequestMethod.POST)
	public String requerimiento() {
		return "Requerimiento";
	}
	@RequestMapping(value = { "/Requerimiento" }, method = RequestMethod.GET)
	public String requerimientog() {
		return "Requerimiento";
	}
	@RequestMapping(value = { "/Servicio" }, method = RequestMethod.POST)
	public String servicio() {
		return "Servicio";
	}
	@RequestMapping(value = { "/Servicio" }, method = RequestMethod.GET)
	public String serviciog() {
		return "Servicio";
	}
	@RequestMapping(value = { "/Giro" }, method = RequestMethod.POST)
	public String gironegocio() {
		return "Giro";
	}
	@RequestMapping(value = { "/Giro" }, method = RequestMethod.GET)
	public String gironegociog() {
		return "Giro";
	}
	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/Perfiles" }, method = RequestMethod.GET)
	public String Perfiles() {
		return "configuracion/Perfil";
	}
	@RequestMapping(value = { "/Contacto" }, method = RequestMethod.POST)
	public String Contacto() {
		return "Contacto";
	}
	@RequestMapping(value = { "/Contacto" }, method = RequestMethod.GET)
	public String Conctactog() {
		return "Contacto";
	}
	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		model.addAttribute("edit", false);
		return "menu";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "menu";
		}

		/*
		 * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation 
		 * and applying it on field [ssn] of Model class [Employee].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		 */
		if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
			FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
		    result.addError(ssnError);
			return "registration";
		}
		
		service.saveEmployee(employee);

		model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
		return "success";
	}


	/*
	 * This method will provide the medium to update an existing employee.
	 */
	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.GET)
	public String editEmployee(@PathVariable String ssn, ModelMap model) {
		Employee employee = service.findEmployeeBySsn(ssn);
		model.addAttribute("employee", employee);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	/*
	 * This method will be called on form submission, handling POST request for
	 * updating employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid Employee employee, BindingResult result,
			ModelMap model, @PathVariable String ssn) {

		if (result.hasErrors()) {
			return "registration";
		}

		if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
			FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
		    result.addError(ssnError);
			return "registration";
		}

		service.updateEmployee(employee);

		model.addAttribute("success", "Employee " + employee.getName()	+ " updated successfully");
		return "success";
	}

	
	/*
	 * This method will delete an employee by it's SSN value.
	 */
	@RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String ssn) {
		service.deleteEmployeeBySsn(ssn);
		return "redirect:/list";
	}

}
