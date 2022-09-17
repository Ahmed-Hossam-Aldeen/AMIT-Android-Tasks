package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import mo.atef.amit.daythree.daythree.R;
import android.os.Bundle;

public class MyBasket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_basket);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

    }
}