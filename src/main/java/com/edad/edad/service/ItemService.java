package com.edad.edad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edad.edad.entity.Item;

@Service
public interface ItemService {
    
    public List<Item>finAll();

    public Item findById(Long id);
}
