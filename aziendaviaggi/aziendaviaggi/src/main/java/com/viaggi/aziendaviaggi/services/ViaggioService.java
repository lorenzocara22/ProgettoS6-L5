package com.viaggi.aziendaviaggi.services;

import com.viaggi.aziendaviaggi.entities.Viaggio;
import com.viaggi.aziendaviaggi.repositories.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;

    public List<Viaggio> getAllViaggi() {
        return viaggioRepository.findAll();
    }

    public Optional<Viaggio> getViaggioById(Long id) {
        return viaggioRepository.findById(id);
    }

    public Viaggio createViaggio(Viaggio viaggio) {
        return viaggioRepository.save(viaggio);
    }

    public void deleteViaggio(Long id) {
        viaggioRepository.deleteById(id);
    }

    public Viaggio updateViaggio(Long id, Viaggio viaggioDetails) {
        Viaggio viaggio = viaggioRepository.findById(id).orElseThrow();
        viaggio.setDestinazione(viaggioDetails.getDestinazione());
        viaggio.setData(viaggioDetails.getData());
        viaggio.setStato(viaggioDetails.getStato());
        return viaggioRepository.save(viaggio);
    }
}
