package com.viaggi.aziendaviaggi.controllers;

import com.viaggi.aziendaviaggi.entities.Dipendente;
import com.viaggi.aziendaviaggi.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping
    public List<Dipendente> getAllDipendenti() {
        return dipendenteService.getAllDipendenti();
    }

    @GetMapping("/{id}")
    public Dipendente getDipendenteById(@PathVariable Long id) {
        return dipendenteService.getDipendenteById(id).orElseThrow();
    }

    @PostMapping
    public Dipendente createDipendente(@RequestBody Dipendente dipendente) {
        return dipendenteService.createDipendente(dipendente);
    }

    @PutMapping("/{id}")
    public Dipendente updateDipendente(@PathVariable Long id, @RequestBody Dipendente dipendente) {
        return dipendenteService.updateDipendente(id, dipendente);
    }

    @DeleteMapping("/{id}")
    public void deleteDipendente(@PathVariable Long id) {
        dipendenteService.deleteDipendente(id);
    }
}
