package com.viaggi.aziendaviaggi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destinazione;
    private String data;
    private String stato; // esempio: "in programma" o "completato"
}
