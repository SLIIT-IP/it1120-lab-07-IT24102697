import java.util.Scanner;
public class IT24102697Lab7Q1A{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for four subjects :");

        System.out.print("Enter Subject Mark 1 : ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter subject Mark 2 : ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter Subject Mark 3 : ");
        int mark3 = scanner.nextInt();

        System.out.print("Enter Subject Mark 4 : ");
        int mark4 = scanner.nextInt();

        double avg = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("Avarage is : " + avg);

        if(avg>=75){
            System.out.println("Ovarall grade is : Distinction");
        }
        else if (avg>=50){
            System.out.println("Ovarall grade is : Credit ");
        }
        else if(avg>=0){
            System.out.println("Ovarall grade is : Fail ");
        }


        scanner.close();
    }
}