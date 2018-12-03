package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.entities.Role;
import net.sid.ecommerce.entities.User;
import net.sid.ecommerce.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements IUserService {
    @Autowired
    private IUserService userService;
    @Override
    public User ajouterUser(User user) {
        return userService.ajouterUser(user);
    }

    @Override
    public void attribueRole(Role r, Long userId) {
        userService.attribueRole(r, userId);
    }
}
