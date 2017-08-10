package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.DepartmentService;
import service.DepartmentServiceImpl;

@RestController
public class DeptController {

	@Autowired
	DepartmentService deptService;
	
	@RequestMapping("/viewDept")
	public String showDept() {
		return deptService.findDepartmentById(1).toString();
	}
	
}
