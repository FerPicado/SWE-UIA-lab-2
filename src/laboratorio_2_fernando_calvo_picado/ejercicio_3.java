package laboratorio_2_fernando_calvo_picado;

import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //var
        int opt = 0, optPriorityCarta = 0, optPriorityBox = 0;

        do {
            System.out.println("Sistema para realizar envios");
            System.out.println("Seleccione el tipo de envio: 1-Carta, 2-Caja");
            opt = input.nextInt();

            if (opt == 1) {
                System.out.println("Selecione la prioridad de envio de su carta: ");
                System.out.println("1-Prioridad A ($2000/gramo)");
                System.out.println("2-Prioridad B ($1500/gramo)");
                System.out.println("3-Prioridad C ($1000/gramo)");
                optPriorityCarta = input.nextInt();

                switch (optPriorityCarta) {
                    case 1:
                        System.out.println("Prioridad A");
                        break;
                    case 2:
                        System.out.println("Prioridad B");
                        break;
                    case 3:
                        System.out.println("Prioridad C");
                }
            } 
            
            else if (opt == 2) {
                System.out.println("Selecione la prioridad de envio de su caja: ");
                System.out.println("1-Prioridad A ($2000/gramo)");
                System.out.println("2-Prioridad B ($1500/gramo)");
                System.out.println("3-Prioridad C ($1000/gramo)");
                optPriorityBox = input.nextInt();
                
                switch (optPriorityBox) {
                    case 1:
                        System.out.println("Prioridad A");
                        break;
                    case 2:
                        System.out.println("Prioridad B");
                        break;
                    case 3:
                        System.out.println("Prioridad C");
                }
            }
            
            System.out.println("Desea realizar un nuevo envio? 1-SI, 2-NO");
            opt = input.nextInt();

        } while (opt != 3);

    }
}
