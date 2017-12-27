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
	public User getUserById(int userId) {
		Query query = em.createQuery("select u from User u where u.user_id = :userId", User.class);
		return (User) query.setParameter("userId", userId).getSingleResult();
//		return em.find(User.class, userId);
	}

	@Override
	@Transactional
	public User addUser(User userInfo) {
//		em.find(User.class, userInfo.getUserId());
		em.persist(userInfo);
		em.flush();
		return em.find(User.class, userInfo.getUserId());
	}

	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserCode(String userId, String userCode) {
		Query query = em.createQuery("update User u set u.userCode = :userCode where u.user_id = :userId", User.class);
		query.executeUpdate();

	}

	@Override
	public void updateUserActiveFlag(String userId, String activeFlag) {
		Query query = em.createQuery("update User u set u.activeFlag = :activeFlag where u.user_id = :userId", User.class);
		query.executeUpdate();

	}

}
