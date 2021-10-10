package com.example.android.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
         TextView textViewItem1=(TextView) findViewById(R.id.menu_item_1);
         String menuTtem1=textViewItem1.getText().toString();
         Log.v("MainActivity",menuTtem1);
        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}