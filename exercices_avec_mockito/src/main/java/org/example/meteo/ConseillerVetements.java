package org.example.meteo;

public class ConseillerVetements {

    private MeteoService meteoService;

    public ConseillerVetements(MeteoService meteoService) {
        this.meteoService = meteoService;
    }

    public String conseiller(String ville) {

        double temperature =
                meteoService.getTemperature(ville);

        if (temperature < 10) {
            return "Porter un manteau";
        } else {
            return "Tenue legere";
        }
    }
}