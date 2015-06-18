# Java

import java.util.*;  
import java.io.*;  
  
public class Personality {  
    public static void main(String[] args) throws FileNotFoundException {  
    	System.out.println("Input file name: ");
		Scanner console = new Scanner(System.in);
		String x = console.next();
		String x1 = "";
		while (!x.equalsIgnoreCase("personality.txt")) {
			System.out.println("File not found. Try again: ");
			x = console.next(); 
		}
		x1 = x;
		Scanner console2 = new Scanner(new File(x1));
		System.out.println("Output file name: ");
		String name2 = console.next();
		PrintStream out = new PrintStream(new File(name2));   
        while (console2.hasNextLine()) {  
            String name = console2.nextLine();  
            String changed = console2.nextLine().toLowerCase();  
            int[] number = read(changed);  
            System.out.println(name + ": ");  
            System.out.print(Arrays.toString(number));  
            System.out.println();  
            int[] percent = percent(number);
            printLetters(percent);   
        }  
    }  
    // Reads the file and increases the count of a's and b's in an array as the string is being read.
    public static int[] read(String k) {  
        int[] numberCount = new int[8];  
        for (int i = 0; i < 70; ++i) {  
            char j = k.charAt(i);  
            if (i % 7 == 0) {  
                if (j == 'a') {  
                    ++numberCount[0];  							// Increases the count by 1 if an a is found. 
                } 
                else if (j == 'b') {  								
                    ++numberCount[1];  							// Increases the count by 1 if b is found. 
                }  
            } 
            else if (i % 7 == 1 || i % 7 == 2) {  
                if (j == 'a') {  
                    ++numberCount[2];  
                } 
                else if (j == 'b') {  
                    ++numberCount[3];  
                }  
            } 
            else if (i % 7 == 3 || i % 7 == 4) {  
                if (j == 'a') {  
                    ++numberCount[4];  
                } 
                else if (j == 'b') {  
                    ++numberCount[5];  
                }  
            } 
            else {  
                if (j == 'a') {  
                    ++numberCount[6];  
                } 
                else if (j == 'b') {  
                    ++numberCount[7];  
                }  
            }  
        }  
        return numberCount;  
    }  
    // Finds the percent of the a's and b's and writes it into an array.
    public static int[] percent(int[] m) {  
    	int[] percent = new int[4];   
        for (int i = 0; i < 4; ++i) {
        	int x = Math.round((m[2*i+1] * 100)/ (m[2*i] + m[2*i+1]));    			// formula for percent.
            percent[i] = x;   
            }   
        System.out.println(Arrays.toString(percent));
        return percent;   
    }
    // Chooses which letter should be assigned depending on the percentage. 
    public static void printLetters(int[] percent) {
    	for (int i = 0; i < 4; ++i) {
    		if (i == 0) {
    			if (percent[i] == 50) {												
    				System.out.print("X");			
    				}
    			else if (percent[i] > 50) {
    				System.out.print("I");
    			}
    			else {
    				System.out.print("E");
    			}
    		}
    		if (i == 1) {
    			if (percent[i] == 50) {
    				System.out.print("X");
    				}
    			else if (percent[i] >= 50) {
    				System.out.print("S");
    			}
    			else {
    				System.out.print("N");
    			}
    		}
    		if (i == 2) {
    			if (percent[i] == 50) {
    				System.out.print("X");
    				}
    			else if (percent[i] >= 50) {
    				System.out.print("T");
    			}
    			else {
    				System.out.print("F");
    			}
    		}
    		if (i == 3) {
    			if (percent[i] == 50) {
    				System.out.print("X");
    				}
    			else if (percent[i] >= 50) {
    				System.out.print("J");
    			}
    			else {
    				System.out.print("P");
    			}
    		}
   
