public class Main {
    public static void main(String[] args) {
        int resultado = suma(1,2,3);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas.");
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int puertas = 4;

    public void AgregarPuertas() {
        this.puertas++;
    }
}