package modelo;

public class SistemaDomotico {
    private SensorLuz sensorLuz;
    private SensorMovimiento sensorMovimiento;
    private boolean[] lucesEncendidas; 

    public SistemaDomotico(boolean esDeNoche) {
        sensorLuz = new SensorLuz(esDeNoche);
        sensorMovimiento = new SensorMovimiento();
        lucesEncendidas = new boolean[3]; // Simula 3 habitaciones
    }

    public void controlarLuces() {
        boolean noche = sensorLuz.esDeNoche();
        
        for (int i = 0; i < lucesEncendidas.length; i++) {
            boolean movimiento = sensorMovimiento.detectarMovimiento();
            lucesEncendidas[i] = noche && movimiento;

            System.out.println("Habitación " + (i + 1) + ": " + 
                               (lucesEncendidas[i] ? "Luz Encendida" : "Luz Apagada"));
        }
    }

    public void cambiarModoNoche(boolean noche) {
        sensorLuz.establecerModoNoche(noche);
    }
}