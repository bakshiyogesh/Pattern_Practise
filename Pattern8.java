import java.util.Scanner;
/*
 * * * * * * *
 * * * * *
 * * *
 *
 */
class Pattern8 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter number for pattern printing:-");
        int num =number.nextInt();
        pattern(num);
    }
    public static void pattern(int N){
        for (int i =N; i>0; i--) {
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

