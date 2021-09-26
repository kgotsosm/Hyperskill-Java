package coffee.machine;
import java.util.Scanner;


public class CoffeeMachine {
    static Scanner scan = new Scanner(System.in);
    static String action;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    
      
    private static void buy(){
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - back to main menu:");
        if(scan.hasNext("back")){
            CoffeeMachine.main(null);
        }
        
        else{
            int toBuy = scan.nextInt();
            switch(toBuy){
                case 1: 
                    if(water < 250){
                        System.out.println("Sorry, not enough water!\n");
                        CoffeeMachine.main(null);
                    }
                    if(beans < 16){
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if(cups < 1){
                        System.out.println("Sorry, not enough cups!");
                    }
                    if(water >= 250 && beans >= 16 && cups >= 1){
                    water -= 250;
                    beans -= 16;
                    cups -=1;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee\n");
                    }
                    CoffeeMachine.main(null);
                    break;
                  
                    
                case 2:
                    if(water < 350){
                        System.out.println("Sorry, not enough water!\n");
                        CoffeeMachine.main(null);
                    }
                    if(milk < 75){
                        System.out.println("Sorry, not enough milk!\n");
                        CoffeeMachine.main(null);
                    }
                    if(beans < 20){
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if(cups < 1){
                        System.out.println("Sorry, not enough cups!");
                    }
                    
                    if(water >= 350 && milk >= 75 && beans >= 20 && cups >= 1);
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee\n");
                    CoffeeMachine.main(null);
                    break;

                case 3:
                    if(water < 200){
                        System.out.println("Sorry, not enough water!\n");
                        CoffeeMachine.main(null);
                    }
                    if(milk < 100){
                        System.out.println("Sorry, not enough milk!\n");
                        CoffeeMachine.main(null);
                    }
                    if(beans <12){
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if(cups < 1){
                        System.out.println("Sorry, not enough cups!");
                    }
                    if(water >= 200 && milk >= 100 && beans >= 12 && cups >= 1);
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee\n");
                    CoffeeMachine.main(null);
                    break;

            }
        }
    }
    
    private static void fill(){
        int waterAdd, milkAdd, beansAdd, cupsAdd;
        System.out.println("\nWrite how many ml of water you want to add: ");
        waterAdd = scan.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milkAdd = scan.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add");
        beansAdd = scan.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cupsAdd = scan.nextInt();
        
        water += waterAdd;
        milk += milkAdd;
        beans += beansAdd;
        cups += cupsAdd;
        System.out.println("\n");
        CoffeeMachine.main(null);
       
        
    }
    private static void take(){
        System.out.println("I gave you $" + money);

        money = 0;
        System.out.println("\n");
        
        CoffeeMachine.main(null);
        
    }
    
    private static void remaining(){
        System.out.println("The coffee machine has: ");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money\n");
        System.out.println("\n");
        CoffeeMachine.main(null);
       
    }
    
    
    public static void main(String[] args){
        
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            while(!"exit".equals(action)){
                action = scan.nextLine();
            
                    switch(action){
                        case("buy"):
                            buy();
                            break;
                        case("fill"):
                            fill();
                            break;
                        case("take"):
                            take();
                            break;
                        case("remaining"):
                            remaining();
                            break;
                        default:

                    }
            }   
                
            
    
    }
}

