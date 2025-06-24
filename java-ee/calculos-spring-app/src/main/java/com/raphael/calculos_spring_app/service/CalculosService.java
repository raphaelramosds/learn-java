package com.raphael.calculos_spring_app.service;

import com.raphael.calculos_spring_app.entity.Resultado;
import org.springframework.stereotype.Service;

import com.raphael.calculos_spring_app.entity.Entrada;

import java.util.List;

@Service
public class CalculosService {

    public Resultado<Integer> somar(Entrada entrada) {
        Resultado<Integer> resultado = new Resultado<Integer>();
        Integer soma = 0;
        resultado.setResultado(soma);

        if (entrada.getLista() == null) return resultado;

        List<Integer> lista = entrada.getLista();
        for (int i = 0; i < lista.size(); i++) {
            soma += entrada.getLista().get(i);
        }

        resultado.setResultado(soma);

        return resultado;
    }

    public Resultado<Double> media(Entrada entrada) {
        Resultado<Double> resultado = new Resultado<Double>();
        Double soma = 0.0;
        resultado.setResultado(soma);

        if (entrada.getLista() == null) return resultado;

        List<Integer> lista = entrada.getLista();
        int i;
        for (i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }

        resultado.setResultado(soma / i);

        return resultado;
    }
}
