package com.aplikasi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplikasi.models.entities.Kendaraan;
import com.aplikasi.models.repos.KendaraanRepo;

@Service
@Transactional
public class KendaraanServices {
    
    @Autowired
    private KendaraanRepo kendaraanRepo;

    public Kendaraan save(Kendaraan Kendaraan){
        return kendaraanRepo.save(Kendaraan);
    }

    public Kendaraan findOne(String id) {
        Optional<Kendaraan> kendaraan = kendaraanRepo.findById(id);
        if (!kendaraan.isPresent()){
            return null;
        } else {
        return kendaraan.get();
        }
    }

    public Iterable<Kendaraan> findAll(){
        return kendaraanRepo.findAll();
    }

    public void removeOne(String id){
        kendaraanRepo.deleteById(id);
    }

    public List<Kendaraan> findByName(String name) {
        return kendaraanRepo.findByNameContains(name);
    }
}
