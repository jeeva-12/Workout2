import java.util.Scanner;

public class Tile
{
    private int edge;
    private int area;

    Tile(int edge)
    {
        this.edge=edge;
        this.area=edge*edge;
    }
    int getArea()
    {
        return area;
    }
}
class Floor
{
    private int length;
    private int width;

    Floor(int length,int width)
    {
        this.length=length;
        this.width=width;

    }
    void totalTiles(Tile t)
    {
        double tileArea=t.getArea();
        double floorArea=length*width;
        double noOfTiles=floorArea/tileArea;
        System.out.println("Number of Tiles:"+ noOfTiles);
    }

}
class T32
{
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Tile: ");
        int tilelength = sc.nextInt();
        Tile t = new Tile(tilelength);
        System.out.println("Enter the length and width of floor: ");
        int fLength = sc.nextInt();
        int fwidth = sc.nextInt();

        Floor f = new Floor(fLength, fwidth);
        f.totalTiles(t);
    }
}