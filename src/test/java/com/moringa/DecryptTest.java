package com.moringa;
import org.junit.*;
import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class DecryptTest extends TestCase {
    @Test
    public void testDecrypt(){
        Decrypt app =new Decrypt();
        String enc=app.decrypt("cde 123 #$%",2);
        assertEquals("abc 123 #$%",enc);
    }
}