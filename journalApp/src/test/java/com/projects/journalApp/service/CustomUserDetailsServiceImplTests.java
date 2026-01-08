package com.projects.journalApp.service;

import com.projects.journalApp.entity.User;
import com.projects.journalApp.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

@ActiveProfiles("dev")
public class CustomUserDetailsServiceImplTests {

    @InjectMocks
    private CustomUserDetailsServiceImpl customUserDetailsService;

    @Mock
    private UserRepository userRepository;

    @Disabled
    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Disabled
    @Test
    void loadUserByUsernameTest(){
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Ayushi").password("1234").roles(new ArrayList<>()).build());
        UserDetails user = customUserDetailsService.loadUserByUsername("Ayushi");
        Assertions.assertNotNull(user);
    }
}
