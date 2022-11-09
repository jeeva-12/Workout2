import java.awt.*;



    class SwapByValue {



        public static void main(String[] args) {

           int num1 = 5;

           int num2 = 10;
           int temp;

            temp=num1;
            num1=num2;
            num2=temp;

            System.out.println("***After swapping***");

            System.out.println("Value of num1 is :" + num1);

            System.out.println("Value of num2 is :" + num2);

        }

    }


    class SwapByReference {

        public static void main(String[] args)
        {
            Point p1=new Point();
            p1.x=1;
            p1.y=2;
            System.out.println("x="+p1.x+"y= "+p1.y);
            change(p1);
            System.out.println("x="+p1.x+"y= "+p1.y);

        }
        public static void change(Point p)
        {
            p.x=2;
            p.y=1;
        }
    }

