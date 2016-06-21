package com.example.tspl.helloworld;

import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText getUsername;
    EditText getPassword;
    TextView textView;
    Button button;
    public final static String EXTRA_MESSAGE = "com.example.tspl.helloworld.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getUsername = (EditText) findViewById(R.id.enterUsername);
        getPassword = (EditText) findViewById(R.id.enterPassword);
        textView = (TextView) findViewById(R.id.textMessage);
        button = (Button) findViewById(R.id.buttonLogin);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUname = getUsername.getText().toString();
                String getPass = getPassword.getText().toString();
                if (getUname.equals("abc") && getPass.equals("abc")) {
                    String message = " Success ";
                    textView.setText(message);
                    setContentView(R.layout.new_layout);
                    //getMenuInflater().inflate(R.menu.new_menu, menu);
                } else {
                    String message = " Failure ";
                    textView.setText(message);
                }
                /*switch (v.getId()) {
                    case R.id.buttonLogin:

                        //break;
                    case R.id.menuCars:
                        setContentView(R.layout.car_main);
                    case R.id.menuMobiles:
                        setContentView(R.layout.mobile_main);
                    case R.id.menuBooks:
                        setContentView(R.layout.englishbook_main);
                }*/
            }

            //}
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        switch (id) {
            case R.id.action_settings:
                return true;
            //break;
            case R.id.action_rateapp:
                return true;
            //break;
           // case R.id.bookEnglish:
             //   return true;
            //break;
            //case R.id.bookMalayalam:
             //   return true;
            //break;
            //case R.id.menuBooks:
               // return true;
            //break;
            //case R.id.menuCars:
               // return true;
            //break;
            //case R.id.menuMobiles:
                //return true;
            //break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.enterUsername);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public  void layoutCars(View view){
        setContentView(R.layout.car_main);
    }
    public  void layoutMobile(View view){
        setContentView(R.layout.mobile_main);
    }

    public  void layoutBook(View view){
        setContentView(R.layout.englishbook_main);
    }
    @Override
    public void onBackPressed() {
        setContentView(R.layout.new_layout);
        return;
    }


}

