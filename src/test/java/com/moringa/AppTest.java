package com.moringa;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testEncrypt(){
        App app =new App();
        String enc=app.encrypt("abc 123 #$%",2);
        assertEquals("cde 123 #$%",enc);
    }
    @Test
    public void testDecrypt(){
        App app =new App();
        String enc=app.decrypt("cde 123 #$%",2);
        assertEquals("abc 123 #$%",enc);
    }

}
