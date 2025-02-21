import java.util.Scanner;
import java.lang.Math;
public class scientificCalculator {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args){

        char ans='1';
        while(true) {
            System.out.println("Enter any key to continue / q to quit");
            ans=scan.next().charAt(0);
            if (ans != 'q') {
                System.out.println("Enter\n1.Trigonometry\n2.logarithmic\n3.Exponential\n4.Arithmetic\n5.Root");
                int f = scan.nextInt();
                switch (f) {
                    case 1:
                        trig();
                        break;
                    case 2:
                        log();
                        break;
                    case 3:
                        exp();
                        break;
                    case 4:
                        arithmetic();
                        break;
                    case 5:
                        root();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        System.out.println("Enter any key to conitnue / (q to quit): ");
                        ans = scan.next().charAt(0);
                }

            } else return;
        }

    }
    public static double trig(){
        System.out.println("Enter(1,2,3)\n1.Sine\n2.Cosine\n3.Tangent");
        int x=scan.nextInt();
        System.out.println("choose unit 1.(radians)\n2.(degrees)");
        int ch=scan.nextInt();
        double ans=0;
        if(ch==1) {
            double angle = scan.nextDouble();
            switch (x) {
                case 1:
                    System.out.println(Math.sin(angle));
                    ans=Math.sin(angle);
                    break;
                case 2:
                    System.out.println(Math.cos(angle));
                    ans=Math.cos(angle);
                    break;
                case 3:
                    System.out.println(Math.tan(angle));
                    break;
                default:
                    System.out.println("Invalid Input");
                    return 0.0;
            }
        }
        else{
            double angle = scan.nextDouble();
            angle=Math.toRadians(angle);
            switch (x) {
                case 1:
                    System.out.println(Math.sin(angle));
                    ans=Math.sin(angle);
                    break;
                case 2:
                    System.out.println(Math.cos(angle));
                    ans=Math.cos(angle);
                    break;
                case 3:
                    System.out.println(Math.tan(angle));
                    ans=Math.tan(angle);
                    break;
                default:
                    System.out.println("Invalid Input");
                    return 0.0;
            }
        }
        return ans;
    }
    public static void log(){
        System.out.println("Enter the input: ");
        double num=scan.nextDouble();
        System.out.println(Math.log10(num));
        return;
    }
    public static void exp(){
        System.out.println("Enter the base: ");
        double base=scan.nextDouble();
        System.out.println("Enter the exp");
        double exp=scan.nextDouble();
        System.out.println(Math.pow(base,exp));
        return;
    }
    public static void root(){
        System.out.println("Enter the number");
        double num=scan.nextDouble();
        System.out.println(Math.sqrt(num));
        return;
    }
    public static void arithmetic(){
        System.out.println("1.Addition\n2.Subtract\n3.Multiplication\n4.Division");
        int c=scan.nextInt();
        switch (c){
            case 1: double a1=scan.nextDouble();double a2=scan.nextDouble(); System.out.println(a1+a2); break;
            case 2: double b1=scan.nextDouble();double b2=scan.nextDouble(); System.out.println(b1-b2); break;
            case 3: double c1=scan.nextDouble();double c2=scan.nextDouble(); System.out.println(c1*c2); break;
            case 4:
                    System.out.println("Enter Dividend");
                    double d1=scan.nextDouble();
                    System.out.println("Enter divisor");
                    double d2=scan.nextDouble();
                    System.out.println(d1/d2); break;
                    default : System.out.println("Invalid Input");
        }
        return;
    }

}
