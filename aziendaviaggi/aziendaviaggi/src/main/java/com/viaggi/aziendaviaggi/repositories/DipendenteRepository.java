package com.viaggi.aziendaviaggi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.viaggi.aziendaviaggi.entities.Dipendente;

public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
}
