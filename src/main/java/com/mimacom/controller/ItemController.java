package com.mimacom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

import com.mimacom.domain.Item;
import com.mimacom.infrastructure.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody String name) {
        Item item = new Item(name);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @GetMapping
    public List<com.mimacom.domain.Item> getItems() {
        return itemRepository.findAll();
    }
}