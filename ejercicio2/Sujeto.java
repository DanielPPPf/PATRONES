package ejercicio2;

public interface Sujeto {
    void acoplar(Observador observer);
    void desacoplar(Observador observer);
    void notificar();
}
