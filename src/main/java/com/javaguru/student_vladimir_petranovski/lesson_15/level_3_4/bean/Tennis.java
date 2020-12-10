package com.javaguru.student_vladimir_petranovski.lesson_15.level_3_4.bean;

import java.util.Objects;

public class Tennis {

    private final String playerOneName;
    private final String playerTwoName;
    private int amountPointsFirstPlayer;
    private int amountPointsSecondPlayer;

    public Tennis(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.amountPointsFirstPlayer = 0;
        this.amountPointsSecondPlayer = 0;
    }

    public String getPlayerOneName() {
        return playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public int getAmountPointsFirstPlayer() {
        return amountPointsFirstPlayer;
    }

    public void setAmountPointsFirstPlayer(int amountPointsFirstPlayer) {
        this.amountPointsFirstPlayer = amountPointsFirstPlayer;
    }

    public int getAmountPointsSecondPlayer() {
        return amountPointsSecondPlayer;
    }

    public void setAmountPointsSecondPlayer(int amountPointsSecondPlayer) {
        this.amountPointsSecondPlayer = amountPointsSecondPlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tennis tennis = (Tennis) o;
        return amountPointsFirstPlayer == tennis.amountPointsFirstPlayer && amountPointsSecondPlayer == tennis.amountPointsSecondPlayer && Objects.equals(playerOneName, tennis.playerOneName) && Objects.equals(playerTwoName, tennis.playerTwoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerOneName, playerTwoName, amountPointsFirstPlayer, amountPointsSecondPlayer);
    }

    @Override
    public String toString() {
        return "Tennis{" +
                "playerOneName='" + playerOneName + '\'' +
                ", playerTwoName='" + playerTwoName + '\'' +
                ", scorePlayerOne=" + amountPointsFirstPlayer +
                ", scorePlayerTwo=" + amountPointsSecondPlayer +
                '}';
    }
}
