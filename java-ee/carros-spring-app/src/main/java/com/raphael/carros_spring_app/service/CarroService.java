package com.raphael.carros_spring_app.service;

import org.springframework.stereotype.Service;

import com.raphael.carros_spring_app.entity.Carro;

@Service
public class CarroService {
    public String save(Carro carro) {
        return "Carro salvo com sucesso";
    }

    public Carro findById(int id) {
        if (id == 1) {
            Carro carro = new Carro();
            carro.setNome("Onyx");
            carro.setMarca("Chevrolet");
            return carro;
        }
        return null;
    }
}
