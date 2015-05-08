package com.example.asus.pz_projekt_semestralny;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;


public class MainActivity extends Activity {

    TableLayout tbButtons;
    String[] mTextofButton = { "Dipak", "E", "I", "J", "L",
            "M", "G", "R", "N", "T", "H", "P",
            "K", "Y", "V" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbButtons = (TableLayout) findViewById(R.id.tbButtons);

        TableRow tr = new TableRow(this);
        for (int i = 0; i < mTextofButton.length; i++) {
            Button btn = new Button(this);
            btn.setText(mTextofButton[i]);
            tr.addView(btn);
        }

        tbButtons.addView(tr);
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
