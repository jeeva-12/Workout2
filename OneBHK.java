import java.util.Scanner;

public class OneBHK {
    private  double roomArea;
    private  double hallArea;
    private double price;

    OneBHK() {
        roomArea = 0;
        hallArea = 0;
        price = 0;
    }

    OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show()
    {
        System.out.println("\nRoom Area:" + roomArea + "\n Hall Area:" + hallArea + "\n Price:" + price);
    }
}

class TwoBHK extends OneBHK {
    private final double room2Area;

    TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show() {
        super.show();
        System.out.println("Room 2 Area:" + room2Area);
    }
}

class BkH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoBHK O1 = new TwoBHK(10, 10, 1500, 11);
        TwoBHK O2 = new TwoBHK(12, 14, 1700, 12);
        TwoBHK O3 = new TwoBHK(14, 16, 2000, 20);
        O1.show();
        O2.show();
        O3.show();
    }
}
