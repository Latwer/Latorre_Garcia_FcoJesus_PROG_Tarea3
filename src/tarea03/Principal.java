package tarea03;

import utilidades.Entrada;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Principal {

    public static void main(String[] args) {
        int color = 1, movimiento;
        boolean salir = false;
        Rey rey = null;

        do {
            System.out.printf("Para Rey Blanco introduzca 1. %nPara Rey Negro introduzca 2. %n");
            color = Entrada.entero();
        } while (color != 1 && color != 2);

        if (color == 1) {
            rey = new Rey(Color.BLANCO);
            System.out.println("Su rey es blanco");
        } else if (color == 2) {
            rey = new Rey(Color.NEGRO);
            System.out.println("Su rey es negro");
        }

        while (!salir) {
            System.out.printf("Tecleé una dirección %n1: NOROESTE, 2: NORTE, 3: NORESTE, 4: OESTE, 5: ESTE, 6: SUROESTE, 7: SUR, 8: SURESTE y 9: SALIR %n");
            movimiento = Entrada.entero();

            switch (movimiento) {
                case 1:
                    System.out.println("Una casilla dirección NOROESTE");
                    rey.mueve(Direccion.NOROESTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 2:
                    System.out.println("Una casilla dirección NORTE");
                    rey.mueve(Direccion.NORTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 3:
                    System.out.println("Una casilla dirección NORESTE");
                    rey.mueve(Direccion.NORESTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 4:
                    System.out.println("Una casilla dirección OESTE");
                    rey.mueve(Direccion.OESTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 5:
                    System.out.println("Una casilla dirección ESTE");
                    rey.mueve(Direccion.ESTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 6:
                    System.out.println("Una casilla dirección SUROESTE");
                    rey.mueve(Direccion.SUROESTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 7:
                    System.out.println("Una casilla dirección SUR");
                    rey.mueve(Direccion.SUR);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 8:
                    System.out.println("Una casilla dirección SURESTE");
                    rey.mueve(Direccion.SURESTE);
                    System.out.printf("Rey %s: %s%n", rey.getColor(), rey.getPosicion());
                    break;
                case 9:
                    System.out.println("HAS SELECCIONADO SALIR");
                    System.out.printf("La última posición del Rey %s es: %s%n", rey.getColor(), rey.getPosicion());
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR. Introduzca solo del 1 al 9");
            }
        }
    }

}
