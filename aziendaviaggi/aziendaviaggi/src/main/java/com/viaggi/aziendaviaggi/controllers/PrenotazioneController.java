package com.viaggi.aziendaviaggi.controllers;

import com.viaggi.aziendaviaggi.entities.Prenotazione;
import com.viaggi.aziendaviaggi.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping
    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneService.getAllPrenotazioni();
    }

    @GetMapping("/{id}")
    public Prenotazione getPrenotazioneById(@PathVariable Long id) {
        return prenotazioneService.getPrenotazioneById(id).orElseThrow();
    }

    @PostMapping
    public Prenotazione createPrenotazione(@RequestBody Prenotazione prenotazione) {
        return prenotazioneService.createPrenotazione(prenotazione);
    }

    @PutMapping("/{id}")
    public Prenotazione updatePrenotazione(@PathVariable Long id, @RequestBody Prenotazione prenotazione) {
        return prenotazioneService.updatePrenotazione(id, prenotazione);
    }

    @DeleteMapping("/{id}")
    public void deletePrenotazione(@PathVariable Long id) {
        prenotazioneService.deletePrenotazione(id);
    }
}
