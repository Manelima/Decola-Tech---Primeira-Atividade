package dio.decolatech.decolatech_2025.service.impl;

import dio.decolatech.decolatech_2025.domain.model.User;
import dio.decolatech.decolatech_2025.domain.repository.UserRepository;
import dio.decolatech.decolatech_2025.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserRepository(UserRepository userRepository){

        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate){
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalAccessException("This Account already exists.");
        }
        return userRepository.save(userToCreate);
}

}
