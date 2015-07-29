package pack1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ShurikNote on 23.07.2015.
 */
public class Main {
    public double doubleA;
    public double doubleB;
    public double doubleResult;
    public float floatA,floatB,floatResult;
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);

        Main m = new Main();
        m.setParams(0.3,0.4,0.3f,0.4f);
        m.doublesumm(m.doubleA, m.doubleB);
        m.floatsumm(m.floatA, m.floatB);


        logger.info("Float result  a + b = " + m.floatResult);
        logger.info("Double result  a + b = " + m.doubleResult);


    }

    //intresting sample
    public void setParams (double doubleA, double doubleB, float floatA,float floatB ){
        this.doubleA = doubleA;
        this.doubleB = doubleB;
        this.floatA = floatA;
        this.floatB = floatB;
    }

    public void doublesumm(double a,double b) {
        this.doubleResult = a+b;
    }

    public void floatsumm(float a,float b) {
        this.floatResult = a+b;
    }

    }




