package com.rrs.cryptographerfx;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static Map<String, String> getCoderSet() {
        Map<String, String> letters = new HashMap<>();
        letters.put("А", "11%");
        letters.put("а", "14в");
        letters.put("Б", "2ip54");
        letters.put("б", "22f");
        letters.put("В", "4op");
        letters.put("в", "4454");
        letters.put("Г", "5^3");
        letters.put("г", "55&4");
        letters.put("Д", "6fhg");
        letters.put("д", "66SA");
        letters.put("Е", "7ku");
        letters.put("е", "7779");
        letters.put("Ё", "8nm]");
        letters.put("ё", "88sd");
        letters.put("Ж", "9[][");
        letters.put("ж", "995nd");
        letters.put("З", "10d1");
        letters.put("з", "100g");
        letters.put("И", "118n");
        letters.put("и", "111dk");
        letters.put("І", "11354");
        letters.put("і", "1123dm");
        letters.put("Ї", "1&t");
        letters.put("ї", "12dsd");
        letters.put("Й", "12&$");
        letters.put("й", "12@^");
        letters.put("К", "13%&");
        letters.put("к", "13ар");
        letters.put("Л", "144gk");
        letters.put("л", "14hn");
        letters.put("М", "15ivu");
        letters.put("м", "15au");
        letters.put("Н", "16vu");
        letters.put("н", "16hj");
        letters.put("О", "176g");
        letters.put("о", "171sdf");
        letters.put("П", "18in");
        letters.put("п", "181oi");
        letters.put("Р", "19jhb");
        letters.put("р", "1915if");
        letters.put("С", "20&d");
        letters.put("с", "20^D");
        letters.put("Т", "21%SD");
        letters.put("т", "211Sd");
        letters.put("У", "2545S");
        letters.put("у", "2232HJ");
        letters.put("Ф", "23&%");
        letters.put("ф", "23%{");
        letters.put("Х", "24VB");
        letters.put("х", "24DFG");
        letters.put("Ц", "25GFD");
        letters.put("ц", "25SDFc");
        letters.put("Ч", "26SDFc");
        letters.put("ч", "26fSd");
        letters.put("Ш", "27{]");
        letters.put("ш", "27010");
        letters.put("Щ", "28gnb");
        letters.put("щ", "28hr");
        letters.put("Ь", "31{45");
        letters.put("ь", "31dag[");
        letters.put("Ю", "33[)}");
        letters.put("ю", "33ni");
        letters.put("Я", "345h");
        letters.put("я", "34sdf");
        letters.put("1", "5hf");
        letters.put("2", "6hf");
        letters.put("3", "7hf");
        letters.put("4", "4gjf");
        letters.put("5", "hg%hf");
        letters.put("6", "1sdf");
        letters.put("7", "1%fgf");
        letters.put("8", "gff");
        letters.put("9", "1f3hf");
        letters.put("0", "5khf");
        letters.put("A", "6c");
        letters.put("a", "7fvc");
        letters.put("B", "8hg");
        letters.put("b", "94hf");
        letters.put("C", "6fd");
        letters.put("c", "gf");
        letters.put("D", "hgj");
        letters.put("d", "h7");
        letters.put("E", "fgh");
        letters.put("e", "463");
        letters.put("F", "fg4");
        letters.put("f", "gnb");
        letters.put("G", "45hd");
        letters.put("g", "fg43");
        letters.put("H", "dfg4");
        letters.put("h", "463");
        letters.put("I", "j57");
        letters.put("i", "jgf");
        letters.put("J", "456");
        letters.put("j", "?3fd");
        letters.put("K", "%dh5");
        letters.put("k", "54");
        letters.put("L", "hjg4");
        letters.put("l", "jg4");
        letters.put("M", "64%");
        letters.put("m", "hg34");
        letters.put("N", "jh4");
        letters.put("n", "jhg54gf");
        letters.put("O", "{}23");
        letters.put("o", "$26h");
        letters.put("P", "<>3f");
        letters.put("p", "ghg4");
        letters.put("Q", "jh?");
        letters.put("q", "fds.");
        letters.put("R", "$^/");
        letters.put("r", "fas64");
        letters.put("S", "fds4");
        letters.put("s", "fsd345");
        letters.put("T", "g4fgh");
        letters.put("t", "gf4[");
        letters.put("U", "gfdOP");
        letters.put("u", "hjg");
        letters.put("V", "65g3");
        letters.put("v", "hgh?34");
        letters.put("W", "gfd{4");
        letters.put("w", "gf354");
        letters.put("X", "nv4k");
        letters.put("x", "nfg");
        letters.put("Y", "4%$");
        letters.put("y", "4hf");
        letters.put("Z", "65gb");
        letters.put("z", "6%");
        letters.put("-", "sgf54h");
        letters.put("=", "sdf4g");
        letters.put(".", "sd.c");
        letters.put(",", "sd.gh");
        letters.put("?", "sdy4");
        letters.put("!", "sd64h");
        letters.put("/", "sdx");
        letters.put("'", "sd34");
        letters.put("(", "dfd4");
        letters.put(")", "sfc4");
        letters.put("[", "sd344");
        letters.put("]", "sfg4");
        letters.put("{", "h5f");
        letters.put("}", "hg34f");
        letters.put(";", "hfg4f");
        letters.put(":", "gh43");
        letters.put("\"", "hg4f2");
        letters.put("<", "gfd3f");
        letters.put(">", "hgf34d{");
        letters.put("|", "gff4f");
        return letters;
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