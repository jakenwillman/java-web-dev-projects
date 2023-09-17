package questions;

public class Question {
    public String question;
    public boolean scoring;

    public Question(String question, boolean scoring) {
        this.question = question;
        this.scoring = scoring;
    }

    public String printQuestion(String question) {
        return question;
    }

    public boolean checkAnswers() {
        return true;
    }
}



