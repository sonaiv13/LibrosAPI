package com.sbsona.model.dao;

import com.sbsona.model.entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface LibroDAO extends CrudRepository<Libro, Integer> {

}
