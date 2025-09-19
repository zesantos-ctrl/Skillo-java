package TrabalhandoComListas.DesafioString;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listasString = new ArrayList<>();
        listasString.add("Java");
        listasString.add("C++");
        listasString.add("Python");

        for (String elemento : listasString) {
            System.out.println(elemento);
        }
    }
}
