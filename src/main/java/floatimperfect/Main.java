package floatimperfect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ShurikNote on 23.07.2015.
 */
public class Main {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);
        Sample1 sample1 = new Sample1(0.3f,0.4f);
        sample1.calculate();



        logger.info("a + b=" + sample1.getFloatResult());
       // System.out.println(sample1.getFloatResult());
   


    }



}
