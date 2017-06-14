package com.cashalot.services;


import com.cashalot.domain.actors.AuthorizationDetails;
import com.cashalot.domain.actors.User;
import com.cashalot.repository.AuthorizationDetailsRepository;
import com.cashalot.repository.RoleRepository;
import com.cashalot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    //register
    //update
    //ban
    //
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthorizationDetailsRepository authorizationDetailsRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional
    public void register(String email, String name, boolean sex, int age, String password){
        User newUser = new User();
        newUser.setEmail(email);
        newUser.setAge(age);
        newUser.setName(name);
        newUser.setSex(sex);

        AuthorizationDetails authDetails = new AuthorizationDetails();
        authDetails.setPassword(passwordEncoder.encode(password));
        authDetails.setEmail(email);
        authDetails.setRole(roleRepository.findOne(1L));//// TODO: 12.06.2017 GAVNOKOD
        authDetails.setEnabled(true);

        authorizationDetailsRepository.save(authDetails);
        userRepository.save(newUser);
    }

}
