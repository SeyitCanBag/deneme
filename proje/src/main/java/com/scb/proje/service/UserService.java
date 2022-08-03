package com.scb.proje.service;

import com.scb.proje.entity.Role;
import com.scb.proje.entity.User;
import com.scb.proje.repository.IRoleRepo;
import com.scb.proje.repository.IUserRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService  implements IUserService{

    private final IUserRepo iUserRepo;
    private final IRoleRepo iRoleRepo;

    public UserService(IUserRepo iUserRepo, IRoleRepo iRoleRepo) {
        this.iUserRepo = iUserRepo;
        this.iRoleRepo = iRoleRepo;
    }

    @Override
    public User saveUser(User user) {
        return iUserRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return iRoleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = iUserRepo.findByUsername(username); //Kullanıcının adını bulduk
        Role role = iRoleRepo.findByName(roleName); //Rol adını bulduk
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        return iUserRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return iUserRepo.findAll();
    }
}
