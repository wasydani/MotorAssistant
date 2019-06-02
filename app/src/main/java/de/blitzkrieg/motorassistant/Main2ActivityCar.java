package de.blitzkrieg.motorassistant;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2ActivityCar extends AppCompatActivity {

    private TextView mTextMessage;
    private TextView erg = findViewById(R.id.textView3);
    final Button buttonTest = findViewById(R.id.button_klick);


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    //mTextMessage.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_car:
                    mTextMessage.setText(R.string.title_car);
                    //mTextMessage.setVisibility(View.VISIBLE);
                    setContentView(R.layout.activity_main3_home);
                    return true;
                case R.id.navigation_expert:
                    mTextMessage.setText(R.string.title_exp);
                    //mTextMessage.setVisibility(View.GONE);
                    //setContentView(R.layout.activity_main3);

                    return true;
                case R.id.bluetooth:
                    mTextMessage.setText(R.string.title_BT);

            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextMessage = (TextView) findViewById(R.id.message);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
