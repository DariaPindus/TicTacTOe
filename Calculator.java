package ua.od.pindus;

public class Calculator {

    public int add(int op1, int op2){
        return op1+op2;
    }

    public int add(double op1, double op2){
        return (int) (op1+op2);
    }

    public int subtract(int op1, int op2){
        return op1-op2;
    }

    public int multiply(int op1, int op2){
        return op1*op2;
    }

    public int divide(int op1, int op2){
        return op1/op2;
    }

    public int square(int op){
        return op*op;
    }

    public static int execute (int a, int b){
        return a+b;
    }


}
