package practica02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practica02.model.Libros;


import java.util.List;
import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Long> {

    List<Libros> id(long id);

    boolean existsById(Long id);

    Optional<Libros> findById(Long id);

    Libros save(Libros libro);

<<<<<<< Updated upstream
    List<Libros> findAll();
=======
  //List<Libros> findAll(); ya existe en Jpa Repository
>>>>>>> Stashed changes
}