package com.moringa;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptTest extends TestCase {
    @Test
    public void testEncrypt(){
        Encrypt app =new Encrypt();
        String enc=app.encrypt("abc 123 #$%",2);
        assertEquals("cde 123 #$%",enc);
    }

}