package Ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Facu on 31/8/2016.
 */
public class Ejercicio3Test {
    private Ejercicio3 Ejercicio3;

    @Before
    public void setUp() throws Exception {
this.Ejercicio3 = new Ejercicio3();
    }

    @Test
    public void juego() throws Exception {
        Assert.assertTrue(0==Ejercicio3.Juego(2,0));
    }


}