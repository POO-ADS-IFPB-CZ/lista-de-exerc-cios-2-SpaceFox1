package src.utils;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class Scanner {
    java.util.Scanner scanner;

    public Scanner() {
        this(false);
    }

    public Scanner(boolean ignoreCommaFormat) {
        this.scanner = new java.util.Scanner(System.in);

        if (!ignoreCommaFormat) {
            String localeChecker = NumberFormat.getInstance().format(1.5);
            if (localeChecker.contains(",")) {
                System.out.println("Usar , (Virgula) para casas decimais? (S/n)");
                String response = readString();
                if (!Objects.equals(response.trim(), "") && !response.trim().toLowerCase().startsWith("s")) {
                    scanner.useLocale(Locale.ROOT);
                }
            }
        }
    }

    public double readDouble() {
        System.out.print("> ");
        double a = this.scanner.nextDouble();
        System.out.println();
        return a;
    }

    public int readInt() {
        System.out.print("> ");
        int a = this.scanner.nextInt();
        this.scanner.nextLine();
        System.out.println();
        return a;
    }

    public String readString() {
        System.out.print("> ");
        String a = this.scanner.nextLine();
        System.out.println();
        return a;
    }

    public double askDouble(String Question) {
        System.out.println(Question);
        return readDouble();
    }

    public int askInt(String Question) {
        System.out.println(Question);
        return readInt();
    }

    public String askString(String Question) {
        System.out.println(Question);
        return readString();
    }
}
