package net.sid.ecommerce.daoImp;

import net.sid.ecommerce.dao.IUserDao;
import net.sid.ecommerce.entities.Role;
import net.sid.ecommerce.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDaoImp implements IUserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public User ajouterUser(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public void attribueRole(Role r, Long userId) {
       User user = em.find(User.class, userId);
       user.getRoles().add(r);
       Role role = em.find(Role.class, r.getIdRole());
        role.getUsers().add(user);
        em.persist(user);
        em.persist(role);
    }
}
