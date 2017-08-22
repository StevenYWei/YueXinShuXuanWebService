package org.yuexinshuxuan.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.service.DepartmentService;

@RestController
public class DeptController {

	@Autowired
	DepartmentService deptService;
	
	@RequestMapping("/viewDept/{deptNo}")
	public String showDept(@PathVariable("deptNo") int deptNo) {
		return deptService.findDepartmentById(deptNo).toString();
	}
	
}
