package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carsList;

    public CarServiceImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car("BMW", "X6 E71", 286));
        carsList.add(new Car("Toyota", "RAV4 2.0 CVT", 175));
        carsList.add(new Car("Chrysler", "300C I", 193));
        carsList.add(new Car("Audi", "A6 IV(C7)", 300));
        carsList.add(new Car("Tesla", "Model X P90D", 773));
    }

    public List<Car> getCarsList(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}