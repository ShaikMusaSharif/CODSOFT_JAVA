import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to STUDENT GRADE CALCULATOR");
        System.out.println("Enter the marks of each subject out of 100");

        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();
        int a[] = new int[sub];

        for (int i = 0; i < sub; i++) {
            System.out.print("Enter the marks of subject " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        // total marks
        int sum = 0;
        for(int j=0;j<sub;j++){
            sum += a[j];
        }
        System.out.println("The total sum of your marks is : "+sum);
        // average
        int avg = (sum * 100) / (sub * 100); 
        System.out.println("The average percentage of your marks is : "+avg);
        // GRADE
        if(avg>=90){
            System.out.println("Congratulations ! You have secured S grade");
        }
        else if(avg>=80 && avg<90){
            System.out.println("Congratulations ! You have secured A grade");
        }
        else if(avg>=70 && avg<80){
            System.out.println("Congratulations ! You have secured B grade");
        }
        else if(avg>=60 && avg<70){
            System.out.println("Congratulations ! You have secured C grade");
        }
        else if(avg>=50 && avg<60){
            System.out.println("Congratulations ! You have secured D grade");
        }
        else if(avg>=40 && avg<50){
            System.out.println("Congratulations ! You have secured E grade");
        }
        else{
            System.out.println("Sorry ! You have secured F grade");
        }
    }
}