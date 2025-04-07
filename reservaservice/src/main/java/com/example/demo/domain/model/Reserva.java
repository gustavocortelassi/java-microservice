package com.example.demo.domain.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    private Long salaId;     // só armazena o ID
    private Long usuarioId;  // só armazena o ID

    // Getters e setters aqui
}