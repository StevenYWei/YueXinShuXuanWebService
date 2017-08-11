package org.yuexinshuxuan.ws.service;

import java.util.List;

import org.yuexinshuxuan.ws.entity.Department;

public interface DepartmentService {

	public void saveDept(Department dept);

	public List<Department> loadDeptDetails();
	
	public Department findDepartmentById(int Id);

}
