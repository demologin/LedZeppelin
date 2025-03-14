package com.javarush.led.module01.lesson09;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class CurrencyProcessor {
    public static void main(String[] args) {
        String data = """
                USD, RUR,       UAH
                    BTN,     EUR, BYR
                USDT
                END
                """;
        Scanner scanner = new Scanner(data);
        StringBuilder text = new StringBuilder();
        for (; ; ) {
            String line = scanner.nextLine().trim();
            if (line.equals("END")) {
                break;
            } else {
                text.append(line).append(" ");
            }
        }

        StringTokenizer tokenizer = new StringTokenizer(text.toString(), ", ");
        int n = tokenizer.countTokens();
        String[] currencies = new String[n];
        for (int i = 0; i < currencies.length; i++) {
            currencies[i] = tokenizer.nextToken();
        }

        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (String currency : currencies) {
            joiner.add(currency);
        }
        String result = joiner.toString();
        System.out.println(result);
    }
}
