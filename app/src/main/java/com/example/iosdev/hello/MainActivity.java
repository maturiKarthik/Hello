package com.example.iosdev.hello;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        final Button click = (Button)findViewById(R.id.button);
        final Button newscrenn = (Button)findViewById(R.id.intent);
        final TextView text = (TextView)findViewById(R.id.text);


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(),"This Toast Will Appear",Toast.LENGTH_LONG);
                t.show();

                // TEXT INSERTED IN TEXT
                text.setText("TOAST HAS BEEN DISPLAYED :" + count++);
            }
        });

        newscrenn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intentController();
            }
        });

    }


    public void intentController(){
        // Starting a new intent
        try{
            Log.d("inside","Inside  the try above intent");
            Intent i = new Intent(this, MainInt.class);
            startActivity(i);
            Log.d("inside","Ibelow intent");
        }catch (Exception e){
            e.printStackTrace();
        }
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

        return super.onOptionsItemSelected(item);
    }
}
