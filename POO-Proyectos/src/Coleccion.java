
//importamos la clase para crear un arraylist
import java.util.ArrayList;

public class Coleccion {
    public static void main(String[] args) {
        // crear un objeto arraylist
        ArrayList<String> autos = new ArrayList<String>();
        //agregar un elemento a la lista
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("Mazda");
        autos.add("Toyota");
        System.out.println(autos);
        System.out.println("auto en la posicion 2: " + autos.get(2));
    }

}
