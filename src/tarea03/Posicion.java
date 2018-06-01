package tarea03;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Posicion {

    private int fila;
    private char columna;

    /**
     * @param fila nos devolverá la fila desde el numero 1 al 8
     * @param columna nos devolverá la columna de la letra 'a' a la 'h'
     */
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

    /**
     * @return nos devolverá la posición de la fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @return nos devolverá la posición de la columna
     */
    public char getColumna() {
        return columna;
    }

    /**
     * @param fila será comprobada para que esté entre el número '1' y el '8'
     */
    public void setFila(int fila) {
        if (fila >= 1 && fila <= 8) {
            this.fila = fila;
        } else if (fila < 1 || fila > 8) {
            this.fila = 1;
            System.out.printf("Error. No se ha insertado una posición válida para la fila.\n");
        }
    }

    /**
     * @param columna será comprobado para que esté entre la letra 'a' y la letra 'h'
     */
    public void setColumna(char columna) {
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else if (columna < 'a' || columna > 'h') {
            this.columna = 'a';
            System.out.printf("Error. No se ha insertado una posición válida para la columna.\n");
        }
    }

    /**
     * @return nos devolverá la posición de la columna y de la fila en forma de String
     */
    @Override
    public String toString() {
        return String.format("Fila: %d, Columna: %s%n", fila, columna);
    }
}
