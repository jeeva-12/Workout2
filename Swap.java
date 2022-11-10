class   Variables
{
    int a=30;
    int b=20;
}
    public class Swap
    {



         static void swap(int a,int b)
         {
             System.out.println("Value before Swaping:a= "+a+"b="+b);

           int t=a;
           a=b;
           b=t;
           System.out.println("After swaping:a="+a+"b="+b);

        }
        public static void main(String[] args)
        {
            System.out.println("Call by Value\n*************************");
            int a=50;
            int b=80;
            swap(a,b);

            System.out.println("******************************\n Call by Reference");
            Variables o1=new Variables();
            swap(o1.a,o1.b);
        }

    }


