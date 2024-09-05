package com.example.tutorial2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tutorial2.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, String> {

    List<Store> findByStoreName(String storeName);
    
}
