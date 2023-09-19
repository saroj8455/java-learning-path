import com.thedevsaroj.Hello;
import com.thedevsaroj.JavaIf;

public class Main {
    public static void main(String[] args) {
        String username="ocemblgr2023";
        System.out.println("Hello world! "+username);
        JavaIf jf = new JavaIf();
        int num1 = 10;
        int num2 = 30;
        int result = num1 + num2;
        System.out.println(result);
        Hello hl = new Hello();
        System.out.println(hl);

        int n= 6;
        if (n==0) {
            System.out.println("nothing");
        } else if (n%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }
}
