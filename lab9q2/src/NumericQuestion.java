public class NumericQuestion extends Question {
    //Contructor------------------------------------------------------------------
    public NumericQuestion(String text) {
        super(text);
    }
    //Method----------------------------------------------------------------------
    public boolean checkAnswer(String response) {
        Double responseDouble = Double.valueOf(response);
        return Math.abs(Double.valueOf(getAnswer()) - responseDouble) <= 0.01;
    }
}
