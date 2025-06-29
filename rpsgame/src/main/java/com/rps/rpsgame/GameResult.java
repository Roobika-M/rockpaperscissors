package com.rps.rpsgame;

public class GameResult{
    private String playerMove;
    private String computerMove;
    private String result;

    public GameResult(String playerMove, String computerMove, String result){
        this.playerMove = playerMove;
        this.computerMove = computerMove;
        this.result = result;
    }
    public String getPlayerMove(){
        return playerMove;
    }
    public String getComputerMove(){
        return computerMove;
    }
    public String getResult(){
        return result;
    }
}