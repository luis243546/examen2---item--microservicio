package com.edad.edad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edad.edad.entity.Item;
import com.edad.edad.service.ItemService;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/lista1")
    public List<Item>findAll(){
        return itemService.finAll();
    }

    @GetMapping("/lista1/{id}")
    public Item findById(@PathVariable Long id){
        return itemService.findById(id);
    }
}
