package com.example.currentconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void takeAction(View view) {
        EditText amountId = (EditText) findViewById(R.id.amountId);
        Double amountDoubleId = Double.parseDouble(amountId.getText().toString());
        Double poundDoubleId = amountDoubleId * 0.75;

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.animate().alpha(1f).setDuration(2000);

        Toast.makeText(MainActivity.this, "£ " + String.format("%.2f", poundDoubleId), Toast.LENGTH_SHORT).show();

        Log.i("Amount", amountId.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
