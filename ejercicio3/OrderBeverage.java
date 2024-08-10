package ejercicio3;

public class OrderBeverage extends Order {
    
    @Override
    protected void takeOrder() {
        System.out.println("Tomando la orden de bebida");
    }
    
    @Override
    protected void prepareOrder() {
        System.out.println("Preparando la bebida");
    }
}