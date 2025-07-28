public class P2{
    int number1;
    int number2;
    void add(int n1, int n2)
    {
        number1 = n1;
        number2 = n2;
        System.out.println("Addition    :   "+ (number1+number2));
    }
    public static void main(String []args)
    {
        P2 p = new P2();
        p.add(10,20);
    }
}