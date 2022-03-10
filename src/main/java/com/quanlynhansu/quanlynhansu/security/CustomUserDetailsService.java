// package com.quanlynhansu.quanlynhansu.security;

// import com.quanlynhansu.quanlynhansu.user.User;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// @Service
// public class CustomUserDetailsService implements UserDetailsService{

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User customer = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
//         .orElseThrow(() ->
//         new UsernameNotFoundException("User not found with username or email:" + usernameOrEmail));
//         return new org.springframework.security.core.userdetails.User(customer.getEmail(),
//         customer.getPwd(), mapRolesToAuthorities(customer.getRoles()));
//     }
    
// }
