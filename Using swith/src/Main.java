import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int a = sc.nextInt();


        switch (a){
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("this is two");
                break;
            default:
                System.out.println("other no.");

        }

    }
}