package com.rrs.cryptographerfx;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static Map<String, String> getCoderSet() {
        Map<String, String> cipher = new HashMap<>();
        cipher.put("А", "11%");
        cipher.put("а", "14в");
        cipher.put("Б", "2ip54");
        cipher.put("б", "22f");
        cipher.put("В", "4op");
        cipher.put("в", "4454");
        cipher.put("Г", "5^3");
        cipher.put("г", "55&4");
        cipher.put("Д", "6fhg");
        cipher.put("д", "66SA");
        cipher.put("Е", "7ku");
        cipher.put("е", "7779");
        cipher.put("Ё", "8nm]");
        cipher.put("ё", "88sd");
        cipher.put("Ж", "9[][");
        cipher.put("ж", "995nd");
        cipher.put("З", "10d1");
        cipher.put("з", "100g");
        cipher.put("И", "118n");
        cipher.put("и", "111dk");
        cipher.put("І", "11354");
        cipher.put("і", "1123dm");
        cipher.put("Ї", "1&t");
        cipher.put("ї", "12dsd");
        cipher.put("Й", "12&$");
        cipher.put("й", "12@^");
        cipher.put("К", "13%&");
        cipher.put("к", "13ар");
        cipher.put("Л", "144gk");
        cipher.put("л", "14hn");
        cipher.put("М", "15ivu");
        cipher.put("м", "15au");
        cipher.put("Н", "16vu");
        cipher.put("н", "16hj");
        cipher.put("О", "176g");
        cipher.put("о", "171sdf");
        cipher.put("П", "18in");
        cipher.put("п", "181oi");
        cipher.put("Р", "19jhb");
        cipher.put("р", "1915if");
        cipher.put("С", "20&d");
        cipher.put("с", "20^D");
        cipher.put("Т", "21%SD");
        cipher.put("т", "211Sd");
        cipher.put("У", "2545S");
        cipher.put("у", "2232HJ");
        cipher.put("Ф", "23&%");
        cipher.put("ф", "23%{");
        cipher.put("Х", "24VB");
        cipher.put("х", "24DFG");
        cipher.put("Ц", "25GFD");
        cipher.put("ц", "25SDFc");
        cipher.put("Ч", "26SDFc");
        cipher.put("ч", "26fSd");
        cipher.put("Ш", "27{]");
        cipher.put("ш", "27010");
        cipher.put("Щ", "28gnb");
        cipher.put("щ", "28hr");
        cipher.put("Ь", "31{45");
        cipher.put("ь", "31dag[");
        cipher.put("Ю", "33[)}");
        cipher.put("ю", "33ni");
        cipher.put("Я", "345h");
        cipher.put("я", "34sdf");
        cipher.put("1", "5hf");
        cipher.put("2", "6hf");
        cipher.put("3", "7hf");
        cipher.put("4", "4gjf");
        cipher.put("5", "hg%hf");
        cipher.put("6", "1sdf");
        cipher.put("7", "1%fgf");
        cipher.put("8", "gff");
        cipher.put("9", "1f3hf");
        cipher.put("0", "5khf");
        cipher.put("A", "6c");
        cipher.put("a", "7fvc");
        cipher.put("B", "8hg");
        cipher.put("b", "94hf");
        cipher.put("C", "6fd");
        cipher.put("c", "gf");
        cipher.put("D", "hgj");
        cipher.put("d", "h7");
        cipher.put("E", "fgh");
        cipher.put("e", "463");
        cipher.put("F", "fg4");
        cipher.put("f", "gnb");
        cipher.put("G", "45hd");
        cipher.put("g", "fg43");
        cipher.put("H", "dfg4");
        cipher.put("h", "46sd");
        cipher.put("I", "j57");
        cipher.put("i", "jgf");
        cipher.put("J", "456");
        cipher.put("j", "?3fd");
        cipher.put("K", "%dh5");
        cipher.put("k", "54");
        cipher.put("L", "hjg4");
        cipher.put("l", "jg4");
        cipher.put("M", "64%");
        cipher.put("m", "hg34");
        cipher.put("N", "jh4");
        cipher.put("n", "jhg54gf");
        cipher.put("O", "{}23");
        cipher.put("o", "$26h");
        cipher.put("P", "<>3f");
        cipher.put("p", "ghg4");
        cipher.put("Q", "jh?");
        cipher.put("q", "fds.");
        cipher.put("R", "$^/");
        cipher.put("r", "fas64");
        cipher.put("S", "fds4");
        cipher.put("s", "fsd345");
        cipher.put("T", "g4fgh");
        cipher.put("t", "gf4[");
        cipher.put("U", "gfdOP");
        cipher.put("u", "hjg");
        cipher.put("V", "65g3");
        cipher.put("v", "hgh?34");
        cipher.put("W", "gfd{4");
        cipher.put("w", "gf354");
        cipher.put("X", "nv4k");
        cipher.put("x", "nfg");
        cipher.put("Y", "4%$");
        cipher.put("y", "4hf");
        cipher.put("Z", "65gb");
        cipher.put("z", "6%");
        cipher.put("-", "sgf54h");
        cipher.put("=", "sdf4g");
        cipher.put(".", "sd.c");
        cipher.put(",", "sd.gh");
        cipher.put("?", "sdy4");
        cipher.put("!", "sd64h");
        cipher.put("/", "sdx");
        cipher.put("'", "sd34");
        cipher.put("(", "dfd4");
        cipher.put(")", "sfc4");
        cipher.put("[", "sd344");
        cipher.put("]", "sfg4");
        cipher.put("{", "h5f");
        cipher.put("}", "hg34f");
        cipher.put(";", "hfg4f");
        cipher.put(":", "gh43");
        cipher.put("\"", "hg4f2");
        cipher.put("<", "gfd3f");
        cipher.put(">", "hgf34d{");
        cipher.put("|", "gff4f");
        cipher.put("_", "g7c");
        return cipher;
    }

    public static Map<String, String> getInvertCoderSet() {
        Map<String, String> inverseMap = new HashMap<>();
        getCoderSet().forEach((key, value) -> inverseMap.put(value, key));
        return inverseMap;
    }

    public static String Encoder(String text) {
        String[] textArray = text.split("");
        Map<String, String> coderSet = Dictionary.getCoderSet();
        StringBuilder encodedText = new StringBuilder();
        for (String s : textArray) {
            if (s.equals("") || s.equals(" ") || s.equals("null")) {
                encodedText.append(" ");
            } else {
                encodedText.append(coderSet.get(s)).append(" ");
            }
        }
        System.out.println("Закодований вигляд був доданий у буфер обміну. CTRL + V щоб вставити.");
        System.out.println("Зашифрований вигляд:");
        return encodedText.toString().trim();
    }

    public static String Decoder(String text) {
        String[] textArray = text.split(" ");
        StringBuilder decodedText = new StringBuilder();
        for (String s : textArray) {
            if (s.equals("") || s.equals(" ") || s.equals("null")) {
                decodedText.append(" ");
            } else {
                decodedText.append(getInvertCoderSet().get(s));
            }
        }
        System.out.println("Розшифрований вигляд: ");
        return decodedText.toString();
    }

}