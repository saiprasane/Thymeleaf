package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String display(Model model) {

		Employee employee = new Employee(1, "Sai", 12000d);
		model.addAttribute("employee", employee);

		return "one";
	}

}
