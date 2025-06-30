package com.rps.rpsgame;
import org.springframework.web.bind.annotation.*;
import java.until.Random;

@RestController
@RequestMapping("/api")
public class GameController{
    @PostMapping("/play")
    public GameResult play(@RequestParam String playerMove) {
        String[] choices = {"rock", "paper", "scissors"};
        String computerMove = choices[new Random().nextInt(3)];

        String result;
        if (playerMove.equals(computerMove)) {
            result = "draw";
        } else if (
            (playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper"))
        ) {
            result = "win";
        } else {
            result = "lose";
        }

        return new GameResult(playerMove, computerMove, result);
    }
}