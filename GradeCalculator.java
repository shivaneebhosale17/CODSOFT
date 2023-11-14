// Student Grade Calculator


import java.util.Scanner;
public class GradeCalculator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for each subject(PCM)");

        System.out.print("Maths: ");
        int maths = sc.nextInt();
        System.out.print("Chemistry: ");
        int chem = sc.nextInt();
        System.out.print("Physics: ");
        int phy = sc.nextInt();
        System.out.print("English: ");
        int english = sc.nextInt();
        System.out.print("Electronics: ");
        int elec = sc.nextInt();

        int total = maths + phy + chem + english + elec;
        System.out.println("Total marks: "+total);

        int percent = total*100/500;
        System.out.println("Score: "+percent+"%");

        if(percent>90 && percent<=100){
            System.out.println("Grade: A+");
        }
        else if(percent>80 && percent<=90){
            System.out.println("Grade: A");
        }
        else if(percent>70 && percent<=80){
            System.out.println("Grade: B+");
        }
        else if(percent>60 && percent<=70){
            System.out.println("Grade: B");
        }
        else if(percent>50 && percent<=60){
            System.out.println("Grade: C+");
        }
        else if(percent>40 && percent<=50){
            System.out.println("Grade: C");
        }
        else if(percent>35 && percent<=40){
            System.out.println("Grade: D(Very weak)");
        }
        else{
            System.out.println("Grade: F(Failed)");
        }


    }
}



















