public class swapwithouttemp {
    public static void main(String[] args) {
        int a=14,b=52;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
