import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("give input : ");
        int value = scan.nextInt();
        System.out.println("value is : " + value);

        if(value < 50){
            for(int i=0; i<value; i++){
                System.out.println("Sajid");
            }
        }

    }
}
