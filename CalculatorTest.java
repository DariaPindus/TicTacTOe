package ua.od.pindus;

public class CalculatorTest {
    public static void main(String[] args) {
        /*Calculator calc=new Calculator();
        int result=calc.execute(4, 1, "add");
        System.out.println(result);*/
        int resultFromStatic=Calculator.execute(7, 3);
        System.out.println(resultFromStatic);
    }
}
