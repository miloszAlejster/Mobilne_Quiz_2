package com.example.quiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private Button hintButton;
    private TextView questionTextView;
    private int currentIndex = 0;
    private static final String KEY_CURRENT_INDEX = "currentIndex";
    public static final String KEY_EXTRA_ANSWER = "com.example.quiz.correctAnswer";
    private static final int REQUEST_CODE_PROMPT = 0;
    private boolean answerWasShown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "got into create");
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) {
            currentIndex = savedInstanceState.getInt(KEY_CURRENT_INDEX);
        }
        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        nextButton = findViewById(R.id.next_button);
        questionTextView = findViewById(R.id.question);
        hintButton = findViewById(R.id.hint_button);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isAnswerCorrect(true);
            }
        });
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isAnswerCorrect(false);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentIndex = (currentIndex + 1)%questions.length;
                answerWasShown = false;
                setNextQuestion();
            }
        });
        setNextQuestion();
        hintButton.setOnClickListener((v)-> {
            Intent intent = new Intent(MainActivity.this, PromptActivity.class);
            boolean correctAnswer = questions[currentIndex].trueAnswer;
            intent.putExtra(KEY_EXTRA_ANSWER, correctAnswer);
            startActivity(intent);
            // still works though
            startActivityForResult(intent, REQUEST_CODE_PROMPT);
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode != RESULT_OK) { return; }
        if(requestCode == REQUEST_CODE_PROMPT){
            if (data == null) { return; }
            answerWasShown = data.getBooleanExtra(PromptActivity.KEY_EXTRA_ANSWER_SHOWN, false);
        }
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "got into start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "got into resume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "got into pause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity", "got into stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "got into destroy");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_CURRENT_INDEX, currentIndex);
    }

    private Question[] questions = new Question[]{
            new Question(R.string.q_activity, true),
            new Question(R.string.q_find_resources, false),
            new Question(R.string.q_listeners, true),
            new Question(R.string.q_resources, true),
            new Question(R.string.q_version, false)
    };

    private void isAnswerCorrect(boolean userAnswer){
        int resaultMessageId = 0;
        if(answerWasShown){
            resaultMessageId = R.string.shown_answer;
        }else{
            if(userAnswer == questions[currentIndex].trueAnswer){
                resaultMessageId = R.string.correct_answer;
            }else {
                resaultMessageId = R.string.incorrert_answer;
            }
        }
        Toast.makeText(this, resaultMessageId, Toast.LENGTH_SHORT).show();
    }

    private void setNextQuestion(){
        questionTextView.setText(questions[currentIndex].questionId);
    }

}