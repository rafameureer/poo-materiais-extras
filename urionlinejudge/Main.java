import java.util.Scanner;
import java.io.IOException ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner s = new Scanner(System.in);
        int A, B, X;

        A = Integer.parseInt(s.next());
        B = Integer.parseInt(s.next());

        X = A + B;

        System.out.printf("X = %d\n", X);
 
    }
 
}
