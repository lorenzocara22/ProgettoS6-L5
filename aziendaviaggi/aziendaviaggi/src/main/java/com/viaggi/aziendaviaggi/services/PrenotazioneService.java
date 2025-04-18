package com.viaggi.aziendaviaggi.services;

import com.viaggi.aziendaviaggi.entities.Prenotazione;
import com.viaggi.aziendaviaggi.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Optional<Prenotazione> getPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id);
    }

    public Prenotazione createPrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public void deletePrenotazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }

    public Prenotazione updatePrenotazione(Long id, Prenotazione prenotazioneDetails) {
        Prenotazione prenotazione = prenotazioneRepository.findById(id).orElseThrow();
        prenotazione.setDataPrenotazione(prenotazioneDetails.getDataPrenotazione());
        prenotazione.setDestinazione(prenotazioneDetails.getDestinazione());
        return prenotazioneRepository.save(prenotazione);
    }
}
