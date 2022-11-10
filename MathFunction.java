import java.util.Scanner;

public class MathFunction
{
   static float multiplication (int a,int b)
    {
        return (a*b);
    }
    static float multiplication(float a,float b)
    {
        return (a*b);
    }
    static float multiplication(float a,int b)
    {
        return a*b;
    }
    public static void main(String[]args)
    {
        System.out.println(multiplication(3,2));
        System.out.println(multiplication(.4f,4.5f));
        System.out.println(multiplication(.2f,2));
    }
}
