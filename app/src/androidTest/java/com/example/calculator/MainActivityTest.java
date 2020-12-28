package com.example.calculator;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void TestNumberButtons(){
        //Perform Button Click Number 1
        Espresso.onView(withId(R.id.number_1)).perform(click());
        //Perform Button Click Number 2
        Espresso.onView(withId(R.id.number_2)).perform(click());
        //Perform Button Click Number 3
        Espresso.onView(withId(R.id.number_3)).perform(click());
        //Perform Button Click Number 4
        Espresso.onView(withId(R.id.number_4)).perform(click());
        //Perform Button Click Number 5
        Espresso.onView(withId(R.id.number_5)).perform(click());
        //Perform Button Click Number 6
        Espresso.onView(withId(R.id.number_6)).perform(click());
        //Perform Button Click Number 7
        Espresso.onView(withId(R.id.number_7)).perform(click());
        //Perform Button Click Number 8
        Espresso.onView(withId(R.id.number_8)).perform(click());
        //Perform Button Click Number 9
        Espresso.onView(withId(R.id.number_9)).perform(click());

        //Check text in TextView matches buttons Pressed
        Espresso.onView(withId(R.id.equation)).check(matches(withText("123456789")));

        //Perform Button Click =
        Espresso.onView(withId(R.id.equal_btn)).perform(click());
        //Check if TextView got emptied
        Espresso.onView(withId(R.id.equation)).check(matches(withText("")));

    }

    @Test
    public void add_numbers_test(){

        //Perform Button Click Number 5
        Espresso.onView(withId(R.id.number_5)).perform(click());

        //Perform Button Click +
        Espresso.onView(withId(R.id.plus)).perform(click());

        //Perform Button Click Number 2
        Espresso.onView(withId(R.id.number_2)).perform(click());

        //Check text in TextView matches buttons Pressed
        Espresso.onView(withId(R.id.equation)).check(matches(withText("5+2")));

        //Perform Button Click =
        Espresso.onView(withId(R.id.equal_btn)).perform(click());
        //Check if results match
        Espresso.onView(withId(R.id.result)).check(matches(withText("7.0")));
        //Check if TextView got emptied
        Espresso.onView(withId(R.id.equation)).check(matches(withText("")));
    }


    @After
    public void tearDown() throws Exception {

    }
}