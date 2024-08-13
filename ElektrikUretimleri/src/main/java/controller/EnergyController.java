package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EnergyService;


@RestController
public class EnergyController {
    @Autowired
    private EnergyService energyService;

    @GetMapping("/import")
    public String importTitles() {
        energyService.saveTitles();
        return "Characters imported successfully!";
    }
}