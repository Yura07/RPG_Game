import heroes.Bowman;
import heroes.Character;
import heroes.Fighter;
import heroes.Mag;
import levels.Level1;

import java.util.Scanner;

public class MyMenu {
    public MyMenu() {
        menu();
    }

    Scanner sc = new Scanner(System.in);
    Level1 level1 = new Level1();

    public void menu() {
        System.out.println("\t =====HELLO! WELCOME TO THE GAME!=====");
        level1.level1(chooseCharacter());


    }


    public Character chooseCharacter(){
        Character character = null;
        System.out.println("Please, choose your character: \n 1.Fighter \n 2.Bowman \n 3.Mag");
        Integer choose = sc.nextInt();
//        while (choose != 1 || choose != 2 || choose != 3){
//            System.out.println("Error! There is no such character! Try again.");}
        switch (choose) {
            case 1:
                character = new Fighter("Fighter", 100, 16);
                break;
            case 2:
                character = new Bowman("Bowman", 100, 13);
                break;
            case 3:
                character = new Mag("Mag", 100, 20);
                break;
        }
        return character;
    }


}
