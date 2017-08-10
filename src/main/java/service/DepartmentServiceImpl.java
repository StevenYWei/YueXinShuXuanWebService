package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DepartmentDAO;
import entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDAO deptDAO;
	
	@Override
	public void saveDept(Department dept) {
		deptDAO.save(dept);
	}

	@Override
	public List<Department> loadDeptDetails() {
		return deptDAO.findAllDepartments();
	}

	@Override
	public Department findDepartmentById(int deptId) {
		return deptDAO.findDepartmentById(deptId);
	}

}
