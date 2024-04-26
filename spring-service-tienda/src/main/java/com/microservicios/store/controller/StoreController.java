package com.microservicios.store.controller;

import org.springframework.web.bind.annotation.RestController;

import com.microservicios.store.modelos.Celular;
import com.microservicios.store.modelos.Tienda;
import com.microservicios.store.service.StoreService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class StoreController {
    @Autowired
    private StoreService storeService;  

    @GetMapping("/list")
    public List<Tienda> list(){
        return storeService.findAll();
    }
    //@HystrixCommand(fallbackMethod="metodoGenerico")
    @GetMapping("/celular/{id}/cantidad/{cantidad}")
    public Tienda details(@PathVariable Long id, @PathVariable Integer cantidad){
        return storeService.findById(id, cantidad);
    }
    public Tienda metodoGenerico(Long id, Integer cantidad){
    	Tienda store = new Tienda();
    	Celular cel = new Celular(id, "Cel", "Samsung");
    	
    	store.setCantidad(cantidad);
    	store.setCel(cel);
    	return store;
    }
    
}
