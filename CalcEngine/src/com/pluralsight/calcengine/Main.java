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

        System.out.println();
        System.out.println("Using overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        // Executing with doubles and ints.
        // When passing ints into the execute method with parameters set as doubles, it still works. However, the values are "widened". The return value will be a double.
        equationOverload.execute( leftDouble, rightDouble );
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        // It's better to create a separate overload method that handles the specific data-type.
        equationOverload.execute( leftInt, rightInt );
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        // When running this, a double cannot be passed and converted to an int.
        // So, Java will choose the next acceptable overload that will accept both parameters.
        equationOverload.execute( (double)leftInt, rightInt );
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
    }
}

