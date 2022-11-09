import java.util.Scanner;

public class Faculty
{
    int facultyid;
     float salary;
}
class FulltimeFaculty extends Faculty
{
    float basic;
    float allowance;
    FulltimeFaculty( float basic,float allowance)
    {

        this.basic=basic;
        this.allowance=allowance;


    }
    float salaryF()
    {
        float salary1;
        salary1=basic+allowance;
        return salary1;

    }
     void display1()
    {
        System.out.println("Salary"+ salaryF());
    }
}
class ParttimeFaculty extends Faculty
{
    int hours;
    float rate;
    ParttimeFaculty(int hours,float rate)
    {
       this.hours=hours;
        this.rate=rate;


    }
    float salaryP()
    {
        float salary2;
        salary2=hours*rate;
        return salary2;
    }
     void display2()
    {

        System.out.println("salary"+salaryP());

    }
}
class DriverClass

{
    public static void main(String[]agr)
    {
        Scanner scn1= new Scanner(System.in);
        System.out.println("Enter basic salary and allowance");
        FulltimeFaculty S1=new FulltimeFaculty(scn1.nextFloat(),scn1.nextFloat());
        FulltimeFaculty S2=new FulltimeFaculty(scn1.nextFloat(),scn1.nextFloat());
        System.out.println("Enter Parttime hour and rate");
        ParttimeFaculty S3=new ParttimeFaculty(scn1.nextInt(),scn1.nextFloat());
        ParttimeFaculty S4=new ParttimeFaculty(scn1.nextInt(),scn1.nextFloat());

        S1.display1();
        S2.display1();
        S3.display2();
        S4.display2();

    }
}