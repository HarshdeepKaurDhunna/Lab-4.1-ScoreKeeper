package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Intailize the value
    TextView scoreTeamOne;
    TextView scoreTeamTwo;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnAddA;
    Button btnAddB;
    Button btnSubA;
    Button btnSubB;
    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addAListenerOnButton();
        addBListenerOnButton();

    }

    public void addAListenerOnButton() {
        btnAddA = (Button) findViewById(R.id.buttonAddA);
        btnAddA.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
            scoreTeamOne = findViewById(R.id.scoreTeamOne);
            scoreTeamOne.setText("New Score: " + String.valueOf(teamAScore));
            }

        });

    }
    public void addBListenerOnButton() {
        btnAddB = (Button) findViewById(R.id.buttonAddB);
        btnAddB.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamTwo = findViewById(R.id.scoreTeamTwo);
                scoreTeamTwo.setText("hello1");
            }

        });

    }

    //Method to Get Selected Radio Button Value
    public int onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        //Get the selected Radio Button Id
        switch(view.getId()) {
            case R.id.radioButtonIncreaseOne:
                if (checked)
                    teamAScore = teamAScore + 1;
                break;
            case R.id.radioButtonIncreaseTwo:
                if (checked)
                    teamAScore = teamAScore + 2;
                break;
            case R.id.radioButtonIncreaseThree:
                if (checked)
                    teamAScore = teamAScore + 3;
                break;
        }
        return teamAScore;
    }



}