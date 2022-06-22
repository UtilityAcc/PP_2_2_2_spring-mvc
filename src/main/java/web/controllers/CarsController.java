package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarserviceImlp;

@Controller
public class CarsController {

    private CarserviceImlp carserviceImlp;
    private Car header;

    @Autowired
    public CarsController(CarserviceImlp carserviceImlp, Car header) {
        this.carserviceImlp = carserviceImlp;
        this.header = header;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", carserviceImlp.getCars(count.intValue()));
        model.addAttribute("header", header.header());
        return "cars";
    }
}


