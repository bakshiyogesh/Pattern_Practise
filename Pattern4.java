import java.util.Scanner;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
class Pattern4 {
        public static void main(String[] args) {
            Scanner number=new Scanner(System.in);
            System.out.println("Enter number for pattern printing.");
            int num =number.nextInt();
            pattern(num);
        }
        public static void pattern(int N){
            for (int i = 0; i <N; i++) {
                for(int j=0;j<i+1;j++){
                    System.out.print(i+1);
                }
                System.out.print("\n");
            }
        }
}

