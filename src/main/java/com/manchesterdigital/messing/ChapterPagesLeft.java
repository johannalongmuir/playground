package com.manchesterdigital.messing;

import java.util.HashMap;
import java.util.Map;

public class ChapterPagesLeft {
    int currentPage;
    int finalPage;

    public ChapterPagesLeft(int currentPage, int finalPage) {
        this.currentPage = currentPage;
        this.finalPage = finalPage;
    }

    protected void printPagesLeft() {
        System.out.println(finalPage - currentPage);
    }


    public static void main(String[] args) {
        int currentPage = 205;
        Map<Integer, Integer> chapterMap = new HashMap<>(
                Map.of(1, 50, 2, 100, 3, 164, 4, 232, 5, 298));
        ChapterPagesLeft chapterPagesLeft = new ChapterPagesLeft(currentPage, chapterMap.get(4));
        chapterPagesLeft.printPagesLeft();
    }
}


