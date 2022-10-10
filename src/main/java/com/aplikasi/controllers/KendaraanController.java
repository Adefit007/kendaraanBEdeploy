package com.aplikasi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplikasi.models.entities.Kendaraan;
import com.aplikasi.services.KendaraanServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/kendaraan")
public class KendaraanController {

    @Autowired
    private KendaraanServices kendaraanServices;

    @PostMapping
    public Kendaraan save(@RequestBody Kendaraan kendaraan){
        return kendaraanServices.save(kendaraan);
    }
    
    @GetMapping
    public Iterable <Kendaraan> findAll(){
        return kendaraanServices.findAll();
    }

    @GetMapping("{id}")
    public Kendaraan findOne(@PathVariable("id") String id){
        return kendaraanServices.findOne(id);
    }

    @PatchMapping
    public Kendaraan update(@RequestBody Kendaraan kendaraan){
        return kendaraanServices.save(kendaraan);
    }

    @DeleteMapping("{id}")
    public void removeOne(@PathVariable("id") String id){
        kendaraanServices.removeOne(id);
    }
}
