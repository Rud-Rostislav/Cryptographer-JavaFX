package com.rrs.cryptographerfx;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        String encodedText = "";
        int launchCount = 0;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                             Шифратор запущено                         |");
        System.out.println("-------------------------------------------------------------------------");

        while (true) {
            System.out.println("Що ви хочете зробити?");
            System.out.println("0. Вихід.");
            System.out.println("1. Шифрування.");
            System.out.println("2. Розшифрування.");

            if (launchCount == 1) {
                System.out.println("3. Розшифрування попереднього тексту.");
            }
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                System.out.println("\nЗавершення програми.");
                System.out.println("-------------------------------------------------------------------------");
                break;
            }

            if (choice == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Введіть текст для шифрування: ");
                String text = sc.nextLine();
                encodedText = Dictionary.Encoder(text);

                // Copy to the clipboard
                StringSelection stringSelection = new StringSelection(encodedText);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);

                System.out.println(encodedText);
                System.out.println("-------------------------------------------------------------------------");
                launchCount = 1;
            } else if (choice == 2) {

                Scanner sc = new Scanner(System.in);
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Введіть код розшифрування: ");
                String text = sc.nextLine();
                String decodedText = Dictionary.Decoder(text);
                System.out.println(decodedText);
                System.out.println("-------------------------------------------------------------------------");
                launchCount = 1;

            } else if (choice == 3) {
                String decodedText = Dictionary.Decoder(encodedText);
                System.out.println(decodedText);
                launchCount = 0;
            }

        }
    }
}