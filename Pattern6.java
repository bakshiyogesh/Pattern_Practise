import java.util.Scanner;
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
class Pattern6 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter number for pattern printing:-");
        int num =number.nextInt();
        pattern(num);
    }
    public static void pattern(int N){
        for (int i =N; i>1; i--) {
            for(int j=1;j<i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
