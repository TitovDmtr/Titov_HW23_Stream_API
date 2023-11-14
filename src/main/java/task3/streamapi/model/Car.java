package task3.streamapi.model;

public class Car {
    private String brand;
    private int year;
    private double price;
    private Color color;
    private double volume;

    public Car(String brand, int year, double price, Color color, double volume) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color=" + color +
                ", volume=" + volume +
                '}';
    }
}
