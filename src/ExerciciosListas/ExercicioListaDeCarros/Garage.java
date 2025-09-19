package ExerciciosListas.ExercicioListaDeCarros;

import java.util.ArrayList;

public class Garage {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();

        Car car1 = new Car("VW Golf", "Prata", 2007);
        Car car2 = new Car("Ford Fiesta", "Vermelho", 2012);
        Car car3 = new Car("Honda Civic", "Preto", 2018);
        Car car4 = new Car("Chevrolet Onix", "Branco", 2021);


        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);





    }
}
