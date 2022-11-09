package medicine;

public class Medicine
{
    public void displayLabel()
    {
        System.out.println("Compnay Name: Jothyi Labs");
        System.out.println("Address:Ravipuram");
    }
}
class Tablet extends Medicine
{
    public void displayLabel()
    {
        System.out.println("store in a cool place");
    }
}
class Syrup extends Medicine
{
    public void displayLabel()
    {
        System.out.println("Consumption as directed by the physician");
    }
}
class Ointment extends Medicine
{
    public void displayLabel()
    {
        System.out.println("for external use only");
    }
}
