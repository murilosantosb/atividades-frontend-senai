package com.senai.apiValidation.controller;

import com.senai.apiValidation.request.CadastroEventoRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/eventos")
@RestController
public class EventoController {
    @PostMapping
    public ResponseEntity<Void> cadastrar(@Valid @RequestBody CadastroEventoRequest evento) {

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
