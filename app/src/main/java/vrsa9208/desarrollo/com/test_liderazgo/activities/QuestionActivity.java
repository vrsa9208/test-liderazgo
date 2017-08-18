package vrsa9208.desarrollo.com.test_liderazgo.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import vrsa9208.desarrollo.com.test_liderazgo.R;
import vrsa9208.desarrollo.com.test_liderazgo.questions.Question;

public class QuestionActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private int radioSelected;
    private int questionIndex;

    private final List<Question> questions;
    {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.question_1, R.string.answer_1_a, R.string.answer_1_b, R.string.answer_1_c, R.string.answer_1_d));
        questions.add(new Question(R.string.question_2, R.string.answer_2_a, R.string.answer_2_b, R.string.answer_2_c, R.string.answer_2_d));
        questions.add(new Question(R.string.question_3, R.string.answer_3_a, R.string.answer_3_b, R.string.answer_3_c, R.string.answer_3_d));
        questions.add(new Question(R.string.question_4, R.string.answer_4_a, R.string.answer_4_b, R.string.answer_4_c, R.string.answer_4_d));
        questions.add(new Question(R.string.question_5, R.string.answer_5_a, R.string.answer_5_b, R.string.answer_5_c, R.string.answer_5_d));
        questions.add(new Question(R.string.question_6, R.string.answer_6_a, R.string.answer_6_b, R.string.answer_6_c, R.string.answer_6_d));
        questions.add(new Question(R.string.question_7, R.string.answer_7_a, R.string.answer_7_b, R.string.answer_7_c, R.string.answer_7_d));
        questions.add(new Question(R.string.question_8, R.string.answer_8_a, R.string.answer_8_b, R.string.answer_8_c, R.string.answer_8_d));
        questions.add(new Question(R.string.question_9, R.string.answer_9_a, R.string.answer_9_b, R.string.answer_9_c, R.string.answer_9_d));
        questions.add(new Question(R.string.question_10, R.string.answer_10_a, R.string.answer_10_b, R.string.answer_10_c, R.string.answer_10_d));
        questions.add(new Question(R.string.question_11, R.string.answer_11_a, R.string.answer_11_b, R.string.answer_11_c, R.string.answer_11_d));
        questions.add(new Question(R.string.question_12, R.string.answer_12_a, R.string.answer_12_b, R.string.answer_12_c, R.string.answer_12_d));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ((RadioGroup) findViewById(R.id.radio_group_answers)).setOnCheckedChangeListener(this);
        findViewById(R.id.btn_previous).setOnClickListener(this);
        findViewById(R.id.btn_next).setOnClickListener(this);

        setQuestion(questions.get(questionIndex));
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch(checkedId){
            case R.id.radio_btn_answer_1:
                this.radioSelected = 1;
                break;
            case R.id.radio_btn_answer_2:
                this.radioSelected = 2;
                break;
            case R.id.radio_btn_answer_3:
                this.radioSelected = 3;
                break;
            case R.id.radio_btn_answer_4:
                this.radioSelected = 4;
                break;
            default:
                this.radioSelected = 0;
                break;
        }
    }

    private void setQuestion(Question question){
        ((TextView) findViewById(R.id.text_view_question)).setText(question.getQuestion());
        ((RadioButton) findViewById(R.id.radio_btn_answer_1)).setText(question.getAnswer_a());
        ((RadioButton) findViewById(R.id.radio_btn_answer_2)).setText(question.getAnswer_b());
        ((RadioButton) findViewById(R.id.radio_btn_answer_3)).setText(question.getAnswer_c());
        ((RadioButton) findViewById(R.id.radio_btn_answer_4)).setText(question.getAnswer_d());

        switch (question.getSelectedAnswer()){
            case 1:
                ((RadioButton) findViewById(R.id.radio_btn_answer_1)).setSelected(true);
                break;
            case 2:
                ((RadioButton) findViewById(R.id.radio_btn_answer_2)).setSelected(true);
                break;
            case 3:
                ((RadioButton) findViewById(R.id.radio_btn_answer_3)).setSelected(true);
                break;
            case 4:
                ((RadioButton) findViewById(R.id.radio_btn_answer_4)).setSelected(true);
                break;
        }
    }

    private void showPreviousQuestion(){
        if(this.questionIndex == 0) return;
        this.questionIndex--;

        setQuestion(questions.get(questionIndex));
    }

    private void showNextQuestion(){
        evaluateAnswer();
        if(this.questionIndex + 1 == this.questions.size()){
           getResults();
        }
        else this.questionIndex++;

        setQuestion(questions.get(questionIndex));
    }

    private void getResults(){

    }

    private void evaluateAnswer(){
        questions.get(questionIndex).setSelectedAnswer(radioSelected);
        switch(questionIndex){
            case 0:

                break;

            case 1:

                break;

            case 2:

                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_previous:
                showPreviousQuestion();
                break;
            case R.id.btn_next:
                showNextQuestion();
                break;
        }
    }
}
