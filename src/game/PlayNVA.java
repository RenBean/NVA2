package game;

import java.util.Scanner;


/**
 * Created by perrythomson on 7/11/16.
 */
public class PlayNVA {
    public static Scanner scanner = new Scanner(System.in);

    private static NVA nva;

    public static void main(String[] args) {

        NVA nva = new NVA();
        System.out.println("Lets play a game.");
        nva.setName();
        nva.setPlayerType();
        nva.setWeapon();
        nva.setLocation();
        nva.setSpecial();
        nva.startBattle();

        Scanner scanner = new Scanner(System.in);

    }
}