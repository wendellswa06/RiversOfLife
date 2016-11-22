package com.example.android.riversoflife;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    Toolbar toolbar2;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    TextView title;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make Status Transparent
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window w = getWindow(); // in Activity's onCreate() for instance
//            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        //toolbar2 = (Toolbar)findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar2);
        title = (TextView)toolbar.findViewById(R.id.toolbar_txt);
        setSupportActionBar(toolbar);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new WelcomeFragment());
        fragmentTransaction.commit();
        title.setText("Rivers of Life");
        //getSupportActionBar().hide();

        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {

                switch (item.getItemId())
                {
                    case R.id.welcome_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new WelcomeFragment());
                        fragmentTransaction.commit();
                        title.setText("Rivers of Life");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.about_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new AboutRiversFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("About Rivers");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.ministries_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new MinistriesFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Ministries");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.contact_us_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new ContactUsFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Contact Us");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.calender_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new CalenderAtAGlanceFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Calender At A Glance");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.online_giving_id_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new OnlineGivingFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Online Giving");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.podcast_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new PodcastFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Podcast");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.about_us_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new AboutUs());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("About Us");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.our_history_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new OurHistory());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Our History");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.our_pastors_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new OurPastors());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("Our Pastors");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.what_we_believe_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new WhatWeBelieve());
                        fragmentTransaction.commit();
                        getSupportActionBar().show();
                        title.setText("What We Believe");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                }
                return true;
            }
        });

}




    @Override
    protected void onPostCreate (Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();



    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        View view = getCurrentFocus();
        boolean ret = super.dispatchTouchEvent(event);

        if (view instanceof EditText) {
            View w = getCurrentFocus();
            int scrcoords[] = new int[2];
            w.getLocationOnScreen(scrcoords);
            float x = event.getRawX() + w.getLeft() - scrcoords[0];
            float y = event.getRawY() + w.getTop() - scrcoords[1];

            if (event.getAction() == MotionEvent.ACTION_UP
                    && (x < w.getLeft() || x >= w.getRight()
                    || y < w.getTop() || y > w.getBottom()) ) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            }
        }
        return ret;
    }


}
