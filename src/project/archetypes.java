
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class archetypes {
        public int[][] info_1(){
            int[][] data = new int[5][6];
            String filePath = "archetypes.txt";

            try {
           
                Scanner scanner = new Scanner(new File(filePath));

            
                int row = 0;
                while (row < 5) {
                    String line = scanner.nextLine();
                    String[] words = line.split(" ");
                    if (words.length >= 7) {
                        for (int col = 0; col < 6; col++) {
                        data[row][col] = Integer.parseInt(words[col + 1]); 
                        }
                    row++;
                    }
                }
                    
            }       
         
        catch (FileNotFoundException e) {
    
        }
            return data;
        }
}
