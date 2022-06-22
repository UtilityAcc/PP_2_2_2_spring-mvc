package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarserviceImpl;

@Controller
public class CarsController {

    private CarserviceImpl carserviceimpl ;
    private Car header;

    @Autowired
    public CarsController(CarserviceImpl arserviceimpl, Car header) {
        this.carserviceimpl = arserviceimpl;
        this.header = header;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", carserviceimpl.getCars(count.intValue()));
        model.addAttribute("header", header.header());
        return "cars";
    }
}


