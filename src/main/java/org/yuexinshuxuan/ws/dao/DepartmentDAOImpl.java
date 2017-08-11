package org.yuexinshuxuan.ws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Entity;

import org.springframework.stereotype.Repository;
import org.yuexinshuxuan.ws.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public void save(Department dept) {
		em.persist(dept);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findAllDepartments() {
		Query query = em.createQuery("select d from Department d", Department.class);
		return query.getResultList();
	}

	@Override
	public Department findDepartmentById(int deptNo) {
		Query query = em.createQuery("select d from Department d where d.deptNo =:deptNo", Department.class);
		return (Department) query.setParameter("deptNo", deptNo).getSingleResult();
	}

}
