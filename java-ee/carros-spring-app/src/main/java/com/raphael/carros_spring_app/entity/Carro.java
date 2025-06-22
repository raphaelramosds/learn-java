package com.raphael.carros_spring_app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    // Muitos "carros" (classe Carro) podem estar associados a uma "marca" (classe Marca)
    @ManyToOne(
            // Ao salvar um caro, permitir que a marca também seja salva no mesmo body
            // Exemplo:
            // {
            //    "nome" : "Tracker",
            //    "marca" : {
            //        "nome" : "Chevrolet"
            //    },
            //    "modelo" : "SUV",
            //    "proprietarios" : [
            //        {"nome" : "Raphael", "idade" : 24},
            //        {"nome" : "Neto Ramos", "idade" : 55}
            //    ]
            //}
            cascade = CascadeType.ALL
    )
    // Ao serializar um Carro, ele inclui a Marca, que inclui sua lista de Carros, que inclui de novo a Marca...
    // Gerando loop infinito ou stack overflow no response. Entao, ignore List<Carro> carros na classe Marca
    @JsonIgnoreProperties("carros")
    private Marca marca;

    private String modelo;
    private int ano;
    private boolean deletado;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "carro_proprietario")
    private List<Proprietario> proprietarios;
}
