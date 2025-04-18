package com.viaggi.aziendaviaggi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.viaggi.aziendaviaggi.entities.Viaggio;

public interface ViaggioRepository extends JpaRepository<Viaggio, Long> {
}
