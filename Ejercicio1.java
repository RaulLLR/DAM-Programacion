public class Ejercicio1 {
    public static void main(String[] args) {

        final int FILAS=3;
        final int COLUMNAS=3;
        int[][] matriz = new int [FILAS][COLUMNAS];
        int contador = 1;

        // Ahora vamos a rellenar la matriz con numeros del 1 al 9

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matriz [i][j] = contador++;
            }
        }

        //Ahora metemos código para poder mostrar la matriz 3x3

        System.out.println("Aquí está la matriz de 3x3");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }


    }
}
