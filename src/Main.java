import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        double firstLength,secondLength,hypotenuse;
        Scanner input=new Scanner(System.in);
        System.out.print("Üçgenin 1. Dik Kenar Uzunluğu:");
        firstLength=input.nextDouble();
        System.out.print("Üçgenin 2. Dik Kenar Uzunluğu:");
        secondLength=input.nextDouble();
        hypotenuse=Math.sqrt((firstLength*firstLength)+(secondLength*secondLength));
        System.out.print("Üçgenin Hipotenüs Uzunluğu:"+hypotenuse);
    }
}
