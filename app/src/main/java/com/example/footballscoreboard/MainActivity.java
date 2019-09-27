package com.example.footballscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreOfUSSR =0;
    int scoreOfGermany =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null) {
            TextView counterView=(TextView)findViewById(R.id.GermanyScore);
            counterView.setText(savedInstanceState.getInt("keyOne") + "");
        }
        if (savedInstanceState!=null) {
            TextView counterView=(TextView)findViewById(R.id.RussianScore);
            counterView.setText(savedInstanceState.getInt("keyTwo") + "");
        }
    }

    public void clickOnRightButton(View view){
        scoreOfUSSR++;
        TextView counterView=(TextView)findViewById(R.id.RussianScore);
        counterView.setText(scoreOfUSSR +"");
    }

    public void clickOnLeftButton(View view){
        scoreOfGermany++;
        TextView counterView=(TextView)findViewById(R.id.GermanyScore   );
        counterView.setText(scoreOfGermany +"");
    }
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("keyOne",scoreOfGermany);
        outState.putInt("keyTwo",scoreOfUSSR);
        super.onSaveInstanceState(outState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        scoreOfGermany = savedInstanceState.getInt("keyOne");
        scoreOfUSSR = savedInstanceState.getInt("keyTwo");
    }


}
