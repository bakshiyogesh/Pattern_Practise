import java.util.Scanner;
/*
1
12
123
1234
12345
*/
class Pattern3 {
        public static void main(String[] args) {
            Scanner number=new Scanner(System.in);
            System.out.println("Enter number for pattern printing.");
            int num =number.nextInt();
            pattern(num);
        }
        public static void pattern(int N){
            for (int i = 0; i <N; i++) {
                for(int j=1;j<i+1;j++){
                    System.out.print(j);
                }
                System.out.print("\n");
            }
        }
    }

