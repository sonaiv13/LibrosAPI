package com.sbsona.service.impl;

import com.sbsona.model.dao.LibroDAO;
import com.sbsona.model.entity.Libro;
import com.sbsona.service.ILibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroImpl implements ILibro {
    @Autowired
    private LibroDAO libroDao;

    @Transactional
    @Override
    public Libro save(Libro libro) {
        return libroDao.save(libro);
    }

    @Transactional(readOnly = true) //es solamente una consulta
    @Override
    public Libro findById(Integer id) {
        return libroDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Libro libro) {
        libroDao.delete(libro);
    }
}
