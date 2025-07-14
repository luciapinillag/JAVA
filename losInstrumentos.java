import java.util.ArrayList;

class instrumento{

    public void tocar(){
        system.out.println("tocando el instrumento";)
    }

    class guitarra extends tocar{
        public void tocar (){
            system.out.println("suena la guitarra electrica");
        }
    }

    class piano extends tocar{
        public void tocar (){
            system.out.println("suena el piano clasico");
        }
    }
}


-- main 

public class losInstrumentos{
    public static void main(String[] args) {
        ArrayListist <String> instrumento = new ArrayList<>();

        instrumento.add("guitarra");
        instrumento.add("piano");

        for(string instrumento: instrumento){
            System.out.println();
        }
    }
}