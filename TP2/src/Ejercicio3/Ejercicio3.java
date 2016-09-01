package Ejercicio3;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Facu on 1/9/2016.
 */
public class Ejercicio3 {
    public static String resultado;
    public static String opcionConsola;

    public static String Juego(String x, String y) {
        if (x==y) {
            resultado = "Empate";
        }
        do {
            if (x == "Piedra" && y == "Papel") {
                resultado = "Ganó la consola con \"" + y +"\"";
            } else if (x == "Piedra" && y == "Tijeras") {
                resultado = "Ganó el usuario con \"" + x +"\"";
            }
            if (x == "Papel" && y=="Tijeras") {
                resultado =  "Ganó la consola con \"" +y +"\"";
            } else if (x=="Papel" && y=="Piedra") {
                resultado = "Ganó el usuario con \"" + x +"\"";
            }
            if (x=="Tijeras" && y=="Piedra") {
                resultado = "Ganó la consola con \"" +y +"\"";
            } else if (x=="Tijeras" && y=="Papel") {
                resultado = "Ganó el usuario con \"" + x +"\"";
            }
        } while (x!=y);
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println("Ingrese una opción: ");
        String opcionUsuario = "";
        Scanner usuarioScanner = new Scanner(System.in);
        opcionUsuario = usuarioScanner.nextLine();

        int consola = new Random().nextInt(3);
        if (consola==0){
            opcionConsola="Piedra";
        } else if (consola==1){
            opcionConsola="Papel";
        }else if (consola==2){
            opcionConsola="Tijeras";
        }
        System.out.println("La consola eligió \"" + opcionConsola + "\"");
        String res= Juego(opcionUsuario, opcionConsola);
        System.out.println("El ganador es " + res);

    }
}
