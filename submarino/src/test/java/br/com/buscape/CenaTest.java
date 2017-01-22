package br.com.buscape;

import junit.framework.Assert;
import org.junit.Test;

public class CenaTest {

    @Test
    public void cenaExemplo() {
        Cena cena = new Cena("RMMLMMMDDLL");
        Assert.assertEquals(cena.toString(), "2 3 -2 SUL");
    }
    
    @Test
    public void cenaGirando() {
        Cena cena = new Cena("RMRMRMRM");
        Assert.assertEquals(cena.toString(), "0 0 0 NORTE");
    }

    @Test
    public void cenaSubindo() {
        Cena cena = new Cena("UDUUUUUUDDD");
        Assert.assertEquals(cena.toString(), "0 0 -3 NORTE");
    }

}
