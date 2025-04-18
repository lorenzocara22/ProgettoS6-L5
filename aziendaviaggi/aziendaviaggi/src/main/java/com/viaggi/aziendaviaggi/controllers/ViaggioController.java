package com.viaggi.aziendaviaggi.controllers;

import com.viaggi.aziendaviaggi.entities.Viaggio;
import com.viaggi.aziendaviaggi.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viaggi")
public class ViaggioController {

    @Autowired
    private ViaggioService viaggioService;

    @GetMapping
    public List<Viaggio> getAllViaggi() {
        return viaggioService.getAllViaggi();
    }

    @GetMapping("/{id}")
    public Viaggio getViaggioById(@PathVariable Long id) {
        return viaggioService.getViaggioById(id).orElseThrow();
    }

    @PostMapping
    public Viaggio createViaggio(@RequestBody Viaggio viaggio) {
        return viaggioService.createViaggio(viaggio);
    }

    @PutMapping("/{id}")
    public Viaggio updateViaggio(@PathVariable Long id, @RequestBody Viaggio viaggio) {
        return viaggioService.updateViaggio(id, viaggio);
    }

    @DeleteMapping("/{id}")
    public void deleteViaggio(@PathVariable Long id) {
        viaggioService.deleteViaggio(id);
    }
}
