package com.javaguru.student_vladimir_petranovski.lesson_15.level_3.service;

import com.javaguru.student_vladimir_petranovski.lesson_15.level_3.bean.Tennis;

public class TennisGameImpl implements TennisGame {

    private final Tennis tennis;

    public TennisGameImpl(Tennis tennis) {
        this.tennis = tennis;
    }

    @Override
    public void wonPoint(String playerWhoWonPointName) {

        if (tennis.getPlayerOneName().equals(playerWhoWonPointName)) {
            tennis.setAmountPointsFirstPlayer(tennis.getAmountPointsFirstPlayer() + 1);

        } else {
            tennis.setAmountPointsSecondPlayer(tennis.getAmountPointsSecondPlayer() + 1);
        }
    }

    @Override
    public String score() {
        String resultScore = "";
//        if (tennis.getAmountPointsFirstPlayer() == 0 && tennis.getAmountPointsSecondPlayer() == 0) {
//            result = "Love - Love";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 1 && tennis.getAmountPointsSecondPlayer() == 0) {
//            result = "Fifteen - Love";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 2 && tennis.getAmountPointsSecondPlayer() == 0) {
//            result = "Thirty - Love";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 3 && tennis.getAmountPointsSecondPlayer() == 0) {
//            result = "Forty - Love";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 0 && tennis.getAmountPointsSecondPlayer() == 1) {
//            result = "Love - Fifteen";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 0 && tennis.getAmountPointsSecondPlayer() == 2) {
//            result = "Love - Thirty";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 0 && tennis.getAmountPointsSecondPlayer() == 3) {
//            result = "Love - Forty";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 1 && tennis.getAmountPointsSecondPlayer() == 1) {
//            result = "Fifteen - Fifteen";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 2 && tennis.getAmountPointsSecondPlayer() == 2) {
//            result = "Thirty - Thirty";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 2 && tennis.getAmountPointsSecondPlayer() == 1) {
//            result = "Thirty - Fifteen";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 3 && tennis.getAmountPointsSecondPlayer() == 1) {
//            result = "Forty - Fifteen";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 3 && tennis.getAmountPointsSecondPlayer() == 2) {
//            result = "Forty - Thirty";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 1 && tennis.getAmountPointsSecondPlayer() == 2) {
//            result = "Fifteen - Thirty";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 2 && tennis.getAmountPointsSecondPlayer() == 3) {
//            result = "Thirty - Forty";
//        }
//        if (tennis.getAmountPointsFirstPlayer() >= 3
//                && tennis.getAmountPointsFirstPlayer() == tennis.getAmountPointsSecondPlayer()) {
//            result = "Deuce";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == 4
//                && tennis.getAmountPointsSecondPlayer() < 3) {
//            result = "Win player1";
//        }
//        if (tennis.getAmountPointsFirstPlayer() < 3 && tennis.getAmountPointsSecondPlayer() == 4) {
//            result = "Win player2";
//        }
//        if (tennis.getAmountPointsFirstPlayer() >= 3
//                && tennis.getAmountPointsSecondPlayer() == tennis.getAmountPointsFirstPlayer() + 1) {
//            result = "Advantage player2";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == tennis.getAmountPointsSecondPlayer() + 1
//                && tennis.getAmountPointsSecondPlayer() >= 3) {
//            result = "Advantage player1";
//        }
//        if (tennis.getAmountPointsFirstPlayer() == tennis.getAmountPointsSecondPlayer() + 2
//                && tennis.getAmountPointsSecondPlayer() >= 3) {
//            result = "Win player1";
//        }
//        if (tennis.getAmountPointsFirstPlayer() >= 3
//                && tennis.getAmountPointsSecondPlayer() == tennis.getAmountPointsFirstPlayer() + 2) {
//            result = "Win player2";
//        }
        if (tennis.getAmountPointsFirstPlayer() < 4 && tennis.getAmountPointsSecondPlayer() < 4
                && !(tennis.getAmountPointsFirstPlayer() + tennis.getAmountPointsSecondPlayer() == 6)) {
            String[] arrayPoints = {"Love", "Fifteen", "Thirty", "Forty"};
//            String str = arrayPoints[tennis.getAmountPointsFirstPlayer()];
//            resultScore = (tennis.getAmountPointsFirstPlayer() == tennis.getAmountPointsSecondPlayer())
//                    ? str + "-All" : str + "-" + arrayPoints[tennis.getAmountPointsSecondPlayer()];
            resultScore = arrayPoints[tennis.getAmountPointsFirstPlayer()] + " - "
                    + arrayPoints[tennis.getAmountPointsSecondPlayer()];
        } else {
            if (tennis.getAmountPointsFirstPlayer() == tennis.getAmountPointsSecondPlayer()) {
                resultScore = "Deuce";
            } else {
//                String str = (tennis.getAmountPointsFirstPlayer() > tennis.getAmountPointsSecondPlayer())
//                        ? tennis.getPlayerOneName() : tennis.getPlayerTwoName();
//            if (Math.abs(tennis.getAmountPointsFirstPlayer() - tennis.getAmountPointsSecondPlayer()) == 1
//                    && tennis.getAmountPointsFirstPlayer() > tennis.getAmountPointsSecondPlayer()) {
//                resultScore = "Advantage " + str;
//            } else {
//                resultScore = "Win " + str;
//            }

                String str = (tennis.getAmountPointsFirstPlayer() > tennis.getAmountPointsSecondPlayer())
                        ? tennis.getPlayerOneName() : tennis.getPlayerTwoName();
                resultScore = Math.abs(tennis.getAmountPointsFirstPlayer() - tennis.getAmountPointsSecondPlayer()) == 1
                        ? "Advantage " + str : "Win for " + str;
            }
        }

        return resultScore;
    }
}
