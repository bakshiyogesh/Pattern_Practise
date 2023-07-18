import java.util.Scanner;
/*
*****
*****
*****
*****
*****
*  */
class Pattern1 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter number for pattern printing.");
        int num =number.nextInt();
        pattern(num);
    }
    public static void pattern(int N){
        for (int i = 0; i <N; i++) {
            for(int j=0;j<N;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
