package com.pluralsight.calcengine;

// THIS IS A CLASS OF MATHEQUATION.
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    // ADDING CONSTRUCTORS:
    // You need a different constructor, with varying parameters, for every condition this class would be created.
    // Once a creator with a parameter is created, you also will need to explicitly write out the default constructor.
    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal ) {
        this(opCode); // This calls the above constructor with only opCode as a parameter.
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    // ACCESSOR/GETTER METHODS:
    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public double getResult() {
        return result;
    }

    // MUTATOR/SETTER METHODS:
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }

    public void setOpCode( char opCode ) {
        this.opCode = opCode;
    }




    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }

}
