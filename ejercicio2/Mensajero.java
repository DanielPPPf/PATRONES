package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Mensajero implements Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private String mensaje;

    @Override
    public void acoplar(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    @Override
    public void desacoplar(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for (Observador observer : observadores) {
            observer.actualizar(mensaje);
        }
    }

    public void recibirMensaje(String mensaje) {
        this.mensaje = mensaje;
        notificar();
    }
}
