package task3.streamapi.util;

import task3.streamapi.model.Car;
import task3.streamapi.model.Color;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarStreamAPIUtil {
    public static List<Car> getCars() {
        return List.of(
            new Car("Mercedes", 2007, new Integer(510000), Color.BLACK, new Double(3.5)),
            new Car("Audi", 2012, new Integer(83999), Color.SILVER, new Double(2.5)),
            new Car("BMW", 2023, new Integer(200222), Color.BLACK, new Double(3.0)),
            new Car("Porsche", 2007, new Integer(282000), Color.PURPUL, new Double(3.1)),
            new Car("Mazda", 2022, new Integer(4500), Color.WHITE, new Double(2.1)),
            new Car("Ferrari", 2017, new Integer(123123), Color.RED, new Double(3.4))
        );
    }

//  Display all cars:
    public static void printCars(List<Car> cars) {
        cars.forEach(System.out::println);
    }

//  Display cars by color:
    public static List<Car> filterByColor(List<Car> cars, Color color) {
        return cars.stream()
                .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());
    }

//  Filter cars by price ():
    public static List<Car> filterByPrice(List<Car> cars, double price) {
        return cars.stream().filter(car -> car.getPrice() > price).collect(Collectors.toList());
    }

//  Filter cars by date range
    public static List<Car> filterByDateRange(List<Car> cars, int startYearRange, int finishYearRange) {
        return cars.stream()
                .filter(car -> car.getYear() > startYearRange)
                .filter(car -> car.getYear() < finishYearRange).collect(Collectors.toList());
    }

//  Sort cars from 'max' to 'min' price
    public static List<Car> sortByPrice(List<Car> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
    }
}
