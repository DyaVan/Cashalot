package com.cashalot.services;

import com.cashalot.domain.actors.AuthorizationDetails;
import com.cashalot.domain.actors.User;
import com.cashalot.repository.AuthorizationDetailsRepository;
import com.cashalot.repository.UserRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.ArrayList;
import java.util.List;

@Transactional
public class AuthorizationService implements UserDetailsService {

    @Autowired
    AuthorizationDetailsRepository authDetailsRepo;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        AuthorizationDetails authDetails = authDetailsRepo.findByEmail(email);
        if (authDetails != null) {
            List<GrantedAuthority> authorityList = new ArrayList<>();
            String roleName = authDetails.getRole().getRoleName();
            authorityList.add(new SimpleGrantedAuthority(roleName));

            return new org.springframework.security.core.userdetails.User(
                    authDetails.getEmail(),
                    authDetails.getPassword(),
                    authorityList);
        }else{
            throw new UsernameNotFoundException("No user with such email found");
        }
    }

//    @Transactional
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(email);
//        if (user != null) {
//            List<GrantedAuthority> authorityList = new ArrayList<>();
//            user.getRoles()
//                    .forEach(x -> authorityList.add(new SimpleGrantedAuthority(x.getRoleName())));
//
//            return new org.springframework.security.core.userdetails.User(
//                    user.getEmail(),
//                    user.getPassword(),
//                    authorityList
//            );
//        }
//        return null;
//    }
}
