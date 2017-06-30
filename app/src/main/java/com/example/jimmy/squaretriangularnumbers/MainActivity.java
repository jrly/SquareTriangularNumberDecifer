package com.example.jimmy.squaretriangularnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            class Number{

                int number;

                public boolean isSquare(){
                    double x=1;
                    double squareNumber = 1;

                    while(squareNumber < number){
                        squareNumber = Math.pow(x,2);
                        x++;
                    }

                    if(number == squareNumber){
                        return true;
                    }
                    else{
                        return false;
                    }

                }

                public boolean isTriangular(){

                    int x = 1;

                    int triangularNumber = 1;

                    while(triangularNumber < number){
                        x++;
                        triangularNumber += x;


                    }

                    if (triangularNumber == number){
                        return true;
                    }
                    else{
                        return false;
                    }

                }

            }

    public void test(View view){

        EditText input = (EditText) findViewById(R.id.input);

        if(input.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Please Enter a Number.", Toast.LENGTH_LONG).show();
        }
        else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(input.getText().toString());


            if (myNumber.isTriangular() && myNumber.isSquare()) {
                Toast.makeText(getApplicationContext(), myNumber.number + " is both triangular and square", Toast.LENGTH_LONG).show();
            } else if (myNumber.isTriangular()) {
                Toast.makeText(getApplicationContext(), myNumber.number + " is triangular", Toast.LENGTH_LONG).show();

            } else if (myNumber.isSquare()) {
                Toast.makeText(getApplicationContext(), myNumber.number + " is square", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), myNumber.number + " is neither triangular nor square", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
