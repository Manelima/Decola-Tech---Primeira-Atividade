package dio.decolatech.decolatech_2025.service;


public interface UserService {
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
