interface Movie
{
    void Fight();
    void Comedy();
}

public class Interface implements Movie
{
    public void Fight()
    {
        System.out.println("Youth");
    }

    public void Comedy()
    {
        System.out.println("Kithakithalu");
    }

    public static void main(String[] args)
    {
        Interface obj = new Interface();
        obj.Fight();
        obj.Comedy();
    }
}