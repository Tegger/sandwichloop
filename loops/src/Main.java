import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int selectionOne = 0;
        int selectionTwo = 0;
        int selectionThree = 0;
        int selectionFour = 0;
        boolean done = false;
        String meat = "";
        String veggie = "";
        String cond = "";
        String bread = "";
        do{
            while(selectionOne <= 0 || selectionOne > 3){
                System.out.println("Please select your sandwich by inputting the corresponding numbers:");
                System.out.println("___________________________________");

                System.out.println("Please select your Meat:");
                System.out.println("1. Turkey");
                System.out.println("2. Ham");
                System.out.println("3. Chicken");
                Scanner scanner = new Scanner(System.in);
                selectionOne = scanner.nextInt();

                if (selectionOne == 1){
                    meat = "Turkey";
                }else if (selectionOne == 2){
                    meat = "Ham";
                }else if (selectionOne == 3){
                    meat = "Chicken";
                }else{
                    meat ="";
                }


            }

            while(selectionTwo <= 0 || selectionTwo > 3){

                System.out.println("Please select your Bread:");
                System.out.println("1. Rye");
                System.out.println("2. Wheat");
                System.out.println("3. White");
                Scanner scanner = new Scanner(System.in);
                selectionTwo = scanner.nextInt();

                if (selectionTwo == 1){
                    bread = "Rye";
                }else if (selectionTwo == 2){
                    bread = "Wheat";
                }else if (selectionTwo == 3){
                    bread = "White";
                }else{
                    bread ="";
                }

            }

            while (selectionThree <= 0 || selectionThree > 3){

                System.out.println("Please select your Veggie:");
                System.out.println("1. Tomato");
                System.out.println("2. Lettuce");
                System.out.println("3. Cucumber");
                Scanner scanner = new Scanner(System.in);
                selectionThree = scanner.nextInt();

                if (selectionThree == 1){
                    veggie = "Toamto";
                }else if (selectionThree == 2){
                    veggie = "Lettuce";
                }else if (selectionThree == 3){
                    veggie = "Cucumber";
                }else{
                    veggie ="";
                }

            }

            while (selectionFour <= 0 || selectionFour > 3){

                System.out.println("Please select your Condiment:");
                System.out.println("1. Mustard");
                System.out.println("2. Mayo");
                System.out.println("3. Ketchup");
                Scanner scanner = new Scanner(System.in);
                selectionFour = scanner.nextInt();


                if (selectionFour == 1){
                    cond = "Mustard";
                }else if (selectionFour == 2){
                    cond = "Mayo";
                }else if (selectionFour == 3){
                    cond = "Ketchup";
                }else{
                    cond ="";
                }


            }
            done = true;



        }while(done == false);










        System.out.println("You have selected a " + meat + " Sandwich with " + veggie + ", and " + cond + " on " + bread + "!" );

        }

}
