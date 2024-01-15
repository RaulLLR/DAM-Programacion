import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        final int FILAS=5;
        int columnas;
        Scanner check = new Scanner(System.in);


        System.out.println("Tu tablero tiene 5 filas pero, ¿Cuantas columnas tiene?");
        columnas=check.nextInt();
        System.out.println("Ok, tu tablero tiene " +columnas+ " columnas");
        int tablero [][] = new int[FILAS][columnas];

        for (int i=0; i<5; i++) {
            for (int j=0; j<columnas; j++) {
              tablero [i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("La matriz generada es: ");
        for (int i=0; i<5; i++) {
            for (int j=0; j<columnas; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }





    }
}
