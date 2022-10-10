package com.aplikasi.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aplikasi.models.entities.Kendaraan;

public interface KendaraanRepo extends CrudRepository<Kendaraan, String> {
    List<Kendaraan> findByNameContains(String name);
}
