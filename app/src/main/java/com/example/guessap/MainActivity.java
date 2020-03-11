package com.example.guessap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    public void jaccuzi(View view)
    {
        EditText entervalue= findViewById(R.id.entervalue);
        final int random = new Random().nextInt(10);
        int userguess= Integer.parseInt(entervalue.getText().toString());
        if (userguess > random)
        {
            Toast.makeText(this,"Go Lower",Toast.LENGTH_SHORT).show();
        }
        else if(userguess<random)
        {
            Toast.makeText(this,"Go Higher",Toast.LENGTH_SHORT).show();
        }
        else if(userguess==random)
        {
            Toast.makeText(this,"Correct Guess",Toast.LENGTH_SHORT).show();
        }
        else
            {
                Toast.makeText(this,"Invalid Entry",Toast.LENGTH_SHORT).show();
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
