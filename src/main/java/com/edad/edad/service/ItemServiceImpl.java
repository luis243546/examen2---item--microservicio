package com.edad.edad.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edad.edad.entity.Alumno;
import com.edad.edad.entity.Item;

@Service
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> finAll() {
        List<Alumno> alumnos = Arrays
                .asList(clienteRest.getForObject("http://localhost:8005/lista1", Alumno[].class));
        return alumnos.stream().map(p -> new Item(p)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id) {
        Alumno alumno = clienteRest.getForObject("http://localhost:8005/lista1/{id}", Alumno.class, id);

        if (alumno != null) {
            return new Item(alumno);
        } else {
            return null;
        }
    }
}
