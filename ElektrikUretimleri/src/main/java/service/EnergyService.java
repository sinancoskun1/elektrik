package service;


import entities.Titles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EnergyRepository;
import response.EnergyResponse;

import java.util.List;


@Service
public class EnergyService {
    @Autowired
    private EnergyRepository energyRepository;

    @Autowired
    private AppService appService; // API'den veri çekmek için

    public void saveTitles() {

        EnergyResponse response = appService.getTitlesData();
        List<Titles> titles = response.getResults(); // API'den dönen veriyi al


        energyRepository.saveAll(titles);
    }
}