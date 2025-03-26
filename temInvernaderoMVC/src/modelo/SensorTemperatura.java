
package modelo;

import java.util.Random;
public class SensorTemperatura {
    
    private Random random;

    public SensorTemperatura() {
        this.random = new Random();
    }

    public double leerTemperatura() {
        return 5 + random.nextDouble() * 30; // entre 5°C y 35°C
    }
}
