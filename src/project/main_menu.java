
package project;
import java.util.Scanner;
import java.io.File;

public class main_menu {
    public void starting(){
        text_art text_art_main_menu = new text_art();
        Scanner cin_main_menu = new Scanner(System.in);
       
        
        
        
        
        System.out.println(text_art_main_menu.border);
        System.out.println(text_art_main_menu.title);
        System.out.print(text_art_main_menu.border);
        System.out.println(text_art_main_menu.asuna);
        
        System.out.print("""
                           
                           ++++++++++++++++++++++++++++++++++++++++++++++++++++
                           + [1] Press any key to start                       +
                           ++++++++++++++++++++++++++++++++++++++++++++++++++++
                           
                           : """);
        
        String selection = cin_main_menu.next();
        System.out.println("game starting...");
        
    }
    
    public int char_select(){
        text_art text_art_main_menu = new text_art();
        Scanner cin_main_menu = new Scanner(System.in);
        int selektion = 0;
        
        System.out.println(text_art_main_menu.border);
        System.out.println("Choose your character!");
        System.out.println(text_art_main_menu.border);
        System.out.print(text_art_main_menu.wizard);
        System.out.println(text_art_main_menu.border);
        System.out.println("1. Wizard");
        
        return selektion;
    }
}
