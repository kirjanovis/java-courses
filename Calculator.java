public class Calculator {
    private double result;

    public void sum(double a, double b)
    {
        result = a + b;
    }
    public void subtraction(double a, double b)
    {
        result = a - b;
    }
    public void multiplication(double a, double b)
    {
        result = a * b;
    }
    public void division(double a, double b)
    {
        result = a / b;
    }
    public void exponentiation(double a, double b)
    {
        result = Math.pow(a,b);
    }

    public double getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
    
}