package com.scb.proje.service;

import com.scb.proje.entity.Role;
import com.scb.proje.entity.User;

import java.util.List;

public interface IUserService {

    User saveUser(User user);       //Bu yöntemi her çağırdığımda kullanıcıyı veritabanına kaydedeceğim.(Ve geri dönüş olarak User alacağım)

    Role saveRole(Role role);       //Rolü veritabanına kaydettik ve bu metod rolü bana geri verecek(dönüş olarak yine rolü alacağız)

    void addRoleToUser(String username, String roleName);     //kullanıcıya rol eklemek(parametre olarak username ve role name)

    User getUser(String username);        //Bu sadece user dönderecek bize ve username benzersiz olduğu için parametre olarak username kullandık.Yani bu metod girilen kullanıcı adına göre bize kullanıcı adını getirecek

    List<User> getUsers();                //Tüm kullanıcıların listesini verecek.(Liste halinde)
}
