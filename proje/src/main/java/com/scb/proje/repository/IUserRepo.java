package com.scb.proje.repository;

import com.scb.proje.entity.Role;
import com.scb.proje.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username); //kullanıcı adına göre kullanıcıyı verecek.
/*
    User saveUser(User user); //Kullanıcıyı veritabanına kaydedecek

    Role saveRole(Role role); //Veritabanına rol ekleme

    void addRoleToUser(String username, String roleName); //Kullanıcıya rol eklemek.

    User getUser(String username); //Kullanıcı adına göre kullanıcıyı getirecek

    List<User> getUsers(); //Tüm kullanıcıların listesini verecek
*/
}
