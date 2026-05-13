package com.howtodoinjava.spring_boot_rest_example.excecoes;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(Long id) {
        super("Item não encontrado: " + id);
    }
    
}
