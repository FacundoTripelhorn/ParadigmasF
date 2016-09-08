package ejercicio7;

/**
 * Created by Facu on 7/9/2016.
 */
public class Ejercicio7 {

    private String respuesta;
    public String rectangulos(int[] primero,int[] segundo){
        if (primero[0]>=segundo[0]&primero[1]>=segundo[1]){
            respuesta="Encajan sin girar";
        } else if (primero[0]>=segundo[0] & primero[0]>=segundo[1]){
           respuesta = "Encajan girando";
        }else if(primero[0]<segundo[0]&primero[1]>segundo[1]){
            respuesta ="No encajan";
        }

        if (primero[0]<=segundo[0]&primero[1]<=segundo[1]){
            respuesta="Encajan sin girar";
        } else if (primero[0]<=segundo[0] & primero[0]<=segundo[1]){
            respuesta = "Encajan girando";
        }else if(primero[0]>segundo[0]&primero[1]<segundo[1]){
            respuesta ="No encajan";
        }
        return respuesta;
    }
}
