package ejercicio2;

public class Dispositivo implements Observador {
    private String deviceName;

    public Dispositivo(String deviceName) {
        this.deviceName = deviceName;

    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(deviceName + " recibió el mensaje: " + mensaje);
    }
}
