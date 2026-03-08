package challenge.rest.api.service;

import challenge.rest.api.domain.topico.DatosRegistroTopico;
import challenge.rest.api.domain.topico.Topico;
import challenge.rest.api.repository.TopicoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TopicoService {

    private final TopicoRepository repository;

    public TopicoService(TopicoRepository repository) {
        this.repository = repository;
    }

    public Topico crearTopico(DatosRegistroTopico datos) {

        Topico topico = new Topico();

        topico.setTitulo(datos.titulo());
        topico.setMensaje(datos.mensaje());
        topico.setFechaCreacion(LocalDateTime.now());
        topico.setStatus("ABIERTO");

        return repository.save(topico);
    }
}