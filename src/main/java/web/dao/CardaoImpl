package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardaoImpl implements CarDao {
     private final List<Car> cars = new ArrayList<>();
    public CardaoImpl() {
        cars.add(new Car("Bugatti", "Veyron", 2020));
        cars.add(new Car("Lamborgini", "Diablo", 2000));
        cars.add(new Car("Porshe", "911", 1995));
        cars.add(new Car("Doge", "Viper", 2005));
        cars.add(new Car("Lada", "Kalina", 1995));
    }
    @Override
    public List<Car> getCars(int  count){
        List<Car> cars_edited = cars;
        if (count <= 5) {
            cars_edited = cars.stream().limit(count).collect(Collectors
                    .toCollection(ArrayList::new));
        }
        return cars_edited;
    }
}
