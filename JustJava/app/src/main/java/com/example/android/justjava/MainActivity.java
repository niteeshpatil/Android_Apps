package com.example.android.justjava;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int i=0;
    int price=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String s=ordersummary();
        String PriceMessage=s;
        displayMessage(PriceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quatity_text_View);
        quantityTextView.setText("" + number);

    }
    /**
     * This method is called when the + button is clicked.
     */
    public void incriment(View view) {

        display(++i);

    }
    /**
     * This method is called when the + button is clicked.
     */
    public void decriment(View view) {
        if(i>0) {
            display(--i);
        }

    }
    /**
     * Calculates the price of the order.
     */
    private String ordersummary() {
        String s="Name: NITEESH\n" +
                "Quntity: " +
                i+"\nTotal: " +
                "$"+i*10+"\nThnakyou!";

        return s;
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView Ordersummary = (TextView) findViewById(R.id.order_summary_text_view);
        Ordersummary.setText(message);
    }

}


