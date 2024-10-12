package com.sbsona.controller;

import com.sbsona.model.entity.Libro;
import com.sbsona.service.ILibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class LibroController {

    @Autowired
    private ILibro libroService;

    @PostMapping("libro")
    @ResponseStatus(HttpStatus.CREATED)
    public Libro create(@RequestBody Libro libro){
        return libroService.save(libro);
    }

    @PutMapping("libro")
    @ResponseStatus(HttpStatus.CREATED)
    public Libro update(@RequestBody Libro libro){
        return libroService.save(libro);
    }

    @DeleteMapping("libro/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        Libro libroDelete = libroService.findById(id);
        libroService.delete(libroDelete);
    }

    @GetMapping("libro/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Libro showById(@PathVariable int id){
        return libroService.findById(id);
    }

}
