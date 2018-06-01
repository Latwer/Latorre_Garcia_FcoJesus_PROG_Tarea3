package tarea03;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Rey {

    private Color color;
    private Posicion posicion;

    /**
     * @param color donde estableceremos el lugar donde se situará el rey por
     * defecto dependiendo si es blanco o negro
     */
    public Rey(Color color) {
        this.color = color;
        switch (color) {
            case BLANCO:
                posicion = new Posicion(1, 'e');
                break;
            case NEGRO:
                posicion = new Posicion(8, 'e');
                break;
        }
    }

    /**
     * parametro por defecto
     */
    public Rey() {
        this.color = Color.BLANCO;
        posicion = new Posicion(1, 'e');
    }

    /**
     * @return el color del rey
     */
    public Color getColor() {
        return color;
    }

    /**
     * @return la posicion del rey
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * @return el color y la posicion del rey en forma de String
     */
    @Override
    public String toString() {
        return String.format("Color: %s, Posicion: %s%n", color, posicion);
    }

    /**
     * @param direccion Donde hará que se pueda mover dicho rey por el tablero
     */
    public void mueve(Direccion direccion) {
        int fila = posicion.getFila();
        char columna = posicion.getColumna();

        switch (direccion) {
            case NOROESTE:
                direccion = Direccion.NOROESTE;
                posicion.setFila(fila + 1);
                posicion.setColumna((char) (columna - 1));
                break;
            case NORTE:
                direccion = Direccion.NORTE;
                posicion.setFila(fila + 1);
                posicion.setColumna((char) (columna));
                break;
            case NORESTE:
                direccion = Direccion.NORESTE;
                posicion.setFila(fila + 1);
                posicion.setColumna((char) (columna + 1));
                break;
            case OESTE:
                direccion = Direccion.OESTE;
                posicion.setFila(fila);
                posicion.setColumna((char) (columna - 1));
                break;
            case ESTE:
                direccion = Direccion.ESTE;
                posicion.setFila(fila);
                posicion.setColumna((char) (columna + 1));
                break;
            case SUROESTE:
                direccion = Direccion.SUROESTE;
                posicion.setFila(fila - 1);
                posicion.setColumna((char) (columna - 1));
                break;
            case SUR:
                direccion = Direccion.SUR;
                posicion.setFila(fila - 1);
                posicion.setColumna((char) (columna));
                break;
            case SURESTE:
                direccion = Direccion.SURESTE;
                posicion.setFila(fila - 1);
                posicion.setColumna((char) (columna + 1));
                break;

        }
    }
}
