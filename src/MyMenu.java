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

    Scanner sc = new Scanner(System.in);
    Level1 level1 = new Level1();
    Level2 level2 = new Level2();


    public void menu() {
        System.out.println("\t =====HELLO! WELCOME TO THE GAME!=====");
        level1.level1(chooseCharacter());
        level2.level2(chooseCharacter());
    }


    public Character chooseCharacter(){
        Character character = null;
        System.out.println("\tEnter your name, please");
        String name = sc.nextLine();
        boolean isCorrectInput = true;
        do {
            try {
                System.out.println("Please, choose your character: \n 1.Fighter \n 2.Bowman \n 3.Mag");
                String choose = sc.nextLine();
                switch (choose) {
                    case "1":
                        character = new Fighter(name, 100, 16);
                        break;
                    case "2":
                        character = new Bowman(name, 100, 13);
                        break;
                    case "3":
                        character = new Mag(name, 100, 20);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                isCorrectInput = false;
            } catch (InputMismatchException | NullPointerException | IllegalArgumentException e) {
                System.err.println("Incorrect enter. Please try again");
            }
        } while (isCorrectInput);
        return character;
    }

    public void createNewCharacter(){
        DataBaseHandler dbHandler = new DataBaseHandler();
        System.out.println("Enter nick name, choose hero...");
        Scanner input = new Scanner(System.in);

        Character character = new Character(input.nextLine(),input.nextInt(), input.nextInt(), input.nextBoolean(),input.nextInt());
        dbHandler.createCharacter(character);
    }
}