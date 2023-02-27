import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlanetaTest {    
    Planeta Planeta1 = new Planeta("marte",50,1350);
    Planeta Planeta2 = new Planeta("saturno",1400,1400);

    @Test 
    public void testPlanetaEnano()
    {     



        int diametre = Planeta1.planetaEnano();
        assertEquals(1, diametre);

        int diametre2 = Planeta2.planetaEnano();
        assertEquals(0, diametre2);

    }    

    @Test 
    public void testExpansio()
    {

        Planeta1.expansio();
        assertEquals(150, Planeta1.getDiametre());

    }

    @Test 
    public void testColisio()
    {        

        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
