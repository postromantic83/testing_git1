package pack1;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;



/**
 * Created by ShurikNote on 27.07.2015.
 */
public class MainTest {

    public static final float DELTA = 0.00000005f;
    public static final double DELTA2 = 0.0;
        private  double doubleA;
        private  double doubleB;
        private  double doubleResult;
        private  float floatA, floatB, floatResult;
        Main m;

    @Before
    public void setUp(){
        m = new Main();
        m.setParams(0.8,0.2,0.8f,0.2f);
        }

    @Test
    public void returnsInvalidFloatResult () {

       m.floatsumm(m.floatA, m.floatB);
       assertEquals("Ничоси!",1.0f,m.floatResult , DELTA);
    }
    @Test
    public void returnsInvalidDoubleResult() {


        m.doublesumm(m.doubleA, m.doubleB);
        assertEquals("Ничоси!",1.0,m.doubleResult , DELTA2);
    }

}