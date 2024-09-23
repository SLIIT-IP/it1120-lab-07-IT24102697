import java.util.Scanner;

public class IT24102697Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);

            int[] marks = new int[4];
            int totalMarks = 0;
            
            System.out.print("Enter marks: ");

            for (int i = 0; i < 4; i++) {
                marks[i] = scanner.nextInt();
                totalMarks += marks[i];
            }

            double average = totalMarks / 4.0;
            
            System.out.println("Average is : " + average);

            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 60) {
                grade = "Credit";
            } else if (average >= 50) {
                grade = "Pass";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        scanner.close();
    }
}