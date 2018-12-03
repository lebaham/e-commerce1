package net.sid.ecommerce.dao;

import net.sid.ecommerce.entities.Role;
import net.sid.ecommerce.entities.User;

public interface IUserDao {
    User ajouterUser(User user);
    void attribueRole(Role r, Long userId);
}
