package com.API.config;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.API.Entity.Role;
import com.API.Entity.User;
import com.API.repository.RoleSecurityRepository;
import com.API.repository.UserSecurityRepository;




@Component
public class DataSeedingListenerSecurity implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserSecurityRepository userSecurityRepository;

    @Autowired
    private RoleSecurityRepository roleSecurityRepository;

    @Autowired 
    private PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        // Roles
        if (roleSecurityRepository.findByName("ROLE_Admin") == null) {
        	roleSecurityRepository.save(new Role("ROLE_Admin"));
        }

        if (roleSecurityRepository.findByName("ROLE_Member") == null) {
        	roleSecurityRepository.save(new Role("ROLE_Member"));
        }

        // Admin account
        if (userSecurityRepository.findByEmail("admin@gmail.com") == null) {
        	User admin = new User();
            admin.setEmail("admin@gmail.com");
            admin.setPassword(passwordEncoder.encode("medusa"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleSecurityRepository.findByName("ROLE_Admin"));
            roles.add(roleSecurityRepository.findByName("ROLE_Member"));
            admin.setRoles(roles);
            userSecurityRepository.save(admin);
        }

        // Member account
        if (userSecurityRepository.findByEmail("member@gmail.com") == null) {
            User user = new User();
            user.setEmail("member@gmail.com");
            user.setPassword(passwordEncoder.encode("medusa"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleSecurityRepository.findByName("ROLE_Member"));
            user.setRoles(roles);
            userSecurityRepository.save(user);
        }
    }

}
