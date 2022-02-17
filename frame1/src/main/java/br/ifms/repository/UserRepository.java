package br.ifms.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.ifms.model.User;

@Repository
public class UserRepository {

    private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    public List <User> findAll() {
        var users = new ArrayList<User>(); 
        users.add(new User(UUID.randomUUID(), "Victor", "Victor@hotmail"));   
        users.add(new User(UUID.randomUUID(), "Matheus", "Matheus@hotmail"));   
        users.add(new User(UUID.randomUUID(), "Emy", "Emy@hotmail"));   
        users.add(new User(UUID.randomUUID(), "Joao", "Joao@hotmail")); 
        logger.info("Listando os usuarios...");  

        return users;

    }
    


}
