package tarea03;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Posicion {

    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;

        if ((fila >= 1 && fila <= 8) && (columna >= 'a' && columna <= 'h')) {
            this.fila = fila;
            this.columna = columna;
        } else {
            this.fila = 1;
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida.\n");
        }
    }

    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        if (fila >= 1 && fila <= 8) {
            this.fila = fila;
        } else if (fila < 1 || fila > 8) {
            this.fila = 1;
            System.out.printf("Error. No se ha insertado una posición válida para la fila.\n");
        }
    }

    public void setColumna(char columna) {
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else if (columna < 'a' || columna > 'h') {
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida para la columna.\n");
        }
    }
}
