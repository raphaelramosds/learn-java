package com.raphael.carros_spring_app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Carro {
    private String nome;
    private String marca;
    private String modelo;
}
