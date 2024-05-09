package nz.ac.auckland.se281;

public class AIFactory {
  /**
   * Method to get the AI based on the difficulty.
   *
   * @param difficulty Difficulty of the AI
   * @param roundCount Round number
   * @param playerChoice Odd or Even
   * @param prevWinner Previous winner (AI or human)
   * @param oddCount Number of odd human inputs
   * @param evenCount Number of even human inputs
   * @return the AI
   */
  public static AI getAI(
      String difficulty,
      int roundCount,
      String playerChoice,
      String prevWinner,
      int oddCount,
      int evenCount) {
    // Return the AI based on the difficulty
    switch (difficulty) {
      case "EASY":
        return new EasyAI();
      case "MEDIUM":
        return new MediumAI(roundCount, playerChoice, oddCount, evenCount);
      case "HARD":
        return new HardAI(roundCount, playerChoice, prevWinner, oddCount, evenCount);
      default:
        return null;
    }
  }
}
