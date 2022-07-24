package laboratorio_2_fernando_calvo_picado;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variables
        int vote, partidoOption, voteYes = 0, voteNo = 0, ptn = 0, puns = 0, pad = 0, consDatos = 0;

        do {
            System.out.println("Encuesta para las elecciones presidenciales de Costa Rica \n");
            System.out.println("Va a ejercer su voto? ");
            System.out.println("1- Si");
            System.out.println("2- No");
            System.out.println("3- Salir");
            vote = input.nextInt();

            if (vote == 1) {

                switch (vote) {
                    case 1:
                        voteYes++;
                        break;
                    case 2:
                        voteNo++;
                        break;
                    default:
                        System.out.println("Ingrese un digito valido '(1, 2, 3)' ");
                }

                System.out.println("Por que partido va a votar?");
                System.out.println("1-PTN");
                System.out.println("2-PUNS");
                System.out.println("3-PAD");
                partidoOption = input.nextInt();

                switch (partidoOption) {

                    case 1:
                        System.out.println("Voto regristrado para PTN");
                        ptn++;
                        break;
                    case 2:
                        System.out.println("Voto regristrado para PUNS");
                        puns++;
                        break;
                    case 3:
                        System.out.println("Voto regristrado para PAD");
                        pad++;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida.");
                }
                
                //cons de datos
                System.out.println("A continuacion podra consultar los resultados de la encuesta: ");
                System.out.println("1-Partido liderando la encuesta");
                System.out.println("2-% a favor de cada partido (personas votantes)");
                System.out.println("3- % de votos nulos");
                System.out.println("4-% votos realizados");
                consDatos = input.nextInt();
                
                switch(consDatos) {
                    case 1:
                        if( ptn > puns ) {
                            System.out.println("PTN va liderando las votaciones");
                        }
                        else if (puns > ptn ) {
                            System.out.println("PUNS va liderando la encusta");
                        } else System.out.println("PAD es el lider de la encuesta.");
                        break;
                    
                }
    
            } else if (vote == 2) {
                System.out.println("Desea salir de la votacion? 1-SI / 2-NO");

                vote = input.nextInt();

                switch (vote) {
                    case 1:
                        System.out.println("Si desea votar, ingrese de nuevo al sistema.");
                        break;
                    case 2:
                        break;
                }
            }            
        } while (vote != 3);
    }
}
