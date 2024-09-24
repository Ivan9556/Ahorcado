/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author _ivn
 *
 */
public class Ahorcado {

    //Metodos
    
    //Metodo ganar
    public static boolean win(char[] array) {
        /*
        Recorremos un array para determinar si está vacío 
        Utilizamos un for each para comprobar los valores del array, no sus indices 
        */
        for (char res : array) {
            if (res == '\0') { //Por defecto los array tipo char[] el valor nulo se represeta '\0'
                return false;
            }
        }
        return true; //Si no hay '\0' (nulo) significa que está lleno
    }

    public static void main(String[] args) {
        //Método entrada de teclado
        Scanner sc = new Scanner(System.in);

        //Variables
        Jugador jugador = new Jugador(0);
        Console entrada = System.console();
        boolean salida = true;
        char[] respuesta = new char[6];

        //Bienvenida al pr1ograma a los jugadores 
        System.out.println("Bienvenido al juego del ahorcado");

        //Jugador 1 introduce una palabra al programa
        System.out.println("Juega con palabras de 6 letras");
        char[] palabra = entrada.readPassword("jugador 1 intruduce una palabra ");
        /*
        System.out.println("Introduce una palabra");
        String pa = sc.nextLine();
        //Pasamos ese String a un array de carácteres tipo char
        char[] palabra = pa.toCharArray();
        */
        //Comprobamos que esa palabra  cumpla con la norma establecida 
        if (palabra.length == 6) {
            System.out.println("La palabra es " + palabra[0] + " " + palabra[2] + " " + palabra[4] + " ");
        } else {
            System.out.println("No has introducido bien la palabra");
            System.exit(0);
        }

        //Agregamos a nuestro array vacio las primeras letras de la palabra
        respuesta[0] = palabra[0];
        respuesta[2] = palabra[2];
        respuesta[4] = palabra[4];

        //Comienza el juego
        while (salida) {

            //Jugador 2 introduce una letra
            System.out.println("Introduce una letra");
            String let = sc.nextLine();

            //Transformamos nuesta letra a un unico caracter
            char[] letra = let.toCharArray();

            //Comprobamos que la entrada ha sido una letra
            if (letra.length == 1) {

                //Declaramos variable booleana
                boolean palabraEncontrada = false;

                //Recorremos el primer array en busca de coincidencias     
                for (int c = 0; c < palabra.length; c++) {
                    /*Si existen, agregamos un nuevo caracter a nuestro array vació 
                    en la misma posición de nuestro primer array */
                    if (palabra[c] == letra[0]) {
                        palabraEncontrada = true;
                        respuesta[c] = palabra[c];
                    }
                }
                //Si no existen coincidencias el estado del jugador cambia
                if (!palabraEncontrada) {
                    jugador.setEstado(jugador.getEstado() + 1);
                }
                //Imprimimos el resultado por pantalla
                for (int i = 0; i < respuesta.length; i++) {
                    System.out.print(respuesta[i] + " ");
                }
                //Mostramos el estado del jugador
                System.out.println(" ");
                jugador.estadoJugador(jugador.getEstado());

            } else {
                System.out.println("No has introducido una letra");
            }

            //Fin del juego
            if (win(respuesta)) {
                System.out.println("Has ganado");
                salida = false;
            }

            if (jugador.getEstado() == 8) {
                System.out.println("Has perdido!");
                salida = false;
            }
        }
    }

}
