/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldv9_lab4;

/**
 *
 * @author dmitriy
 */
public class Phones {

    private Integer id;
    private PhonesSpecs phonesSpecs;
    private String brand;
    private String model;
    private int price;

    public Integer getId() {
        return id;
    }

    public Phones() {
    }

    public Phones(Integer id) {
        this.id = id;
    }

    public Phones(Integer id, PhonesSpecs phonesSpecs, String brand, String model, int price) {
        this.id = id;
        this.phonesSpecs = phonesSpecs;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setTvSpecifications(PhonesSpecs phonesSpecs) {
        this.phonesSpecs = phonesSpecs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PhonesSpecs getPhonesSpecs() {
        return phonesSpecs;
    }

    public void setPhonesSpecs(PhonesSpecs phonesSpecs) {
        this.phonesSpecs = phonesSpecs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phones=" + id + ", " + phonesSpecs + ", brand=" + brand + ", model=" + model + ", price=" + price;
    }
}
