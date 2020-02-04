import db.DataBaseHandler;
import heroes.Bowman;
import heroes.Character;
import heroes.Fighter;
import heroes.Mag;
import levels.Level1;
import levels.Level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMenu {
    public MyMenu() {
        menu();
    }

    Scanner input = new Scanner(System.in);
    Level1 level1 = new Level1();
    Level2 level2 = new Level2();


    public void menu() {
        System.out.println("\t =====HELLO! WELCOME TO THE GAME!=====");
        level1.level1(createNewCharacter());
//        level2.level2(createNewCharacter());
    }


    public Character createNewCharacter(){
        DataBaseHandler dbHandler = new DataBaseHandler();
        Character character = null;
        boolean isCorrectInput = true;
        do {
            try {
                System.out.println("Please, choose your character: \n 1.Fighter \n 2.Bowman \n 3.Mag");
                String choose = input.nextLine();
                System.out.println("Enter nick name, choose hero...");
                switch (choose) {
                    case "1":
                        character = new Fighter(input.nextLine(),"Fighter", input.nextInt(), input.nextBoolean(),input.nextInt());
                        break;
                    case "2":
                        character = new Bowman(input.nextLine(),"Bowman", input.nextInt(), input.nextBoolean(),input.nextInt());
                        break;
                    case "3":
                        character = new Mag(input.nextLine(),"Mag", input.nextInt(), input.nextBoolean(),input.nextInt());
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                isCorrectInput = false;
            } catch (InputMismatchException | NullPointerException | IllegalArgumentException e) {
                System.err.println("Incorrect enter. Please try again");
            }
        } while (isCorrectInput);
        dbHandler.createCharacter(character);
        return character;
    }

//    public Character createNewCharacter(){
//        DataBaseHandler dbHandler = new DataBaseHandler();
//        System.out.println("Enter nick name, choose hero...");
//        Scanner input = new Scanner(System.in);
//
//        Character character = new Fighter(input.nextLine(),"Fighter", input.nextInt(), input.nextBoolean(),input.nextInt());
//        dbHandler.createCharacter(character);
//        return character;
//    }
}