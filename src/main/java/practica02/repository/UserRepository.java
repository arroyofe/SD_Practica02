package practica02.repository;

import org.springframework.data.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practica02.model.User;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, String>{

    List<User> id(long id);

}
