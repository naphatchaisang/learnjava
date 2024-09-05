package com.example.tutorial2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tutorial2.model.Store;
import com.example.tutorial2.repository.StoreRepository;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }

    public List<Store> getAll(){
        return storeRepository.findAll();
    }

    public Store getById(String id){
        return storeRepository.findById(id).orElse(null);
    }

    public List<Store> getByName(String name){
        return storeRepository.findByStoreName(name);
    }



}
