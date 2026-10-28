import java.util.Scanner;

public class SiakadFor02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double grade;
        double highest = 0;
        double lowest = 100;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();
            if (grade > highest){
                highest = grade;
            }
            if (grade < lowest){
                lowest = grade;
            }
            if (grade >= 60){
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade " + lowest);
        System.out.println("The numbe rof student who passed: " + pass);
        System.out.println("The number of student who failed: " + fail);

        sc.close();
    }
}