// Default(No Argument) Constructor
class pen
{
    String color;
    // Default Constructor (Empty Brackets)
    pen()
    {
       color = "Blue";
    }
}
public class DefaultConstructor
{
    public static void main(String[] args)
    {
        pen p1 = new pen(); // calls Default Constructor
        System.out.println(p1.color); // output : Blue
    }

}
