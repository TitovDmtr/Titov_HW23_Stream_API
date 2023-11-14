package task3.streamapi;

import task3.streamapi.model.Car;
import task3.streamapi.model.Color;
import task3.streamapi.util.CarStreamAPIUtil;

import java.util.List;

public class CarFilter {
    public static void main(String[] args) {

        List<Car> cars = CarStreamAPIUtil.getCars();
        CarStreamAPIUtil.printCars(cars);

        System.out.println();
        System.out.println("Filter by color:");
        List<Car> cars1 = CarStreamAPIUtil.filterByColor(cars, Color.BLACK);
        CarStreamAPIUtil.printCars(cars1);

        System.out.println();
        System.out.println("Filter by price (bigger than):");
        List<Car> cars2 = CarStreamAPIUtil.filterByPrice(cars, 222000);
        CarStreamAPIUtil.printCars(cars2);

        System.out.println();
        System.out.println("Filter by price (bigger than):");
        List<Car> cars3 = CarStreamAPIUtil.filterByDateRange(cars, 2010, 2018);
        CarStreamAPIUtil.printCars(cars3);

        System.out.println();
        System.out.println("Sort by price (from 'max' to 'min'):");
        List<Car> cars4 = CarStreamAPIUtil.sortByPrice(cars);
        CarStreamAPIUtil.printCars(cars4);
    }
}
