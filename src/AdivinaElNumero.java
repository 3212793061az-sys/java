import java.util.Random;
import java.util.Scanner;
public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        System.out.println("DEBUG: " + numeroSecreto);
        int intento;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("🎮 Bienvenido al juego: Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100...");

        while (!adivinado) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("📉 El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("📈 El número es menor.");
            } else {
                adivinado = true;
                System.out.println("🎉 ¡Correcto! Adivinaste en " + intentos + " intentos.");
            }
        }

        scanner.close();
        System.out.println("👋 Gracias por jugar.");
    }
}