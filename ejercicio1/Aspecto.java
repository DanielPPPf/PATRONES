public class Aspecto {
    public String color1;
    public String color2;
    public String armadura;

    public Aspecto() {
        this.color1 = color1;
        this.color2=color2;
        this.armadura=armadura;
    }

    public Aspecto copiar() {
        Aspecto nuevoAspecto = new Aspecto();
        nuevoAspecto.color1 = this.color1;
        nuevoAspecto.color2 = this.color2;
        nuevoAspecto.armadura = this.armadura;
        return nuevoAspecto;
    }


    public String getAspecto() {
        return "Aspecto: " +
                "color1='" + color1 + '\'' +
                ", color2='" + color2 + '\'' +
                ", armadura='" + armadura + '\'';
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }
}
