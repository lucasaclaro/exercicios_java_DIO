public class Vehicle {

    // Atributos

    String brand;
    String model;
    String color;
    int yearManufacture;

    // Construtor

    Vehicle(String brand, String model, String color, int yearManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;

    }

    void setBrand(String brand) {
    this.brand = brand;

    }

    String getBrand() {
        return brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;

    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setYearManufacture(int yearManufacture){
        this.yearManufacture = yearManufacture;
    }

    int getYearManufacture(){
        return yearManufacture;
    }









}


