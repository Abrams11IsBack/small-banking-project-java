package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //stan konta początkowy tutaj
        int John = 100;
        int Emanuel = 100;
        int JohnIlePrzelac;
        int EmanuelIlePrzelac;

        String polecenieUser;

        //funkcja że klikasz enter aby kontynuować...
        Scanner pressEnterToContinue = new Scanner(System.in);
        Scanner polecenieUserInput = new Scanner(System.in);
        Scanner JohnIlePrzelacInput = new Scanner(System.in);
        Scanner EmanuelIlePrzelacInput = new Scanner(System.in);

        System.out.println("welcome to the banking system v0.1 (enter)");
        pressEnterToContinue.nextLine(); //to jest ta funkcja press enter to continue
        while (true) {
            System.out.println("Napisz komendę: 'przelej <imie> z konta <imie>' lub 'stankonta <imie>' lub 'konta'");

            polecenieUser = polecenieUserInput.nextLine();

            switch (polecenieUser) {
                case "stankonta John":
                    System.out.println("Stan konta użytkownika John wynosi: " + John);
                    break;
                case "stankonta Emanuel":
                    System.out.println("Stan konta użytkownika Emanuel wynosi: " + Emanuel);
                    break;
                case "konta":
                    System.out.println("Emanuel, John");
                    break;
                case "przelej John z konta Emanuel":
                    System.out.println("Jaką kwotę przelać?");
                    JohnIlePrzelac = JohnIlePrzelacInput.nextInt();
                    if (JohnIlePrzelac <= Emanuel) {
                        John = John + JohnIlePrzelac;
                        Emanuel = Emanuel - JohnIlePrzelac;
                    } else {
                        System.out.println("Błąd: nie masz tyle środków na koncie");
                    }
                    break;
                case "przelej Emanuel z konta John":
                    System.out.println("Jaką kwotę przelać?");
                    EmanuelIlePrzelac = EmanuelIlePrzelacInput.nextInt();
                    if (EmanuelIlePrzelac <= John) {
                        Emanuel = Emanuel + EmanuelIlePrzelac;
                        John = John - EmanuelIlePrzelac;
                    } else {
                        System.out.println("Błąd: nie masz tyle środków na koncie");
                    }
                    break;
                default:
                    System.out.println("coś poszło nie tak spróbuj jeszcze raz i sprawdź czy dobrze wszystko napisałeś");
            }
        }


        }



    }

