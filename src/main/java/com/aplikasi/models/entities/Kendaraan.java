package com.aplikasi.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_kendaraan")
public class Kendaraan implements Serializable{

    @Id
    @Column(unique = true)
    private String noreg;
    private String name;
    @Column(length = 500)
    private String address;
    private String brand;
    @Column(length = 4)
    private int years;
    private int capacity;
    private String colour;
    private String fuel;
    
    public Kendaraan(){
    }

    public Kendaraan(String noreg, String name, String address, String brand, int years, int capacity, String colour,
            String fuel) {
        this.noreg = noreg;
        this.name = name;
        this.address = address;
        this.brand = brand;
        this.years = years;
        this.capacity = capacity;
        this.colour = colour;
        this.fuel = fuel;
    }

    public String getNoreg() {
        return noreg;
    }

    public void setNoreg(String noreg) {
        this.noreg = noreg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


}
