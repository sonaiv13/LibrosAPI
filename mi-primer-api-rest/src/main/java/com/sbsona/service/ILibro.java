package com.sbsona.service;

import com.sbsona.model.entity.Libro;

public interface ILibro {

    Libro save(Libro libro);

    Libro findById(Integer id);

    void delete(Libro libro);

}
