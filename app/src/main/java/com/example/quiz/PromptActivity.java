package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PromptActivity extends AppCompatActivity {
    private boolean correctAnswer;
    private Button buttonHint;
    private TextView hintAnswer;
    public static final String KEY_EXTRA_ANSWER_SHOWN = "com.example.quiz.answerShown";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);

        hintAnswer = findViewById(R.id.answer_hint);
        buttonHint = findViewById(R.id.button_hint);

        buttonHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                int answer = correctAnswer ? R.string.button_true : R.string.button_false;
                hintAnswer.setText(answer);
                setAnswerShownResult(true);
            }
        });
    }
    private void setAnswerShownResult(boolean answerWasShown){
        Intent resultIntent = new Intent();
        resultIntent.putExtra(KEY_EXTRA_ANSWER_SHOWN, answerWasShown);
        setResult(RESULT_OK, resultIntent);
    }
}