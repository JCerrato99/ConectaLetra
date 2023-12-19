package conectaLetra;
/**
 * Encargado de los objetos
 */
public class modelo {
	private char[][] tablero; // Representa el tablero del juego
    private boolean turnoJugador; // Indica de quién es el turno (true para jugador 1, false para jugador 2)

    public char[][] getTablero() {
        return tablero;
    }

    public boolean getTurnoJugador() {
        return turnoJugador;
    }
    
}
