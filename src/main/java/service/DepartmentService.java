package service;

import java.util.List;

import entity.Department;

public interface DepartmentService {

	public void saveDept(Department dept);

	public List<Department> loadDeptDetails();
	
	public Department findDepartmentById(int Id);

}
