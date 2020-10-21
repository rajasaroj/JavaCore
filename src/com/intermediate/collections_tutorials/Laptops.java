package com.intermediate.collections_tutorials;

public class Laptops{

    private int price;
    private int ram;
    private String brand;

    public Laptops(int price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Laptops o) {
//
//        if (this.getPrice() < o.getPrice())
//            return 1;
//        else
//            return -1;
//    }
}
