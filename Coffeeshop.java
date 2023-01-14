import java.util.Scanner;

public class Coffeeshop{
    public static void main(String[] args){
        while(true){                       // this will repete the program un definetely
        Scanner sc = new Scanner(System.in);
        //ask the user for their balance
        //ask the user if they want esspresso or americano
        //ask the user how many they want
        //if the user inputs 0 or negative number, produce no output
        //if the user can not afford the number of coffees requested, produce no output
        //the user should get a different message depending on the type of coffee they purchased
        System.out.println("what's you balance?");
        String balanceInput = sc.nextLine();
        double balance = Double.parseDouble(balanceInput);
        System.out.println("what type of coffee do you want?");
        String coffeeInput = sc.nextLine();
        System.out.println("how many do you want?");
        String amountInput = sc.nextLine();   // or shortest way would be: int amountInput = Integer.parseInt(sc.nextLine());
        int amount = Integer.parseInt(amountInput);
        double espressoPrice = 3.99;
        double americanoPrice = 2.99;

        if (amount > 0){
            //proceed with coffee purchase attemp?
            boolean isEspresso = coffeeInput.equals("espresso");
            boolean isAmericano = coffeeInput.equals("americano");
            if(isEspresso && (balance >= (espressoPrice * amount))){
                //print out a successful espresso purchase message
                System.out.println("enjoy your espresso");
            }//else{
            //    System.out.println("you don't have enough balance1");
            //}
            
            else if(isAmericano && (balance >= (americanoPrice * amount))){
            //print out a successful americano purchase message
                System.out.println("enjoy your americano");
            }else{
                System.out.println("you don't have enough balance");
            }
        }else{
            System.out.println("no coffeee - amount requested is 0 or less");
        }
    }
}
}

