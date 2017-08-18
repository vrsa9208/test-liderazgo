package vrsa9208.desarrollo.com.test_liderazgo.questions;

/**
 * Created by vrsa9208 on 17/08/17.
 */

public class Question {

    private int question;

    private int answer_a;
    private int answer_b;
    private int answer_c;
    private int answer_d;

    private int selectedAnswer;

    public Question(int question, int answer_a, int answer_b, int answer_c, int answer_d) {
        this.setQuestion(question);
        this.setAnswer_a(answer_a);
        this.setAnswer_b(answer_b);
        this.setAnswer_c(answer_c);
        this.setAnswer_d(answer_d);
    }


    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getAnswer_a() {
        return answer_a;
    }

    public void setAnswer_a(int answer_a) {
        this.answer_a = answer_a;
    }

    public int getAnswer_b() {
        return answer_b;
    }

    public void setAnswer_b(int answer_b) {
        this.answer_b = answer_b;
    }

    public int getAnswer_c() {
        return answer_c;
    }

    public void setAnswer_c(int answer_c) {
        this.answer_c = answer_c;
    }

    public int getAnswer_d() {
        return answer_d;
    }

    public void setAnswer_d(int answer_d) {
        this.answer_d = answer_d;
    }


    public int getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(int selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
}
