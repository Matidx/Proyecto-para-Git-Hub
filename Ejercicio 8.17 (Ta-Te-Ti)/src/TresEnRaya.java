import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        tablero.imprimirTablero();
        System.out.println(tablero.ganar());
    }
}