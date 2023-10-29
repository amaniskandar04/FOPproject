
package project;
import java.util.Scanner;

public class main_menu {
    public void starting(){
        text_art text_art_main_menu = new text_art();
        Scanner cin_main_menu = new Scanner(System.in);
        scenes first_scene_main_menu = new scenes();
        
        
        
        System.out.println(text_art_main_menu.border);
        System.out.println(text_art_main_menu.title);
        System.out.println(text_art_main_menu.border);
        
        System.out.print("""
                           
                           ++++++++++++++++++++++++++++++++++++++++++++++++++++
                           + [1] Play the game                                +
                           +                                                  +
                           + [2] Quit (why would you even run the code then?) +
                           ++++++++++++++++++++++++++++++++++++++++++++++++++++
                           
                           
                           : """);
        
        int selection = cin_main_menu.nextInt();
        
        switch(selection){
            case 1:
                System.out.println(text_art_main_menu.refresh);
                first_scene_main_menu.scene_1();
                break;
                
            case 2:
                break;
                
        }
        
        System.exit();
    }
}
