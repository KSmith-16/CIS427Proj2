package com.example.cis427proj2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.distanceMenu) {
            setContentView(R.layout.main_fragment);
        }
        else
        {
            setContentView(R.layout.choose_fragment);
        }
        return true;
    }

    public void onDSubmit(View view)
    {
        int kmID = R.id.kmEdit;
        int milesID = R.id.MEdit;
        if((view.getId() == R.id.DSubmit))//miles
        {
            EditText text = (EditText) findViewById(kmID);
            double fromText =Double.parseDouble(text.getText().toString());

            double answer = fromText*0.62137;
            String answerString = String.valueOf(answer);
            text = (EditText) findViewById(milesID);
            text.setText(answerString);
        }
        else//km
        {
            EditText text = (EditText) findViewById(milesID);
            double fromText =Double.parseDouble(text.getText().toString());

            double answer = fromText/0.62137;
            String answerString = String.valueOf(answer);
            text = (EditText) findViewById(kmID);
            text.setText(answerString);
        }
    }

    public void onTSubmit(View view)
    {
        int celciusID = R.id.CEdit;
        int faranheitID = R.id.FEdit;
        if((view.getId() == R.id.TSubmit))//faranheit
        {
            EditText text = (EditText) findViewById(celciusID);
            double fromText =Double.parseDouble(text.getText().toString());

            double answer = fromText*1.8 + 32;
            String answerString = String.valueOf(answer);
            text = (EditText) findViewById(faranheitID);
            text.setText(answerString);
        }
        else//celcius
        {
            EditText text = (EditText) findViewById(faranheitID);
            double fromText =Double.parseDouble(text.getText().toString());

            double answer = (fromText-32)/1.8;
            String answerString = String.valueOf(answer);
            text = (EditText) findViewById(celciusID);
            text.setText(answerString);
        }

    }




}
