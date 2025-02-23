package study.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.auth.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
