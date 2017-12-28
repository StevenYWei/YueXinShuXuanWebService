package org.yuexinshuxuan.ws.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.yuexinshuxuan.ws.entity.User;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public User getUserById(int userId) {
		return em.find(User.class, userId);
	}

	@Override
	@Transactional
	public User addUser(User userInfo) {
		em.persist(userInfo);
		em.flush();
		return em.find(User.class, userInfo.getUserId());
	}

	@Override
	@Transactional
	public int deleteUserById(int userId) {
		User userToBeDeleted = em.find(User.class, userId);
		if(userToBeDeleted == null) {
			return 0;
		}
		em.remove(userToBeDeleted);
		return 1;
	}

	@Override
	@Transactional
	public int updateUserCode(int userId, String userCode) {
		User userToBeUpdated = em.find(User.class, userId);
		userToBeUpdated.setUserCode(userCode);
		em.merge(userToBeUpdated);
		return 1;

	}

	@Override
	@Transactional
	public int updateUserActiveFlag(int userId, String activeFlag) {
		User userToBeUpdated = em.find(User.class, userId);
		userToBeUpdated.setActiveFlag(activeFlag);
		em.merge(userToBeUpdated);
		return 1;

	}

}
