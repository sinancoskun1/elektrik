package service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import response.EnergyResponse;
@Service
public class AppService {
    public EnergyResponse getTitlesData() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<EnergyResponse> response = restTemplate.getForEntity(
                "http://10.199.70.16/getGunlukSantralElektrikUretimleri?gecerlilikTrh=2024-07-12",
                EnergyResponse.class
        );
        return response.getBody();
    }
}
