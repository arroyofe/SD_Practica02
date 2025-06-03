package practica02.services;

import org.springframework.stereotype.Service;
import practica02.model.Libros;
import practica02.repository.LibrosRepository;

import java.util.List;

@Service
public class LibrosService {

    private final LibrosRepository librosrepository;

    public LibrosService(LibrosRepository librosrepository) {
        this.librosrepository = librosrepository;
    }

    public List<Libros> listaLibros() {
        return librosrepository.findAll();
    }
}
