/**
    Author : Haron Gichuhi (Hargi12)
    Created on: 30 June 2019
    This is a simple java program that prints a basic arrow on the screen
 */ 
public class PatternArrowCreator {
    public static void main(String [] args){
        // Create a nested for loop here
        for(int row = 1; row<= 7; row ++){
            for(int hashNum = 1; hashNum <= 4 - Math.abs(4 - row); hashNum++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
