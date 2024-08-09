package ejercicio3;

public abstract class Order {
    
    public final void processOrder() {
        takeOrder();
        prepareOrder();
        checkAvailability();
        calculatePrice();
        serveOrder();
    }
    
    protected abstract void takeOrder();
    protected abstract void prepareOrder();
    
    protected void checkAvailability() {
        System.out.println("Verificando la disponibilidad de los ingredientes");
    }
    
    protected void calculatePrice() {
        System.out.println("Calculando el precio total");
    }
    
    protected void serveOrder() {
        System.out.println("El pedido está listo para servir");
    }
}
