package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.EvenNumTest.isEven;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose an option from the menu:");
        System.out.println("Palindrom and Reverse............1");
        System.out.println("Power of 4.......................2");
        System.out.println("To create a member class.........3");
        System.out.println("OddEven checker..................4");
        int n;
        while(true){
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("You choose 1, Give your input now...");
                    String queryString=sc.next();
                    PalindromeAndReverse obj=new PalindromeAndReverse();
                    String result = obj.Palindrome(queryString);
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("You choose 2,Enter a number to check ");
                    int num=  sc.nextInt();
                    PowerOf4 obj1= new PowerOf4();
                    String result1= obj1.checkPowerOf4(num);
                    System.out.println(result1);
                    break;
                case 3:
                    System.out.println("You choose 3,Enter member details ");
                    System.out.println("Name of member:");
                    String name=sc.next();
                    System.out.println("Age:");
                    int age=sc.nextInt();
                    System.out.println("Salary:");
                    double salary=sc.nextDouble();
                    MemberVariable memberVariable =new MemberVariable();
                    memberVariable.createClass(name,age,salary);
                    break;
                case 4:
                    System.out.println("You choose 4, Your Number ");
                    int oddEven=sc.nextInt();
                   // EvenNumTest evenNumTest= new EvenNumTest();
                    if(isEven(oddEven)==true){
                        System.out.println(oddEven+ " is an Even Number");
                    }
                    else {
                        System.out.println(oddEven + " is a odd Number");
                    }
                case 5:
                    System.out.println("You choose 5,Enter number of students");
                      int studNum=sc.nextInt();
                    List<Integer> list = new ArrayList<Integer>();
                      for(int i=0;i<studNum;i++)
                        list.add(sc.nextInt());
                      Student_Records student_records=new Student_Records(list);
                      break;
                case 6:
                    System.out.println("You choose 6,");
                    FIbonacciNumbers fIbonacciNumbers=new FIbonacciNumbers();
                     fIbonacciNumbers.solve();
                    break;
                case 7:
                    System.out.println("You choose 7, Now Enter member details");
                    System.out.println("Enter first Name");
                    User user=new User();

                    String FirstName=sc.next();
                    user.setFirstName(FirstName);

                    System.out.println("Enter last Name");
                    String LastName=sc.next();
                    user.setLastName(LastName);

                    System.out.println("Enter age");
                    while(true) {
                        int age7 = sc.nextInt();
                        if (!user.checkValidAge(age7)) {
                            System.out.println("Not a valid age, Enter again..");
                            //continue Loop;
                        } else {
                            user.setAge(age7);
                            break;
                        }
                    }
                    System.out.println("Enter salary");
                    double Salary=sc.nextDouble();
                    user.setSalary(Salary);

                    System.out.println(user.getFullName());


                default:
                    break;

            }
            break;
        }
    }
}
