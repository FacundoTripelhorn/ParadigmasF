package Ejercicio3;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio3 {

    private int resultado;
    private int usuario;

    public int Juego(int x, int y) {
        do {
            if (x == 0 && y == 1) {
                resultado = y;
            } else if (x == 0 && y == 2) {
                resultado = x;
            }
            if (x == 1 && y==2) {
                resultado =  y;
            } else if (x==1 && y==0) {
                resultado = x;
            }
            if (x==2 && y==0) {
                resultado = y;
            } else if (x==2 && y==1) {
                resultado = x;
            }
        } while (x==y);
        return resultado;
    }

    public void main(String[] args) {

        System.out.println("Ingrese una opción: ");
        String opcionUsuario = "";
        Scanner usuarioScanner = new Scanner(System.in);
        opcionUsuario = usuarioScanner.nextLine();

        if (opcionUsuario=="Piedra") {
           usuario=0 ;
        } else if (opcionUsuario=="Papel") {
           usuario=1;
        } else if (opcionUsuario=="Tijeras") {
          usuario=2;
        }

        int consola = new Random().nextInt(3);
        System.out.printf("El ganador es \"" + Juego(usuario,consola) + "\"");
    }
}
