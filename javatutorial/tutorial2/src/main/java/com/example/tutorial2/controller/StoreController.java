package com.example.tutorial2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial2.model.Store;
import com.example.tutorial2.repository.StoreRepository;
import com.example.tutorial2.service.StoreService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Tuple;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private StoreService storeService;

    @GetMapping("/healthcheck")
public String healthCheck() {
    System.out.println("Checking stores...");

    try {
        // Check if the table exists
        List<Object[]> tableExists = entityManager.createNativeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='store';").getResultList();
        if (tableExists.isEmpty()) {
            System.out.println("The 'store' table does not exist.");
            return "Table 'store' not found.";
        }

        // Execute the query and return results as a list of Object arrays
        List<Object[]> result = entityManager.createNativeQuery("SELECT * FROM store").getResultList();

        // Check the retrieved data
        if (result.isEmpty()) {
            System.out.println("No stores found.");
        } else {
            // Iterate through the results and print each store name
            for (Object[] row : result) {
                String storeName = (String) row[1]; // Adjust based on the column index
                System.out.println("Hello store: " + storeName);
            }
        }

        return "Welcome to store";

    } catch (Exception e) {
        e.printStackTrace();
        return "Error checking stores: " + e.getMessage();
    }
}


@GetMapping("")
public ResponseEntity<List<Store>> getStores(){
    List<Store> allStores = storeService.getAll();
    return ResponseEntity.ok(allStores);
}

@GetMapping("/{id}")
public ResponseEntity<Store> getStoreById(
    @PathVariable String id 
){
    Store store = storeService.getById(id);
    return ResponseEntity.ok(store);
}

@GetMapping("/name")
public ResponseEntity<List<Store>> getStoreByName(
    @RequestParam("storeName") String storeName
){
    List<Store> store = storeService.getByName(storeName);
    return ResponseEntity.ok(store);
}


}
