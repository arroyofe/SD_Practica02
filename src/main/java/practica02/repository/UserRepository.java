package practica02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import practica02.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> id(long id);

    boolean existsById(Long id);

    Optional<User> findById(Long id);

    void save(User user);
}
