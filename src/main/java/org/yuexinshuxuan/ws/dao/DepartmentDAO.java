package org.yuexinshuxuan.ws.dao;

import java.util.List;

import org.yuexinshuxuan.ws.entity.Department;

public interface DepartmentDAO {

	void save(Department dept);

	List<Department> findAllDepartments();
	
	Department findDepartmentById(int Id);
	
}
