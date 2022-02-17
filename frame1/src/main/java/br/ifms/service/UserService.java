package br.ifms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifms.model.User;
import br.ifms.repository.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getUsers(){

        return this.userRepository.findAll();
    }
}
