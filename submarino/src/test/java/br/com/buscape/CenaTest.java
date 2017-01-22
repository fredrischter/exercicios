package br.com.buscape;

import junit.framework.Assert;
import org.junit.Test;

public class CenaTest {

    @Test
    public void cenaSimples() {
        Assert.assertEquals("aaa", "aaa");
    }
    
    @Test
    public void cenaGirando() {
        Assert.assertEquals("123123", "123123");
    }

}
