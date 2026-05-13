package com.howtodoinjava.spring_boot_rest_example.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.spring_boot_rest_example.modelos.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
