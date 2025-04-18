package com.viaggi.aziendaviaggi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String nome;
    private String cognome;
    private String email;

    private String immagineProfilo; // opzionale per upload immagine
}
