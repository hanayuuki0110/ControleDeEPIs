package com.example.demo.controller;

import com.example.demo.service.EpiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Epis")
public class EpiController {

private final EpiService servicoEpi;

public EpiController(EpiService servicoEpi) {
    this.servicoEpi = servicoEpi;

}
}
