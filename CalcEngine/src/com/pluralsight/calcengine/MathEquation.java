package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    // ADDING CONSTRUCTORS:
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    

    // GETTER METHODS:
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

    // SETTER METHODS:
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
