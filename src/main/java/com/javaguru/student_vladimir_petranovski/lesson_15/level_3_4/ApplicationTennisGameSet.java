package com.javaguru.student_vladimir_petranovski.lesson_15.level_3_4;

import com.javaguru.student_vladimir_petranovski.lesson_15.level_3_4.bean.Tennis;
import com.javaguru.student_vladimir_petranovski.lesson_15.level_3_4.service.TennisGameImpl;

class ApplicationTennisGameSet {

    public static void main(String[] args) {
        Tennis oneSet = new Tennis("player1", "player2");
        TennisGameImpl set = new TennisGameImpl(oneSet);
        System.out.println(set.score());
        set.wonPoint("player1");
        System.out.println(set.score());
        set.wonPoint("player1");
        System.out.println(set.score());
        set.wonPoint("player1");
        System.out.println(set.score());
        set.wonPoint("player2");
        System.out.println(set.score());
        set.wonPoint("player2");
        System.out.println(set.score());
        set.wonPoint("player2");
        System.out.println(set.score());
        set.wonPoint("player2");
        System.out.println(set.score());
        set.wonPoint("player2");
        System.out.println(set.score());
    }
}
