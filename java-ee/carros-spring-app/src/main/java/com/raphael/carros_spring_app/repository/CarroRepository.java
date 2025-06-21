package com.raphael.carros_spring_app.repository;

import com.raphael.carros_spring_app.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long>{ }
