package com.example.ilakyawork.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.AdapterView;


import java.util.ArrayList;

public class CalorineConversion extends AppCompatActivity {

    public static boolean isNumeric(String str)
    {
        try
        {
            int d = Integer.parseInt(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorine_conversion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.exercises_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //WHEN USER CHANGES THEIR EXERCISE TYPE
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Get the type of exercise the user did
                String typeExercise = (String) parentView.getItemAtPosition(position);

                TextView exerciseUnit = (TextView) findViewById(R.id.exerciseunit);

                // Get the amount of the exercise the user did
                EditText amtExercise = (EditText) findViewById(R.id.workouttype);
                int numberAmtExercise = 0;
                if (isNumeric(amtExercise.getText().toString())) {
                    numberAmtExercise = Integer.parseInt(amtExercise.getText().toString());
                }

                // Get the view where updated calorie info should be displayed
                TextView calsText = (TextView) findViewById(R.id.cals_burned_text);
                double calsBurned = 0.0;

                Spinner spinner2 = (Spinner) findViewById(R.id.equivalent_spinner);
                String currentConversionExercise = spinner2.getSelectedItem().toString();
                TextView amtConvertedExerciseToDisplay = (TextView) findViewById(R.id.equivalent_cals);
                double amtConvertedExerciseToDisplayNum = 0;

                int conversion_factor = 0;
                switch (currentConversionExercise) {
                    case "Situp":
                        conversion_factor = 200;
                        break;
                    case "Pushup":
                        conversion_factor = 350;
                        break;
                    case "Jumping Jacks":
                        conversion_factor = 10;
                        break;
                    case "Jogging":
                        conversion_factor = 12;
                        break;
                    case "Squats":
                        conversion_factor = 225;
                        break;
                    case "Leg-lift":
                        conversion_factor = 25;
                        break;
                    case "Plank":
                        conversion_factor = 25;
                        break;
                    case "Pullup":
                        conversion_factor = 100;
                        break;
                    case "Cycling":
                        conversion_factor = 12;
                        break;
                    case "Walking":
                        conversion_factor = 20;
                        break;
                    case "Swimming":
                        conversion_factor = 13;
                        break;
                    case "Stair-Climbing":
                        conversion_factor = 15;
                        break;
                    default:
                        break;
                }

                switch (typeExercise) {
                    case "Situp":
                        exerciseUnit.setText("Reps ");
                        calsBurned = ((double) 100 / (double) 200) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Pushup":
                        exerciseUnit.setText("Reps ");
                        calsBurned = ((double) 100 / (double) 350) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Jumping Jacks":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 10) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Jogging":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 12) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Squats":
                        exerciseUnit.setText("Reps ");
                        calsBurned = ((double) 100 / (double) 225) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Leg-lift":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 25) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Plank":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 25) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Pullup":
                        exerciseUnit.setText("Reps ");
                        calsBurned = ((double) 100 / (double) 100) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Cycling":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 12) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Walking":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 20) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Swimming":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 13) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Stair-Climbing":
                        exerciseUnit.setText("Mins ");
                        calsBurned = ((double) 100 / (double) 15) * (double) numberAmtExercise;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    default:
                        calsText.setText("0");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        Spinner spinner2 = (Spinner) findViewById(R.id.equivalent_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Get the type of exercise the user wants to find equivalent of
                String typeExercise = (String) parentView.getItemAtPosition(position);

                // Get the amount of calories we're going to have to find equivalent of
                TextView calsToConvertTV = (TextView) findViewById(R.id.cals_burned_text);
                double calsToConvert = Double.parseDouble(calsToConvertTV.getText().toString());

                TextView exerciseUnit = (TextView) findViewById(R.id.equivalent_ex_units);

                TextView amtExerciseToDisplay = (TextView) findViewById(R.id.equivalent_cals);
                double amtExerciseToDisplayNum = 0;

                switch (typeExercise) {
                    case "Situp":
                        exerciseUnit.setText(" Reps ");
                        amtExerciseToDisplayNum = ((double) 200 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Pushup":
                        exerciseUnit.setText(" Reps ");
                        amtExerciseToDisplayNum = ((double) 350 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Jumping Jacks":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 10 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Jogging":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 12 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Squats":
                        exerciseUnit.setText(" Reps ");
                        amtExerciseToDisplayNum = ((double) 225 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Leg-lift":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 25 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Plank":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 25 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Pullup":
                        exerciseUnit.setText(" Reps ");
                        amtExerciseToDisplayNum = ((double) 100 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Cycling":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 12 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Walking":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 20 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Swimming":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 13 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    case "Stair-Climbing":
                        exerciseUnit.setText(" Mins ");
                        amtExerciseToDisplayNum = ((double) 15 / (double) 100) * (double) calsToConvert;
                        amtExerciseToDisplay.setText(Integer.toString((int)amtExerciseToDisplayNum));
                        break;
                    default:
                        amtExerciseToDisplay.setText("0");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        // WHEN USER CHANGES EXERCISE AMOUNT
        EditText userInputAmountExercise = (EditText)findViewById(R.id.workouttype);
        userInputAmountExercise.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Get the type of exercise the user did
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                String currentExercise = spinner.getSelectedItem().toString();

                // Get the view where updated calorie info should be displayed
                TextView calsText = (TextView) findViewById(R.id.cals_burned_text);
                double calsBurned = 0.0;

                // amount of reps or amount of exercise
                int userExerciseAmount = 0;
                if (isNumeric(s.toString())) {
                    userExerciseAmount = Integer.parseInt(s.toString());
                }

                Spinner spinner2 = (Spinner) findViewById(R.id.equivalent_spinner);
                String currentConversionExercise = spinner2.getSelectedItem().toString();
                TextView amtConvertedExerciseToDisplay = (TextView) findViewById(R.id.equivalent_cals);
                double amtConvertedExerciseToDisplayNum = 0;

                int conversion_factor = 0;
                switch (currentConversionExercise) {
                    case "Situp":
                        conversion_factor = 200;
                        break;
                    case "Pushup":
                        conversion_factor = 350;
                        break;
                    case "Jumping Jacks":
                        conversion_factor = 10;
                        break;
                    case "Jogging":
                        conversion_factor = 12;
                        break;
                    case "Squats":
                        conversion_factor = 225;
                        break;
                    case "Leg-lift":
                        conversion_factor = 25;
                        break;
                    case "Plank":
                        conversion_factor = 25;
                        break;
                    case "Pullup":
                        conversion_factor = 100;
                        break;
                    case "Cycling":
                        conversion_factor = 12;
                        break;
                    case "Walking":
                        conversion_factor = 20;
                        break;
                    case "Swimming":
                        conversion_factor = 13;
                        break;
                    case "Stair-Climbing":
                        conversion_factor = 15;
                        break;
                    default:
                        break;
                }

                switch (currentExercise) {
                    case "Situp":
                        calsBurned = ((double) 100 / (double) 200) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Pushup":
                        calsBurned = ((double) 100 / (double) 350) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Jumping Jacks":
                        calsBurned = ((double) 100 / (double) 10) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Jogging":
                        calsBurned = ((double) 100 / (double) 12) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Squats":
                        calsBurned = ((double) 100 / (double) 225) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Leg-lift":
                        calsBurned = ((double) 100 / (double) 25) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Plank":
                        calsBurned = ((double) 100 / (double) 25) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Pullup":
                        calsBurned = ((double) 100 / (double) 100) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Cycling":
                        calsBurned = ((double) 100 / (double) 12) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Walking":
                        calsBurned = ((double) 100 / (double) 20) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Swimming":
                        calsBurned = ((double) 100 / (double) 13) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    case "Stair-Climbing":
                        calsBurned = ((double) 100 / (double) 15) * (double) userExerciseAmount;
                        calsText.setText(Integer.toString((int)calsBurned));
                        amtConvertedExerciseToDisplayNum = ((double) conversion_factor / (double) 100) * (double) calsBurned;
                        amtConvertedExerciseToDisplay.setText(Integer.toString((int)amtConvertedExerciseToDisplayNum));
                        break;
                    default:
                        calsText.setText("0");
                }
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calorine_conversion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
