
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Main{

    public static void main(String[] args) {

        boolean mainLoop = true;

        int choice;

        int num;

        Scanner scan = new Scanner(System.in);
        char choices;
         Map<Integer, Integer> numArray = new HashMap<Integer, Integer>();
      
        numArray.put(0, 32);
        numArray.put(1, 21);
        numArray.put(2, 46);
        numArray.put(3, 10);
        numArray.put(4, 14);

        while (true) {
            System.out.println("Calculator Main Menu\n");
            System.out.print("1.) Add\n");
            System.out.print("2.) Remove\n");
            System.out.print("3.) Display\n");
            System.out.print("4.) Clear\n");
            System.out.print("5.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = scan.nextInt();
            switch (choice) {

                case 1:
                      
                    do {
                        System.out.print("Enter integer you want to add:");

                          num = scan.nextInt();
                          
                        int b,m=0,flag=0;      
                         m=num/2;      
                    if(num==0||num==1){  
                        
                            System.out.println(num + " is added and displayed on the List");
                            // for (int i = 0; i < 1; i++) {
                            //     numArray.put(num);
                            //      System.out.println(numArray.values().toString());
                            //     for (Integer numbers : numArray) {
                            //         System.out.println("Number = " + numbers);
                            //     }
                                
                            // }
                        
                         System.out.println(numArray);
                    }else{  
                       for(b=2;b<=m;b++){      
                        if(num%b==0){      
                        
                            System.out.println(num + " is added and displayed on the List");
                            for (int i = 0; i < 1; i++) {
                                numArray.add(num);
                                for (Integer numbers : numArray) {
                                    System.out.println("Number = " + numbers); 
                                     System.out.println(hashmap.values().toString());
                         flag=1;      
                         
                      }      
                     }      
                    if(flag==0)  { System.out.println(num+" is prime number! Prime number is not allowed!"); }  
                      
                        }
                       }
                    }

                        System.out.println("Do You Want To Continue( Y/ N(Return exit) )");
                        choices = scan.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');

                    break;

                case 2:
                    System.out.println("Number Lists");
                    System.out.println("=================");
                    for (int i = 0; i < 1; i++) {

                        for (Integer number : numArray) {
                            System.out.println("Number = " + number);
                        }
                    }

                    do {
                        System.out.print("Enter Index number you want to remove: ");
                        int i = scan.nextInt();

                        if (i >= 0 && i < numArray.size()) {
                            System.out.print(" Index Number " + i + " Successfully REMOVED!\n");
                            numArray.remove(i);
                            System.out.println(numArray);
                        } else {
                            System.out.print("Invalid Index! Try to check the maximum number of Index. \n");
                        }

                        System.out.println("Do You Want To Continue(Y/N)");
                        choice = scan.next().charAt(0);
                    } while (choice == 'Y' || choice == 'y');

                    break;

                case 3:

                    do {
                        // Display number list
                        
                        System.out.println(numArray.toString());

                        System.out.println("Do You Want To Continue( Y/ N(Return exit) )");
                        choices = scan.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');

                    break;

                case 4:
                System.out.println("Number Lists");
                System.out.println("=================");
                for (int i = 0; i < 1; i++) {

                    for (Integer number : numArray) {
                        System.out.println("Number = " + number);
                    }
                }

                do {
                    System.out.print(" Type 1 to Clear number  List?: ");
                    int i = scan.nextInt();
                    int a= 1;

                    if (i == a) {
                        System.out.print(" Successfully REMOVED/ clear all in the list!\n");
                        numArray.clear();
                        System.out.println("Empty list");
                    } else {
                        System.out.print("Unable to clear the list!\n");
                        
                    }
                    System.out.println("Type to exit..: )");
                    choices = scan.next().charAt(0);
                } while (choice == 'Y' || choice == 'y');
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;

            }

        }

    }

}
