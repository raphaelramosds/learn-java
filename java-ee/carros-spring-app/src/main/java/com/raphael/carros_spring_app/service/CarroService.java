package com.raphael.carros_spring_app.service;

import com.raphael.carros_spring_app.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.carros_spring_app.entity.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public String save(Carro carro) {
        this.carroRepository.save(carro);
        return "Carro salvo com sucesso";
    }

    public String update(Carro carro, Long id) {
        carro.setId(id);
        this.carroRepository.save(carro);
        return "Carro atualizado com sucesso";
    }

    public String delete(Long id) {
        Carro carro = this.carroRepository.findById(id).orElse(null);
        if (carro == null) return "Carro nao encontrado";
        carro.setDeletado(true);
        this.carroRepository.save(carro);
        return "Carro deletado com sucesso";
    }
    
    public String deleteMany(ArrayList<Long> ids) {
    	ArrayList<Carro> carros = (ArrayList<Carro>) this.carroRepository.findAllById(ids);
    	for (Carro carro: carros) {
    		carro.setDeletado(true);
    		this.carroRepository.save(carro);
    	}
    	return "IDs deletados com sucesso";
    }

    public List<Carro> findAll() {
        return this.carroRepository.findAll();
    }

    public Carro findById(Long id) {
        Optional<Carro> carro = this.carroRepository.findById(id);
        return carro.orElse(null);
    }
}
