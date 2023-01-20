import java.util.ArrayList;
public class ChoiceQuestion extends Question {
    //Field------------------------------------------------------------------
    private ArrayList<String> choices = new ArrayList<String>();
    //Contructor-------------------------------------------------------------
    public ChoiceQuestion(String text) {
        super(text);
    }
    //Method-----------------------------------------------------------------
    public void addChoice(String choice, boolean correct) {
        this.choices.add(choice);
        if (correct) {
            setAnswer(choice);
        }
    }
    public void display() {
        System.out.println(getText());
        for (int i = 1 ; i <= choices.size() ; i++) {
            System.out.println(String.valueOf(i) + ": " + choices.get(i-1));
        }
    }
    public boolean checkAnswer(String response) {
        byte ans = Byte.parseByte(response);
        return this.choices.get(ans-1).equals(getAnswer());
    }
}
