import java.util.Scanner;
class SimpleCalculator {
    
    // Method for addition
    int add(int a, int b) {
        return a + b;
    }
    
    // Method for subtraction
    int sub(int a, int b) {
        return a - b;
    }
    
    // Method for multiplication
    int mul(int a, int b) {
        return a * b;
    }
    
    // Method for division
    int div(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        
        // Creating object of calculator class
        SimpleCalculator obj = new SimpleCalculator();
        
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        char continuechoice;
        
        // Loop for repeated calculator usage
        do {
            try {
                // Displaying menu 
                System.out.println("\n===== SIMPLE CALCULATOR =====");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
        
                // Taking user choice
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                
                // Taking numbers from user
                System.out.print("Enter number 1: ");
                int num1 = sc.nextInt();
        
                System.out.print("Enter number 2: ");
                int num2 = sc.nextInt();
                
                // Performing operation using switch
                switch(choice) {
                    case 1:
                        int sum = obj.add(num1, num2);
                        System.out.println("Addition: " + sum);
                        break;
                    case 2:
                        int minus = obj.sub(num1, num2);
                        System.out.println("Subtraction: " + minus);
                        break;
                    case 3:
                        int x = obj.mul(num1, num2);
                        System.out.println("Multiplication: " + x);
                        break;
                    case 4:
                        // Division validation
                        if(num2 == 0) {
                            System.out.println("Enter Valid Number 2");
                        } else {
                            int divi = obj.div(num1, num2);
                            System.out.println("Division: " + divi);
                        }
                        break;
                        default:
                        System.out.println("Enter Valid Choice");
                }
            }
            
            // Exception handling for invalid input
            catch (Exception e) { 
                System.out.println("Invalid input. Please enter numbers only."); 
                sc.nextLine(); 
            }
            
            // Asking user whether to continue
            System.out.print("Do you want to continue? (Y/N)");
            continuechoice = sc.next().charAt(0);
        } 
        while (continuechoice == 'y' || continuechoice == 'Y');
        
        // Exit message 
        System.out.println("\nThank you for using Simple Calculator!"); 
        sc.close();
    }
}