package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        // This is the second version using arrays.
	    double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = {'d', 'a', 's', 'm'};
//      Creates an array with the same length as opCodes.
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case  's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }
//    Print out each of the values in the results array.
        for(double theResult : results) {
            System.out.print("results = ");
            System.out.println(theResult);
        }
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


