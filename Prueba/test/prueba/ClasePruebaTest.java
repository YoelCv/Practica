/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yoel
 */
public class ClasePruebaTest {
    
    public ClasePruebaTest() {
    }

    @Test
    public void testSomeMethod() {
        ClasePrueba fb = new ClasePrueba();
        String result = fb.ClasePrueba(3);
        assertEquals("fizz",result);
    }
    
}
