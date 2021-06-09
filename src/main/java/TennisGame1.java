import java.util.HashMap;

public class TennisGame1 implements TennisGame {
    
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            scorePlayer1++;
        else
            scorePlayer2++;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (scorePlayer1 == scorePlayer2)
        {
            score = getTieResults();
        }
        else if (scorePlayer1 >=4 || scorePlayer2 >=4)
        {
            int minusResult = scorePlayer1 - scorePlayer2;
            score = getWinnerOrAdvantage(minusResult);
        }
        else
        {
            score = getTempResult(score);
        }
        return score;
    }

    private String getTempResult(String score) {
        HashMap<Integer, String> nameScore = new HashMap<>();
        nameScore.put(0, "Love");
        nameScore.put(1, "Fifteen");
        nameScore.put(2, "Thirty");
        nameScore.put(3, "Forty");

        return nameScore.get(scorePlayer1) + "-" + nameScore.get(scorePlayer2);
        
    }

    private String getWinnerOrAdvantage(int minusResult) {
        String score;
        if (minusResult ==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult >=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String getTieResults() {
        String score;
        switch (scorePlayer1)
        {
            case 0:
                    score = "Love-All";
                break;
            case 1:
                    score = "Fifteen-All";
                break;
            case 2:
                    score = "Thirty-All";
                break;
            default:
                    score = "Deuce";
                break;

        }
        return score;
    }
}
