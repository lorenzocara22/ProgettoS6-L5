package com.viaggi.aziendaviaggi.services;

import com.viaggi.aziendaviaggi.entities.Dipendente;
import com.viaggi.aziendaviaggi.repositories.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    public List<Dipendente> getAllDipendenti() {
        return dipendenteRepository.findAll();
    }

    public Optional<Dipendente> getDipendenteById(Long id) {
        return dipendenteRepository.findById(id);
    }

    public Dipendente createDipendente(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public void deleteDipendente(Long id) {
        dipendenteRepository.deleteById(id);
    }

    public Dipendente updateDipendente(Long id, Dipendente dipendenteDetails) {
        Dipendente dipendente = dipendenteRepository.findById(id).orElseThrow();
        dipendente.setNome(dipendenteDetails.getNome());
        dipendente.setCognome(dipendenteDetails.getCognome());
        dipendente.setEmail(dipendenteDetails.getEmail());
        return dipendenteRepository.save(dipendente);
    }
}
