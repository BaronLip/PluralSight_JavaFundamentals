package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        // This is the second version using arrays.
//	    double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
//        double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
//        char[] opCodes = {'d', 'a', 's', 'm'};
//      Creates an array with the same length as opCodes.
//
//        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];

        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0, 'm');



        for(MathEquation equation : equations) {
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.result);
        }
    }

    public static MathEquation create (double leftVal, double rightVal, char opCode) {
         MathEquation equation = new MathEquation();

         equation.leftVal = leftVal;
         equation.rightVal = rightVal;
         equation.opCode = opCode;

         return equation;
    }


}
//        // This was the first version of calcengine.
//        double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result;
//        char opCode = 'd';
//
//        if ( opCode == 'a')
//            result = val1 + val2;
//        else if ( opCode == 's')
//            result = val1 - val2;
//        else if ( opCode == 'd') {
//            result = val2 != 0.0d ? val1 / val2 : 0.0d;
//            }
//        else if (opCode == 'm')
//            result = val1 * val2;
//        else {
//            System.out.println("Error - invalid opCode");
//            result = 0.0d;
//        }
//        System.out.println(result);


