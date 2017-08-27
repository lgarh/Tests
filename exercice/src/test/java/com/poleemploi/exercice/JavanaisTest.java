package com.poleemploi.exercice;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple JavanaisTest.
 */
public class JavanaisTest 
    extends TestCase
{
	
    
	public void testGetJavanaisMsg()
    {
    	Javanais javanais = new Javanais();
       Assert.assertEquals("bavonjavour", javanais.getJavanaisMsg("bonjour"));
       Assert.assertEquals("chavantave", javanais.getJavanaisMsg("chante"));
       Assert.assertEquals("mavoyen", javanais.getJavanaisMsg("moyen"));
       Assert.assertEquals("avexavemplave", javanais.getJavanaisMsg("exemple"));
       Assert.assertEquals("avau", javanais.getJavanaisMsg("au"));
       Assert.assertEquals("BavonjavOur", javanais.getJavanaisMsg("BonjOur"));
    }

    
    public void  testGetFrenchMsg()
    {
    	Javanais javanais = new Javanais();
    	Assert.assertEquals("bonjour", javanais.getFrenchMsg("bavonjavour"));
        Assert.assertEquals("chante", javanais.getFrenchMsg("chavantave"));
        Assert.assertEquals("moyen", javanais.getFrenchMsg("mavoyen"));
        Assert.assertEquals("exemple", javanais.getFrenchMsg("avexavemplave"));
        Assert.assertEquals("au", javanais.getFrenchMsg("avau"));
        Assert.assertEquals("aU", javanais.getFrenchMsg("avaU"));
    }
}
