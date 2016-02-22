package com.example.harris.school;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.joda.time.LocalTime;

import java.util.Calendar;

public class TimetableActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MyLog";


    String historyInfo[] = new String[2];
    String computingInfo[] = new String[2];
    String reInfo[] = new String[2];
    String biologyInfo[] = new String[2];
    String physicsInfo[] = new String[2];
    String chemistryInfo[] = new String[2];
    String frenchInfo[] = new String[2];
    String englishInfo[] = new String[2];
    String mathsInfo[] = new String[2];
    String gamesInfo[] = new String[2];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        historyInfo[0] = "H1";
        historyInfo[1] = "Miss Bradbury";

        mathsInfo[0] = "MA1";
        mathsInfo[1] = "Miss Lawrence";

        biologyInfo[0] = "BL1";
        biologyInfo[1] = "Mr Gibson";

        chemistryInfo[0] = "CL2";
        chemistryInfo[1] = "Dr Bowers";

        frenchInfo[0] = "LA8";
        frenchInfo[1] = "Miss Bailey";

        reInfo[0] = "RE2";
        reInfo[1] = "Mr Dimmock";

        englishInfo[0] = "ER1";
        englishInfo[1] = "Miss Richards";

        gamesInfo[0] = "Sports Hall";
        gamesInfo[1] = "Mr Pugh";

        computingInfo[0] = "IT1";
        computingInfo[1] = "Mr Green";

        physicsInfo[0] = "PL2";
        physicsInfo[1] = "Mr Evans";

        setLessonText();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_planner) {
            Intent intent = new Intent(this, PlannerActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_timetable) {

        } else if (id == R.id.nav_Other) {

        }  else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public String[] lessonForDays() {
        Calendar c = Calendar.getInstance();
        int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);


        TextView period1 = (TextView) findViewById(R.id.textViewPeriod1);
        TextView period2 = (TextView) findViewById(R.id.textViewPeriod2);
        TextView period3 = (TextView) findViewById(R.id.textViewPeriod3);
        TextView period4 = (TextView) findViewById(R.id.textViewPeriod4);
        TextView period5 = (TextView) findViewById(R.id.textViewPeriod5);



        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);


        String[] daysLessons = new String[5];
        if ((weekOfMonth == 1) || (weekOfMonth == 3)) {


            switch (dayOfWeek) {
                case 1: //Sunday DO NOTHING
                    daysLessons[0] = "NoLesson";
                    return daysLessons;
                case 2: //Monday WEEK B
                    daysLessons[0] = "Maths";
                    period1.setText(daysLessons[0]);
                    daysLessons[1] =  "Physics";
                    period2.setText(daysLessons[1]);
                    daysLessons[2] =  "History";
                    period3.setText(daysLessons[2]);
                    daysLessons[3] =  "Chemistry";
                    period4.setText(daysLessons[3]);
                    daysLessons[4] =  "French";
                    period5.setText(daysLessons[4]);






                case 3: //Tuesday WEEK B
                    Log.d(TAG, "Yo it worked yo");

                    daysLessons[0] =  "RE";
                    period1.setText(daysLessons[0]);

                    daysLessons[1] =  "English";
                    period2.setText(daysLessons[1]);
                    daysLessons[2] =  "Maths";
                    period3.setText(daysLessons[2]);
                    daysLessons[3] =  "Computing";
                    period4.setText(daysLessons[3]);
                    daysLessons[4] =  "Biology";
                    period5.setText(daysLessons[4]);




                case 4: //Wednesday WEEK B



                    daysLessons[0] = "English";
                    period1.setText(daysLessons[0]);


                    daysLessons[1] =  "Computing";
                    period2.setText(daysLessons[1]);

                    daysLessons[2] =  "Chemistry";
                    period3.setText(daysLessons[2]);

                    daysLessons[3] =  "French";
                    period4.setText(daysLessons[3]);

                    daysLessons[4] =  "History";
                    period5.setText(daysLessons[4]);




                case 5: //Thursday WEEK B
                    Log.d(TAG, "ThursWeekB");

                        daysLessons[0] =  "French";
                    period1.setText(daysLessons[0]);

                    daysLessons[1] =  "History";
                    period2.setText(daysLessons[1]);
                    daysLessons[2] = "Physics";
                    period3.setText(daysLessons[2]);
                    daysLessons[3] =  "Games";
                    period4.setText(daysLessons[3]);
                    daysLessons[4] =  "Games";
                    period5.setText(daysLessons[4]);




                case 6: //Friday WEEK B

                    daysLessons[0] =  "RE";
                    period1.setText(daysLessons[0]);

                daysLessons[1] =  "Biology";
                    period2.setText(daysLessons[1]);
                daysLessons[2] =  "Computing";
                    period3.setText(daysLessons[2]);
                daysLessons[3] =  "English";
                    period4.setText(daysLessons[3]);
                daysLessons[4] =  "Maths";
                    period5.setText(daysLessons[4]);



                case 7: //Saturday DO NOTHING
                    daysLessons[0] = "NoLesson";

            }

        } else {

            switch (dayOfWeek) {
                case 1: //Sunday DO NOTHING

                    daysLessons[0] = "NoLesson";
                case 2: //Monday WEEK A

                        daysLessons[0] =  "Maths";
                    period1.setText(daysLessons[0]);
                    daysLessons[1] =  "English";
                    period2.setText(daysLessons[1]);

                    daysLessons[2] =  "Computing";
                    period3.setText(daysLessons[2]);

                    daysLessons[3] =  "RE";
                    period4.setText(daysLessons[3]);
                    daysLessons[4] =  "Physics";
                    period5.setText(daysLessons[4]);




                case 3: //Tuesday WEEK A
                    Log.d(TAG, "It worked yo pNOTHING");

                        daysLessons[4] = "Maths";
                    period1.setText(daysLessons[0]);

                        daysLessons[4] = "French";
                    period2.setText(daysLessons[1]);
                        daysLessons[4] = "History";
                    period3.setText(daysLessons[2]);
                        daysLessons[4] = "English";
                    period4.setText(daysLessons[3]);
                        daysLessons[4] = "Chemistry";
                    period5.setText(daysLessons[4]);


                case 4: //Wednesday WEEK A

                        daysLessons[0] =  "English";
                    period1.setText(daysLessons[0]);
                        daysLessons[1] = "Computing";
                    period2.setText(daysLessons[1]);
                        daysLessons[2] = "Biology";
                    period3.setText(daysLessons[2]);
                        daysLessons[3] = "History";
                    period4.setText(daysLessons[3]);
                        daysLessons[4] =  "French";
                    period5.setText(daysLessons[4]);


                case 5: //Thursday WEEK A
                    Log.d(TAG, "It worked yo thurs");

                    daysLessons[0] = "Chemistry";
                    period1.setText(daysLessons[0]);

                    daysLessons[1] = "French";
                    period2.setText(daysLessons[1]);
                    daysLessons[2] = "Maths";
                    period3.setText(daysLessons[2]);
                    daysLessons[3] = "Games";
                    period4.setText(daysLessons[3]);
                    daysLessons[4] = "Games";
                    period5.setText(daysLessons[4]);





                case 6: //Friday WEEK A
                    daysLessons[0] = "History";
                    period1.setText(daysLessons[0]);

                    daysLessons[1] = "Physics";
                    period2.setText(daysLessons[1]);
                    daysLessons[2] = "Computing";
                    period3.setText(daysLessons[2]);
                    daysLessons[3] = "Maths";
                    period4.setText(daysLessons[3]);
                    daysLessons[4] = "Biology";
                    period5.setText(daysLessons[4]);
                case 7: //Saturday DO NOTHING
                    daysLessons[0] = "NoLesson";

            }
        }

        return daysLessons;
    }

    public String nextlesson(){
        Calendar c = Calendar.getInstance();
        int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
        LocalTime currentTime = LocalTime.now();
        int nextLessonNumber = 0;
        String nextLessonString;
        int currentLesson = 0;
        TextView period1 = (TextView) findViewById(R.id.textViewPeriod1);
        TextView period2 = (TextView) findViewById(R.id.textViewPeriod2);
        TextView period3 = (TextView) findViewById(R.id.textViewPeriod3);
        TextView period4 = (TextView) findViewById(R.id.textViewPeriod4);
        TextView period5 = (TextView) findViewById(R.id.textViewPeriod5);

        LocalTime lesson1Start = new LocalTime("09:15");
        LocalTime lesson1End = new LocalTime("10:15");
        LocalTime lesson2Start = new LocalTime("10:15");
        LocalTime lesson3Start = new LocalTime("11:40");
        LocalTime lesson4start = new LocalTime("13:45");
        LocalTime lesson5Start = new LocalTime("14:45");
        LocalTime endOfDay = new LocalTime ("15:50");



        if (currentTime.isBefore(lesson1Start)) {
            //p1 next

            period1.setTextColor(getResources().getColor(R.color.colorAccent, null));
            return lessonForDays()[0];
        } else if (currentTime.isAfter(lesson1Start) && currentTime.isBefore(lesson1End)) {
            //p2 next

            period2.setTextColor(getResources().getColor(R.color.colorAccent, null));
            return lessonForDays()[1];
        } else if (currentTime.isAfter(lesson2Start) && currentTime.isBefore(lesson3Start)) {
            //p3 next

            period3.setTextColor(getResources().getColor(R.color.colorAccent, null));
            return lessonForDays()[2];
        } else if (currentTime.isAfter(lesson3Start) && currentTime.isBefore(lesson4start)) {
            //p4 next

            period4.setTextColor(getResources().getColor(R.color.colorAccent, null));
            return lessonForDays()[3];
        } else if (currentTime.isAfter(lesson4start) && currentTime.isBefore(lesson5Start)) {
            //p5 next

            period5.setTextColor(getResources().getColor(R.color.colorAccent, null));
            return lessonForDays()[4];
        } else if (currentTime.isAfter(lesson5Start) && currentTime.isAfter(endOfDay)) {
            currentLesson = 5;
        } else {
            nextLessonNumber = 0;
            return "NoLesson";
        }

        return null;
    }


    public void setLessonText(){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView lessonString = (TextView) findViewById(R.id.primaryText);
        TextView subTextString = (TextView) findViewById(R.id.secondaryText);
        CardView lessonCardView = (CardView) findViewById(R.id.lessonCardView);

        if (nextlesson() ==  "NoLesson")    {
            lessonCardView.setVisibility(View.INVISIBLE);
            Log.d(TAG, "DIS WHERE THE PORBLEMS AT");
        } else
        {
            lessonCardView.setVisibility(View.VISIBLE);
            lessonString.setText(nextlesson());
        }


        if (nextlesson()== "History"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.history);
            subTextString.setText(historyInfo[1] + " - "+historyInfo[0]);
        }
        if (nextlesson()== "Maths"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.maths);
            subTextString.setText(mathsInfo[1] + " - " + mathsInfo[0]);
        }
        if (nextlesson()== "English"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.english);
            subTextString.setText(englishInfo[1] + " - " + englishInfo[0]);
        }
        if (nextlesson()== "French"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.french);
            subTextString.setText(frenchInfo[1] + " - " + frenchInfo[0]);
        }
        if (nextlesson()== "Computing"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.computing);
            subTextString.setText(computingInfo[1] + " - " + computingInfo[0]);
        }
        if (nextlesson()== "Biology"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.biology);
            subTextString.setText(biologyInfo[1] + " - " + biologyInfo[0]);
        }
        if (nextlesson()== "Chemistry"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.chemistry);
            subTextString.setText(chemistryInfo[1] + " - " + chemistryInfo[0]);
        }
        if (nextlesson()== "Physics"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.physics);
            subTextString.setText(physicsInfo[1] + " - " + physicsInfo[0]);
        }
        if (nextlesson()== "RE"){
            lessonCardView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.re);
            subTextString.setText(reInfo[1] + " - " + reInfo[0]);
        }


    }
}
