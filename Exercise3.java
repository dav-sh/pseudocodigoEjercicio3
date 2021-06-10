import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int result = 1;
        for(int i=0; i<number;i++){
            if(i==0){
                result = number*1;
            }else{
                result = result*i;
            }
            //System.out.println("x: "+result);
        }
        System.out.println("result: "+result);
    }
}