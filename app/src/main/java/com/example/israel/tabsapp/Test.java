package com.example.israel.tabsapp;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;

/**
 * Created by israel on 24/03/15.
 */
public class Test extends ActionBarActivity implements ActionBar.TabListener{

    ActionBar myAction;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testactivity);
        myAction = getSupportActionBar();
        myAction.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        if (myAction != null) {
            myAction.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            for(int i=0; i<3; i++){
                myAction.addTab(myAction.newTab().setText("Section " + (i+1))
                        .setTabListener(this));
            }
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
