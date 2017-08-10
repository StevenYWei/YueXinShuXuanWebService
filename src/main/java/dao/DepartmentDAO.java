package dao;

import java.util.List;

import entity.Department;

public interface DepartmentDAO {

	void save(Department dept);

	List<Department> findAllDepartments();
	
	Department findDepartmentById(int Id);
	
}
