
package hyperskill.java.part.pkg3;

import java.util.Arrays;
import java.util.Scanner;

public class HyperskillJavaPart3 {

    
    public static void main(String[] args) {
        
        int ableToMake, waterNeed, milkNeed, beansNeed;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: "); 
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int order = scanner.nextInt();
        
        if (water/200>=order && milk/50>=order && beans/15 >=order){
            waterNeed = (int) water/200;
            milkNeed = (int) milk/50;
            beansNeed = (int) beans/15;
        
            int[] n = {waterNeed, milkNeed, beansNeed};
        
            int min = Arrays.stream(n).min().getAsInt();
            ableToMake = min-order;
            
            if(min-order > 0){
            System.out.println("Yes, I can make that amount of coffee " + "(and even " + ableToMake + " more than that)");
            }
            if(min-order == 0){
                System.out.println("Yes, I can make that amount of coffee");
            }
        }
        else{
        
        waterNeed = (int) water/200;
        milkNeed = (int) milk/50;
        beansNeed = (int) beans/15;
        
        int[] n = {waterNeed, milkNeed, beansNeed};
        
        int min = Arrays.stream(n).min().getAsInt();
        
        
        System.out.println("No, I can only make " + min + " cup(s) of coffee");
        
        }
    }
    
}
