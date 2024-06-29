public class swap {
    public static void main(String[] args) {
        int a=50,b=100,c=12,d=23;
        System.out.println("before swap");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c="+c);
        System.out.println("d="+d);

        int temp=a;
        a=c;
        c=b;
        b=d;
        d=temp;
        System.out.println("after swap");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
