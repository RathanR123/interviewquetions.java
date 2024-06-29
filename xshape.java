import java.util.Scanner;

public class xshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the 'X' shape: ");
        int size = scanner.nextInt();
        scanner.close();

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(j==size-1-i||j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
