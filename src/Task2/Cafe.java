package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<String>();

    public ArrayList<String>  getCoffeeMenu(){
            for (String i : coffeeMenu){
                System.out.println(i);
            }
        return coffeeMenu;
        }


    public void loadMenuData(){
        try {
            File file = new File("coffee.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                coffeeMenu.add(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Unable to locate file. Check path and filename");
        }
    }
}
