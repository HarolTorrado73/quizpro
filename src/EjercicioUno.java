import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        //iniciando programa
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();
        generarPatron(n);
    }

    public static void generarPatron(int n) {
        for (int i = n; i >= 1; i--) {
            StringBuilder linea = new StringBuilder();

            // Agregar espacios en blanco al principio de la línea
            for (int j = 1; j < i; j++) {
                linea.append("  ");
            }

            // Generar la secuencia de números en aumento
            for (int j = i; j <= n; j++) {
                linea.append(j).append(" ");
            }

            // Generar la secuencia de números en descenso
            for (int j = n - 1; j >= i; j--) {
                linea.append(j).append(" ");
            }

            System.out.println(linea.toString().trim());
        }
    }
}


/*
Este programa es para que por medio de un numeror escrito por un usuario que sea entero positivo donde generara forma geometrica en forma de triangulo
de forma que seran linea con numeros que iran disminuyendo entre fila y fila hasta el numero de lineas escrito por el usuario
*/