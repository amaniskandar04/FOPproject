package project;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class main {


    public static void main(String[] args) {
        main_menu start = new main_menu();
        archetypes data_receive = new archetypes();
        
        int[][] data = new int[5][6];
        
        data = data_receive.info_1();
        
        System.out.println(data[1][1]);
        
        start.starting();
        
        System.out.println("its back to main!");
        
        int archetypeselection = start.char_select();
        
    }
    
}
