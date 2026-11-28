//Parameterized Constructor The Value Passed inside the brackets("Red")
class pens
{
    String color;
    pens(String c) // Parameterized Constructor( Takes Input)
    {
        color = c;
    }
}
public class Parameterized {
    public static void main(String[] args)
    {
        pens p1 = new pens("Red");
        pens p2 = new pens("Blue");
        System.out.println(p1.color);
        System.out.println(p2.color);
    }
}
// out put as
// Red
// Blue