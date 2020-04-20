package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.print("test=");
        System.out.println(testEquation.getResult());


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d );
        equations[3] = new MathEquation('m', 11.0d, 3.0);

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.getResult());
        }
    }
//      THE CREATE METHOD IS NO LONGER NEEDED SINCE CONSTRUCTORS ARE IN MATHEQUATION CLASS.
//    public static MathEquation create (double leftVal, double rightVal, char opCode) {
//         MathEquation equation = new MathEquation();
//
//         equation.setLeftVal(leftVal);
//         equation.setRightVal(rightVal);
//         equation.setOpCode(opCode);
//
//         return equation;
//    }
}

