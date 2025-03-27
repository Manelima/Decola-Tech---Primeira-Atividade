package dio.decolatech.decolatech_2025.domain.repository;

import dio.decolatech.decolatech_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
