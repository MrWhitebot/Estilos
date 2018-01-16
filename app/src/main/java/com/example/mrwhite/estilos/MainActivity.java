package com.example.mrwhite.estilos;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    MainActivityEvents mainActivityEvents;
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;
    BlankFragment4 blankFragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        mainActivityEvents = new MainActivityEvents(this);
        fab.setOnClickListener(mainActivityEvents);

        blankFragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);
        blankFragment2 = (BlankFragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        blankFragment3 =(BlankFragment3) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        blankFragment4 = (BlankFragment4) getSupportFragmentManager().findFragmentById(R.id.fragment4);
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.hide(blankFragment4);
        transaction.show(blankFragment);
        transaction.show(blankFragment2);
        transaction.show(blankFragment3);

        transaction.commit();

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
