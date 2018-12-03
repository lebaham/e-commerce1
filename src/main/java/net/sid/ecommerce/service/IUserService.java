package net.sid.ecommerce.service;

import net.sid.ecommerce.entities.Role;
import net.sid.ecommerce.entities.User;

public interface IUserService {
    User ajouterUser(User user);
    void attribueRole(Role r, Long userId);
}
