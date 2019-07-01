/**
    Author : Haron Gichuhi (Hargi12)
    Created on: 30 June 2019
    This is a simple java program that prints a descending pattern
 */ 

public class PatternCreator {

public static void main(String[] args ){
	// A for loop
	for (int row =1;  row<=5; row++) {
		// Got row by multipying row -1
		for (int hashNum = 1; hashNum <= 6 -row;  hashNum++) {
			// Print your pattern here
			System.out.print("#");
		}	
		System.out.print("\n");
    }
 }
}
