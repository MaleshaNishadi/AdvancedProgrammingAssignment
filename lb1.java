/*  1. import scanner
    2. intro class as file name 
    3. write each calculation as method & return that
    4. public static vtype method name(){} 
    5. if write in the main method
    6. in main method only one time type Scanner sc = new Scanner(System.in);
    7. all methods call in main and that assign in variable
    8. type report in main method
    */
import java.util.Scanner;

public class lb1{


    public static double calAverage(double[] marks, int n){
        double sum=0;
        for (int i=0 ; i<n ; i++){
            sum= sum+marks[i];
        }
        return sum/n;
    }

    

    public static double calMax(double[] marks, int n){
        double max = marks[0];
        for (int i=0 ; i<n ; i++){
            
            if (marks[i]> max){
                max = marks[i];
            }
        }
        return max;

    }





 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.of students :");
    int n= sc.nextInt();

    String[] names = new String [n];
    double[] marks = new double [n];

    for (int i=0 ; i<n ; i++){
        System.out.println("Enter student name:");
        names[i] = sc.nextLine(); //here L capital
        sc.nextLine(); // getting answer other wise they not get name

        System.out.println("Enter marks:");
        marks[i] = sc.nextDouble(); //here D capital

    }


        int Distinction = 0;
        int Pass = 0;
        int Fail = 0;
        
    for (int i= 0 ; i<n ; i++){
        if(marks[i]>=75){
            Distinction++;
        }
        else if (marks[i]>=50){
            Pass++;
        }
        else{
            Fail++;
        }
    }

        double average = calAverage(marks, n);
        double max = calMax(marks, n);

        //report

        System.out.println("---Class Report---");
        System.out.println("Average Marks:" + average);
        System.out.println("Highest Marks:" + max);
        System.out.println("Distinction Students:" + Distinction);
        System.out.println("Pass Students:" + Pass);
        System.out.println("Fail Students:" + Fail);









 }




}
