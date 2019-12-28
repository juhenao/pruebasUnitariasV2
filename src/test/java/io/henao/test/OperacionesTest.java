package io.henao.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {
    private Operaciones op;

    @Before
    public void setup(){
        op = new Operaciones();
    }

    @Test
    public void sumaTest(){
        Assert.assertEquals("La suma es diferente, ERROR :c", 11, op.sumar(5,6));
    }

    @Test
    public void podriaHacerRestaTest(){
        Assert.assertEquals("La resta no corresponde al resultado", 5, op.resta(15, 10));
    }

    @Test
    public void podriaHacerMultiplicacionTest(){
        Assert.assertEquals("La multiplicación no corresponde al resultado", 10, op.multiplicar(2, 5));
    }

    @Test
    public void podriaHacerDivisionTest(){
        Assert.assertEquals("La división no corresponde al resultado", 5, op.dividir(10,2));
    }
}
