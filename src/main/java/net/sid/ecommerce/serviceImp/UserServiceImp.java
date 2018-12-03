package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.dao.IUserDao;
import net.sid.ecommerce.entities.Role;
import net.sid.ecommerce.entities.User;
import net.sid.ecommerce.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImp implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public User ajouterUser(User user) {
        return userDao.ajouterUser(user);
    }

    @Override
    public void attribueRole(Role r, Long userId) {
        userDao.attribueRole(r, userId);
    }
}
