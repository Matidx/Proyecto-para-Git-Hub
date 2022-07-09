import java.util.Scanner;

public class Jugador {
    public String nombre;
    public Valores ficha;

    public void jugar() {
        Scanner entrada = new Scanner(System.in);

        int f = 0;
        int c = 0;
        System.out.println("Ingrese un numero del 1 al 9: ");
        int jugada = entrada.nextInt();

        switch (jugada) {
            case 1: f=2; c=0; break;
            case 2: f=2; c=1; break;
            case 3: f=2; c=2; break;

            case 4: f=1; c=0; break;
            case 5: f=1; c=1; break;
            case 6: f=1; c=2; break;

            case 7: f=0; c=0; break;
            case 8: f=0; c=1; break;
            case 9: f=0; c=2; break;

            default:
                System.out.println("El valor es incorrecto");
                break;
        }
    }
}