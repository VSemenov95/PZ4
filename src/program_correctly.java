import java.util.Scanner;
public class program_correctly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: x = ");
        double x= in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите y: y = ");
        double y= in1.nextDouble();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите z: z = ");
        double z= in2.nextDouble();
        double sr=(x+y+z)/3;
        System.out.println("Среднее арифметическое = "+sr);
        double a=(int)(sr/2);
        if (a>3){
            System.out.println("Программа выполнена корректно");
        }
    }
}