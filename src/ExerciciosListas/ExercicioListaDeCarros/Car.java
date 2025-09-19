package ExerciciosListas.ExercicioListaDeCarros;

public class Car {
    private String model;
    private String color;
    private int year;

    Car(String model, String color, int year) {
            this.model = model;
            this.year = year;
            this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "\" Model:  " + model + "Color: " + color + "\" - Year: " + year;
    }
}
