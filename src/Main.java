import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        // 153

        int tempNum = num, digitNum = 0;
        while (tempNum != 0){
            digitNum++;
            tempNum = tempNum / 10;
        }

        int result = 0;
        tempNum = num;
        for(int i = 1; i <= digitNum; ++i){
            result += tempNum % 10;
            tempNum /= 10;
        }

        System.out.println("Sum of digits of the number: " +result);
    }
}