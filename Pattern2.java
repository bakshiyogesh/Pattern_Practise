import java.util.Scanner;
/*
*
* *
* * *
* * * *
* * * * *
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter number for pattern printing.");
        int num =number.nextInt();
        pattern(num);
    }
    public static void pattern(int N){
        for (int i = 0; i <N; i++) {
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
