package src.utils;

import java.security.KeyPair;
import java.util.ArrayList;

public class Caixa {
    private Boolean centerTitle = false;
    private int width = 0;
    private ArrayList<String> lines = new ArrayList<>();
    private ArrayList<Boolean> linesCentering = new ArrayList<>();
    private String title;

    public void setWidth(int width) {
        if (width > this.width) this.width = width;
    }

    public Caixa(String Title) {
        this(Title, false);
    }

    public Caixa() {
        this("", false);
    }

    public Caixa(int minWidth) {
        this("", false);
        this.width = minWidth;
    }

    public Caixa(String Title, boolean centerTitle) {
        this.title = Title;
        this.centerTitle = centerTitle;
        this.setWidth(Title.length() + 6);
    }

    public void writeLine(String text) {
        this.lines.add(text);
        this.linesCentering.add(false);
        this.setWidth(text.length() + 4);
    }

    public void writeCenterText(String text) {
        this.lines.add(text);
        this.linesCentering.add(true);
        this.setWidth(text.length() + 4);
    }

    public void draw() {
        String encasedTitle = this.title.isEmpty() ? "──" : "[" + this.title + "]";
        int remainingSpaces = ((this.width - 2) - encasedTitle.length());
        int amountOfDashes = centerTitle ? remainingSpaces / 2 : remainingSpaces - 1;

        System.out.printf("┌%s%s%s┐\n", "─".repeat(centerTitle ? amountOfDashes : 1), encasedTitle, "─".repeat(amountOfDashes));

        this.lines.forEach((line) -> {
            boolean isLineCentered = this.linesCentering.get(this.lines.indexOf(line));
            int amountOfSpaces = (this.width - 4) - line.length();
            System.out.printf("│ %s%s%s │\n",
                    " ".repeat(!isLineCentered ? 0 : (int) Math.ceil((double) amountOfSpaces / 2)),
                    line,
                    " ".repeat(!isLineCentered ? amountOfSpaces : (int) Math.floor((double) amountOfSpaces / 2))
            );
        });

        System.out.printf("└%s┘\n", "─".repeat(this.width - 2));
    }
}
