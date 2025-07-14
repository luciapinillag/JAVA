//arreglos: 
int [] numeros = new int [3];
numeros [0] = 10;
numeros [1] = 20;
numeros [2] = 30;

system.out.println (numeros[1]);


//arraylist (lista de arreglos)
arraylist <string> nombres = new arraylist <string>();

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Lucy");
        nombres.add("gato");
        nombres.add("paro");
        nombres.add("perro");
        nombres.add("milo");
        nombres.add("coco");
        nombres.add("gata");


        // Acceder a un elemento
        System.out.println("Primer nombre: " + nombres.get(0));

        // Recorrer la lista
        for (String nombre : nombres) {
            System.out.println("Hola, " + nombre);
        }

        // Ver cuántos hay
        System.out.println("Total: " + nombres.size() + " elementos");

        // Eliminar un elemento
        nombres.remove("PSM");
        System.out.println("Después de eliminar a Lucy: " + nombres);
    }
}
