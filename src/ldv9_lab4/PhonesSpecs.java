/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldv9_lab4;

/**
 *
 * @author dmitriy
 */
public class PhonesSpecs {

    private Integer id;
    private int ram;
    private int capacity;
    private String cpu;

    public PhonesSpecs() {
    }

    public PhonesSpecs(int ram, int capacity, String cpu) {
        this.ram = ram;
        this.capacity = capacity;
        this.cpu = cpu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PhonesSpecs{" + "id=" + id + ", ram=" + ram + ", capacity=" + capacity + ", cpu=" + cpu + '}';
    }
}
