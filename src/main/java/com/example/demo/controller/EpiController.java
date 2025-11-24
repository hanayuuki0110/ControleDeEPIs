package com.example.demo.controller;

import com.example.demo.dto.epi.EpiRequest;
import com.example.demo.dto.epi.EpiResponse;
import com.example.demo.service.EpiService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Epis")

public class EpiController {

private final EpiService servicoEpi;

public EpiController(EpiService servicoEpi) {
    this.servicoEpi = servicoEpi;

}
@PostMapping

    public ResponseEntity<Void> cadastrarEpi(@Valid @RequestBody EpiRequest epiRequest){

    servicoEpi.cadastrarEpi(epiRequest);
    return ResponseEntity.status(HttpStatus.CREATED).build();

}
@GetMapping

    public ResponseEntity<List<EpiResponse>> listarEpi(){
    return ResponseEntity.status(HttpStatus.OK).body(servicoEpi.listarEpis());
}

}
