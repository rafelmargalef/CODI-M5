/**
 * Esta clase contiene los atributos y metodos de un empleado
 * @author Rafel Margalef Talarn
 * @version: 22/09/2016/A
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckNumberTest {
    /**
     * @param args
     */
    @Test
    public void testValorPositiu() {
            /**
     * Aquest test prova si al donar-li un nombre mes gran que 0 et torna un 1
     * @param ChecKNumber Numero comprovacio
     */ 
        CheckNumber check = new CheckNumber(50);
        double val = check.comprovaSigne();
        assertEquals(1.0, val, 0.0);
    }
    @Test
    public void testValorNegatiu() {
                    /**
     * // Aquest test prova si al donar-li al programa un nombre mes petit que el 0 ens dona un -1
     * @param CheckNumber Numero de comprovacio
     */ 

        CheckNumber check = new CheckNumber(-30);
        double val = check.comprovaSigne();
        assertEquals(-1.0, val, 0.0);
    }
    @Test
    public void testValorZero() {
        
        // Aquest test prova si al donar-li al programa un nombre igual que el 0 et torna un 0
        CheckNumber check = new CheckNumber(0);
        double val = check.comprovaSigne();
        assertEquals(0.0, val, 0.0);
    }
}
