package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import mo.atef.amit.daythree.daythree.R;

public class AddToBasket extends AppCompatActivity {
    int minteger = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_basket);
    }

    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);
    }
    public void decreaseInteger(View view) {
        if (minteger != 0) {
            minteger = minteger - 1;
            display(minteger);
        }
    }
    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.number);
        displayInteger.setText("" + number);
    }
}