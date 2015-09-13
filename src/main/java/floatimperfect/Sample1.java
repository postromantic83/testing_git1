package floatimperfect;

/**
 * Created by Sasha on 13.09.2015.
 */
public class Sample1 {

    private float inputA;
    private float inputB;
    private float floatResult;
    private double doubleResult;

    SampleFunc<Float> summFloat = (a,b)->{return a+b;};
    SampleFunc<Double> summDouble = (a,b)->{return a+b;};




    public Sample1 (float a, float b) {
        this.inputA=a;
        this.inputB=b;

    }

    public void calculate (){
        floatResult = summFloat.function(inputA,inputB);
        doubleResult=summDouble.function((double)inputA,(double)inputB);
    }

    public float getFloatResult(){
        return floatResult;
    }
    public double getDoubleResult(){
        return doubleResult;
    }






}
