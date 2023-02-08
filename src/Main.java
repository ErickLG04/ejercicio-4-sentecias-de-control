public class Main {
    public static void main(String[] args) {

        int numeroWhile = 0;

        int numeroFor = 0;

        int numerolf = 5;

        var estacion = "verano";

        //caso if

        if (numerolf > 0) {
            System.out.println("numero positivo");

        } else if (numerolf < 0) {
            System.out.println("numero negativo");

        } else {
            System.out.println("es igual a 0 +++");
        }
        // caso while
        while (numeroWhile<3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //caso do while

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile<3);

        //caso for

        for (int i = 1; numeroFor<=3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //caso switch

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
                        case "invierno":
                    System.out.println("Es invierno");
                    break;
                case "primavera":
                    System.out.println("Es primavera");
                    break;
                case "otoño":
                    System.out.println("Es otoño");
                default :
                    System.out.println("No es una ninguna estaciones ");
            }
        }



    }








