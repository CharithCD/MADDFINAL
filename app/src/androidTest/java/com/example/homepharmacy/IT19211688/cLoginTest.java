package com.example.homepharmacy.IT19211688;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import com.example.homepharmacy.R;
import com.example.homepharmacy.cAdminHome;
import com.example.homepharmacy.cAdmin_Products_View;
import com.example.homepharmacy.cLogin;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class cLoginTest {
    @Rule
    public ActivityTestRule<cLogin> login = new ActivityTestRule<cLogin>(cLogin.class);
    Instrumentation.ActivityMonitor monitor =
            getInstrumentation().addMonitor(cAdminHome.class.getName(),null,false);
    private String phone = "0769124656";
    private String password = "admin123";

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void onCreate() {
        Espresso.onView(withId(R.id.phoneN)).perform(typeText(phone));
        Espresso.onView(withId(R.id.Password)).perform(typeText(password));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.buttonLogin)).perform(click());
        Activity second = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
        assertNotNull(second);
        second.finish();
    }
    @After
    public void tearDown() throws Exception {
        login = null;
    }


}