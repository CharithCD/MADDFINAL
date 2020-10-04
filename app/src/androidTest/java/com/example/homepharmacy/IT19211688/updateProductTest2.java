package com.example.homepharmacy.IT19211688;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.rule.ActivityTestRule;

import com.example.homepharmacy.MainActivity;
import com.example.homepharmacy.R;
import com.example.homepharmacy.cAdmin_Products_View;
import com.example.homepharmacy.updateProduct;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class updateProductTest2 {
    @Rule
    public ActivityTestRule<updateProduct> updateProduct2 =
            new ActivityTestRule<updateProduct>(updateProduct.class);
    private updateProduct update2 = null;
    Instrumentation.ActivityMonitor monitor =
            getInstrumentation().addMonitor(cAdmin_Products_View.class.getName(),null,false);
    @Before
    public void setUp() throws Exception {
        update2 = updateProduct2.getActivity();
    }
    @Test
    public void showProductOnClick() {
        assertNotNull(update2.findViewById(R.id.text_view_show_uploads));
        onView(withId(R.id.text_view_show_uploads)).perform(click());
        Activity second = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
        assertNotNull(second);
        second.finish();
    }
    @After
    public void tearDown() throws Exception {
        update2 = null;
    }


}