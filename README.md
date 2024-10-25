# Juego de Adivinación

## Descripción

Este es un sencillo juego de adivinación de números desarrollado en Java. El programa genera un número aleatorio entre 1 y 100, y el jugador tiene 5 intentos para adivinarlo. Después de cada intento, el programa dará una pista indicando si el número ingresado es mayor o menor que el número aleatorio.

## Idea del Proyecto

La idea detrás de este proyecto es crear un sencillo juego de adivinación en el que el usuario intenta adivinar un número generado aleatoriamente por el programa. El número está entre 1 y 100, y el usuario tiene cinco intentos para adivinarlo correctamente. Después de cada intento, el programa le dice al usuario si el número ingresado es mayor o menor que el número secreto, brindando una pista para el siguiente intento. El objetivo es que el usuario logre adivinar el número dentro del límite de intentos, proporcionando una experiencia divertida y desafiante.

## Lenguaje de Programación: Java

### ¿Por qué Java?

Java es un lenguaje de programación ampliamente utilizado y conocido por su portabilidad, gracias al lema "write once, run anywhere" (escribe una vez, ejecuta en cualquier lugar). Esto se debe a que Java compila en un bytecode que puede ser ejecutado en cualquier máquina que tenga la Java Virtual Machine (JVM).

### Características de Java:

- **Orientado a Objetos**: Java es un lenguaje de programación orientado a objetos (OOP), lo que significa que se basa en conceptos de "clases" y "objetos" para estructurar el código.
- **Portabilidad**: Como mencioné antes, el código Java se compila en bytecode, que puede ejecutarse en cualquier JVM independientemente del sistema operativo.
- **Seguridad**: Java tiene características incorporadas que ayudan a crear aplicaciones seguras, como la gestión de memoria automática y la verificación de bytecode.
- **Amplia Biblioteca Estándar**: Java cuenta con una amplia biblioteca estándar (Java API) que proporciona muchas funcionalidades listas para usar, desde la manipulación de cadenas y colecciones hasta la creación de interfaces gráficas de usuario.

### Aplicación en Este Proyecto:

En este proyecto, Java se utiliza para:
- **Generación de Números Aleatorios**: La clase `Random` se utiliza para generar el número aleatorio que el usuario debe adivinar.
- **Entrada del Usuario**: La clase `Scanner` se utiliza para leer la entrada del usuario desde la consola.
- **Control de Flujo**: Se utiliza un bucle `while` para permitir que el usuario adivine hasta cinco veces y estructuras de control `if-else` para brindar pistas y mensajes basados en las conjeturas del usuario.

## Instrucciones

1. Clona este repositorio.
    ```sh
    git clone https://github.com/Nerug-Programador/juego-de-adivinacion.git
    ```
2. Navega al directorio del proyecto.
    ```sh
    cd nombre-repositorio
    ```
3. Compila y ejecuta el programa.
    ```sh
    javac Juego.java
    java Juego
    ```

## Requisitos Java JDK 8 o superior

    Un entorno de desarrollo (IDE) como IntelliJ IDEA, Eclipse, o simplemente un editor de texto y la terminal.

    Autor William Aranguren - https://github.com/Nerug-Programador

## Licencia

    Este proyecto no tiene una licencia específica.

## Ejemplo de Código

```java
import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) + 1; // Ajustado para estar entre 1 y 100
        int numeroDeIntentos = 0;
        boolean acertado = false;

        System.out.print("""
                **************************************************************************************
                Adivina el número que se generó aleatoriamente,
                este está entre 1 y 100, tendrás 5 intentos.
                **************************************************************************************
                """);

        while (numeroDeIntentos < 5) {
            System.out.print("Ingresa un número: ");
            int numeroUsuario = entradaUsuario.nextInt();
            numeroDeIntentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.printf("Felicidades, acertaste el número en tan solo %d intento%s.\n", numeroDeIntentos, numeroDeIntentos == 1 ? "" : "s");
                acertado = true;
                break;
            } else if (numeroDeIntentos < 5) {
                System.out.println("El número es " + (numeroUsuario < numeroAleatorio ? "mayor" : "menor") + ", inténtalo de nuevo");
            }
        }

        if (!acertado) {
            System.out.println("Es una lástima, no lograste adivinar el número. Tal vez a la próxima.");
        }
    }
}