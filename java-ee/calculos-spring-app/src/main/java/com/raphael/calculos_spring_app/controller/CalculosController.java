package com.raphael.calculos_spring_app.controller;

import com.raphael.calculos_spring_app.entity.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raphael.calculos_spring_app.entity.Entrada;
import com.raphael.calculos_spring_app.service.CalculosService;

@RestController
@RequestMapping("/api/calculos")
public class CalculosController {

    @Autowired
    private CalculosService calculosService;

    @GetMapping("/soma")
    public ResponseEntity<Resultado<Integer>> soma(@RequestBody Entrada entrada) {
        try {
            Resultado<Integer> resultado = this.calculosService.somar(entrada);
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/media")
    public ResponseEntity<Resultado<Double>> media(@RequestBody Entrada entrada) {
        try {
            Resultado<Double> resultado = this.calculosService.media(entrada);
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
