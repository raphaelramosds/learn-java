package com.raphael.carros_spring_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    // Cardinalidades possíveis sao ManyToMany, ManyToOne, OneToOne, OneToMany
    // DICA: a cardinalidade da esquerda se refere a classe atual, e a da direita à classe do relacionamento

    // Uma "marca" pode estar associada a vários "carros"
    @OneToMany
    @JoinColumn(name = "marca_id")
    private List<Carro> carros;
}
