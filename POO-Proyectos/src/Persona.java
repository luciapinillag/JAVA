class saludo{
    void saludar (){
        System.out.println ("hola mundo");
    }

    void saludar (string nombre){
        system.out.println("hola,  + nombre ");
    }

    void saludar (int hora){
        system.out.println("buenos dias  + hora");
    }
}

class  saludopara{
    public static void main(String[] args) {
        saludo saludo = new saludo();
        saludo.saludar();
        saludo.saludar(nombre: maria);
        saludo.saludar(12);
    }
}