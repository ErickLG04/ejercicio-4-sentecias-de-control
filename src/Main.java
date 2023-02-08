public class Main {
    public static void main(String[] args) {

        //caso if
        int numerolf = 5;

        if (numerolf > 0) {
            System.out.println("numero positivo"+numerolf);

        } else if (numerolf < 0) {
            System.out.println("numero negativo"+numerolf);

        } else {
            System.out.println("es igual a 0 ");
        }
        // caso while
        int numeroWhile = 1;

        while (numeroWhile<3) {
            System.out.println("la variable  ahora vale "+numeroWhile);
            numeroWhile++;
        }

        //caso do while

        int numeroDowhile= 3;

        do {
            numeroDowhile++;
            System.out.println("la variable dowhile ahora vale "+numeroDowhile);

        } while (numeroDowhile<3);

        //caso for


        for ( int numeroFor = 0; numeroFor<=3; numeroFor++) {
            System.out.println("la variable numfor vale "+numeroFor);
        }

        //caso switch
        var estacion = "verano";

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
                    System.out.println("No es una ninguna estacione ");
            }
        }



    }








