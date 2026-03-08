package challenge.rest.api.controller;

import challenge.rest.api.domain.topico.DatosRegistroTopico;
import challenge.rest.api.domain.topico.Topico;
import challenge.rest.api.service.TopicoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService service;

    public TopicoController(TopicoService service) {
        this.service = service;
    }

    @PostMapping
    public Topico registrar(@RequestBody @Valid DatosRegistroTopico datos) {
        return service.crearTopico(datos);
    }
}