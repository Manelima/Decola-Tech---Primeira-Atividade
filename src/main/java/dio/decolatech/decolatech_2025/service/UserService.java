package dio.decolatech.decolatech_2025.service;

import dio.decolatech.decolatech_2025.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
