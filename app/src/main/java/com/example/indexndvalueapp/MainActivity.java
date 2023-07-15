package com.example.indexndvalueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtindex= findViewById(R.id.txtIndex);
        TextView txtValue = findViewById(R.id.txtValue);
        String oldTxtIndex = "";
        String oldTxtValue = "";

        int[] list= new int[9];
        list[0]= 65;
        list[1]= 45;
        list[2]= 56;
        list[3]= 97;
        list[4]=89 ;
        list[5]=69;

        for(int counter = 0 ; counter <=8; counter++){
            oldTxtValue= txtValue.getText().toString()+ "\n";
            oldTxtIndex= txtindex.getText().toString() + "\n";

            txtindex.setText(oldTxtIndex  + counter + "\n");
            txtValue.setText(oldTxtValue + list[counter] + "\n");
        }
    }
}