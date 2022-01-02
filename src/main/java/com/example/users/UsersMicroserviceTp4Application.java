package com.example.users;

import com.example.users.repository.RoleRepository;
import com.example.users.repository.UserRepository;
import com.example.users.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.users.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceTp4Application {
	@Autowired
	UserRepository userRepo;
	@Autowired
	RoleRepository roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceTp4Application.class, args);
	}
		@PostConstruct
        void init_users() {
        //ajouter les rôles
			roleRepo.save(new Role(null,"ADMIN"));
			roleRepo.save(new Role(null,"USER"));
        //ajouter les users
			userRepo.save(new User(null,"admin","123",true,null));
			userRepo.save(new User(null,"zeineb","123",true,null));
			userRepo.save(new User(null,"zeinouba","123",true,null));
        //ajouter les rôles aux users
//        userService.addRoleToUser("admin", "ADMIN");
//        userService.addRoleToUser("admin", "USER");
//        userService.addRoleToUser("zeineb", "USER");
//        userService.addRoleToUser("zeinouba", "USER");
        }
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
}
