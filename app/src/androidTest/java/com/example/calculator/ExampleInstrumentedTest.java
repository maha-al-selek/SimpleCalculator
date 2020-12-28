package com.example.calculator;

import android.content.Context;

import androidx.test.espresso.Espresso;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.calculator", appContext.getPackageName());
    }

    @Test
    public void testUserInputEditText(){
        //Perform Button Click Number 1
        onView(withId(R.id.number_1)).perform(click());
        //Perform Button Click Number 2
        onView(withId(R.id.number_2)).perform(click());
        //Perform Button Click Number 3
        onView(withId(R.id.number_3)).perform(click());
        //Perform Button Click Number 4
        onView(withId(R.id.number_4)).perform(click());
        //Perform Button Click Number 5
        onView(withId(R.id.number_5)).perform(click());
        //Perform Button Click Number 6
        onView(withId(R.id.number_6)).perform(click());
        //Perform Button Click Number 7
        onView(withId(R.id.number_7)).perform(click());
        //Perform Button Click Number 8
        onView(withId(R.id.number_8)).perform(click());
        //Perform Button Click Number 9
        onView(withId(R.id.number_9)).perform(click());

        //Check text in TextView matches buttons Pressed
        onView(withId(R.id.equation)).check(matches(withText("123456789")));

        //Perform Button Click =
        onView(withId(R.id.equal_btn)).perform(click());
        //Check if TextView got emptied
        onView(withId(R.id.equation)).check(matches(withText("")));
    }

}
