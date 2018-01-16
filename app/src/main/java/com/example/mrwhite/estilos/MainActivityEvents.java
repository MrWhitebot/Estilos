package com.example.mrwhite.estilos;

import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by mrwhite on 15/1/18.
 */

public class MainActivityEvents implements View.OnClickListener{



    MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.fab){
            FragmentTransaction transaction = this.mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.show(this.mainActivity.blankFragment4);
            transaction.hide(this.mainActivity.blankFragment);
            transaction.hide(this.mainActivity.blankFragment2);
            transaction.hide(this.mainActivity.blankFragment3);
            transaction.commit();
            if(!this.mainActivity.blankFragment4.isHidden()){
                FragmentTransaction transaction2 = this.mainActivity.getSupportFragmentManager().beginTransaction();
                transaction2.hide(this.mainActivity.blankFragment4);
                transaction2.show(this.mainActivity.blankFragment);
                transaction2.show(this.mainActivity.blankFragment2);
                transaction2.show(this.mainActivity.blankFragment3);
                transaction2.commit();
            }

        }

        }

    }
