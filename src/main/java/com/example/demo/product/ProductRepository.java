package com.example.demo.product;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private Map<Integer, String> db = new HashMap<>();

    int id = 1;

    public String findProduct(int id) {
        return db.get(id-1);
    }

    public void save(String productName){
        db.put(id++,productName);
    }
}
