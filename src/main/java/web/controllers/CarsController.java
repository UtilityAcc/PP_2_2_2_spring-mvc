package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;


@Controller
public class CarsController {

    private CarService carservice;
    private Car header;

    @Autowired
    public CarsController(CarService carservice, Car header) {
        this.carservice = carservice;
        this.header = header;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", carservice.getCars(count.intValue()));
        model.addAttribute("header", header.header());
        return "cars";
    }
}




