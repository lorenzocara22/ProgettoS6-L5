package com.viaggi.aziendaviaggi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.viaggi.aziendaviaggi.entities.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
