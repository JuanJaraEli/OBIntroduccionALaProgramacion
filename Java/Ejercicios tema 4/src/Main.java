// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número " + numeroIf + " es negativo.");
        } else System.out.println("El número es 0.");

        System.out.println("----------------------");

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("----------------------");

        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile<3);

        System.out.println("----------------------");

        for (int numeroFor = 0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("----------------------");
        String estacion = "INVIERNO";
        switch (estacion) {
            case "invierno":
            case "INVIERNO":
            case "Invierno":
                System.out.println("La estación actual es invierno.");
                break;
            case "primavera":
            case "PRIMAVERA":
            case "Primavera":
                System.out.println("La estación actual es primavera.");
                break;
            case "verano":
            case "VERANO":
            case "Verano":
                System.out.println("La estación actual es verano.");
                break;
            case "otoño":
            case "OTOÑO":
            case "Otoño":
                System.out.println("La estación actual es otoño.");
                break;
            default:
                System.out.println("No se ha ingresado una estación :(");
        }
    }
}
