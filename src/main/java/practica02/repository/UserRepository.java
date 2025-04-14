package practica02.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import practica02.model.User;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> id(long id);

}
