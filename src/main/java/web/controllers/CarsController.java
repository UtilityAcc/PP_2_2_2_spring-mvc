package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        String header = new Car().header();
        cars.add(new Car("Bugatti", "Veyron", 2020));
        cars.add(new Car("Lamborgini", "Diablo", 2000));
        cars.add(new Car("Porshe", "911", 1995));
        cars.add(new Car("Doge", "Viper", 2005));
        cars.add(new Car("Lada", "Kalina", 1995));
        if (count != null && count <= 5) {
            cars = cars.stream().limit(count).collect(Collectors
                    .toCollection(ArrayList::new));
        }
        model.addAttribute("cars", cars);
        model.addAttribute("header", header);
        return "cars";
    }
}

