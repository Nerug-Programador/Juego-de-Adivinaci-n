import java.util.Random; // Importa la clase Random para generar números aleatorios
import java.util.Scanner; // Importa la clase Scanner para recibir entrada del usuario

public class Juego {
    public static void main(String[] args){
        // Crea un nuevo objeto Scanner para leer la entrada del usuario
        Scanner entradaUsuario = new Scanner(System.in);

        // Genera un número aleatorio entre 1 y 100
        int numeroAleatorio = new Random().nextInt(100) + 1;

        // Inicializa el contador de intentos
        int numeroDeIntentos = 0;

        // Variable para verificar si el usuario acertó
        boolean acertado = false;

        // Muestra las instrucciones del juego
        System.out.print("""
                **************************************************************************************
                Adivina el número que se generó aleatoriamente,
                este está entre 1 y 100, tendrás 5 intentos.
                **************************************************************************************
                """);

        // Bucle que permite al usuario intentar adivinar el número hasta 5 veces
        while (numeroDeIntentos < 5) {
            System.out.print("Ingresa un número: ");

            // Lee el número ingresado por el usuario
            int numeroUsuario = entradaUsuario.nextInt();

            // Incrementa el contador de intentos
            numeroDeIntentos++;

            // Verifica si el número ingresado es igual al número aleatorio
            if (numeroUsuario == numeroAleatorio) {
                // Imprime mensaje de éxito en singular o plural según el número de intentos
                System.out.printf("Felicidades, acertaste el número en tan solo %d intento%s.\n", numeroDeIntentos, numeroDeIntentos == 1 ? "" : "s");
                acertado = true; // Marca que el usuario acertó
                break; // Sale del bucle porque el usuario acertó
            } else if (numeroDeIntentos < 5) {
                // Da una pista indicando si el número ingresado es mayor o menor que el número aleatorio
                System.out.println("El número es " + (numeroUsuario < numeroAleatorio ? "mayor" : "menor") + ", inténtalo de nuevo");
            }
        }

        // Si el usuario no acertó después de 5 intentos, muestra un mensaje de pérdida
        if (!acertado) {
            System.out.println("Es una lástima, no lograste adivinar el número. Tal vez a la próxima.");
        }
    }
}