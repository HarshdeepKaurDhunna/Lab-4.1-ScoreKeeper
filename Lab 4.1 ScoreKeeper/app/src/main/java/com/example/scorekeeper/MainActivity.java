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

    //Declare variables
    TextView scoreTeamOne;
    TextView scoreTeamTwo;

    RadioButton radioBtnOne;
    RadioButton radioBtnTwo;
    RadioButton radioBtnThree;

    Button btnAddA;
    Button btnAddB;
    Button btnSubA;
    Button btnSubB;

    int teamAScore = 0;
    int teamBScore = 0;
    int intVal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize TextView by views in xml file
        scoreTeamOne = findViewById(R.id.scoreTeamOne);
        scoreTeamTwo = findViewById(R.id.scoreTeamTwo);

        //Initialize TextView by views in xml file
        radioBtnOne = findViewById(R.id.radioButtonIncreaseOne);
        radioBtnTwo = findViewById(R.id.radioButtonIncreaseTwo);
        radioBtnThree = findViewById(R.id.radioButtonIncreaseThree);

        //Initialize TextView by views in xml file
        btnAddA = findViewById(R.id.buttonAddA);
        btnAddB = findViewById(R.id.buttonAddB);
        btnSubA = findViewById(R.id.buttonSubA);
        btnSubB = findViewById(R.id.buttonSubB);

        //Initialize TextView by views in xml file
        btnAddA.setOnClickListener(onClickListener);
        btnAddB.setOnClickListener(onClickListener);
        btnSubA.setOnClickListener(onClickListener);
        btnSubB.setOnClickListener(onClickListener);

    }

    /**
     * OnclickListner for all four buttons
     * Switch case to add functionality on buttons
     */
    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.buttonAddA:
                    teamAScore = teamAScore + intVal;
                    scoreTeamOne.setText("New Score: " + String.valueOf(teamAScore));
                    break;
                case R.id.buttonAddB:
                    teamBScore = teamBScore + intVal;
                    scoreTeamTwo.setText("New Score: " + String.valueOf(teamBScore));
                    break;
                case R.id.buttonSubA:
                    teamAScore = teamAScore - intVal;
                    scoreTeamOne.setText("New Score: " + String.valueOf(teamAScore));
                    break;
                case R.id.buttonSubB:
                    teamBScore = teamBScore - intVal;
                    scoreTeamTwo.setText("New Score: " + String.valueOf(teamBScore));
                    break;
            }

        }
    };

    /**
     * Method to get Radio Button value onclick as define in xml
     * @param view
     */
    public void onSelectRadioButton(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        //Get the selected Radio Button Id
        switch(view.getId()) {
            case R.id.radioButtonIncreaseOne:
                if (checked)
                    radioBtnTwo.setChecked(false);
                    radioBtnThree.setChecked(false);
                    intVal = 1;
                break;
            case R.id.radioButtonIncreaseTwo:
                if (checked)
                    radioBtnOne.setChecked(false);
                    radioBtnThree.setChecked(false);
                    intVal = 2;
                break;
            case R.id.radioButtonIncreaseThree:
                if (checked)
                    radioBtnOne.setChecked(false);
                    radioBtnTwo.setChecked(false);
                    intVal = 3;
                break;
        }
    }



}