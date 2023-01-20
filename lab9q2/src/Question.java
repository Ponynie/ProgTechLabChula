public class Question {
    //Field-----------------------------------------------------------------------
    private String text , answer;
    //Contructor------------------------------------------------------------------
    public Question(String text) {
        this.text = text;
    }
    public Question() {
        this.text = "";
    }
    //Method----------------------------------------------------------------------
    public void setText(String text) {
        this.text = text;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getText() {
        return this.text;
    }
    public String getAnswer() {
        return this.answer;
    }
    public boolean checkAnswer(String response) {
        return response.equals(this.answer);
    }
    public void display() {
        System.out.println(text);
    }
    
}
