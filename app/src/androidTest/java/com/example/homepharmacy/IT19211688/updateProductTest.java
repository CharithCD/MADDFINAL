package com.example.homepharmacy.IT19211688;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import com.example.homepharmacy.R;
import com.example.homepharmacy.updateProduct;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class updateProductTest {
    @Rule
    public ActivityTestRule<updateProduct> activityTestRule =
            new ActivityTestRule<updateProduct>(updateProduct.class);
    private updateProduct update = null;
    @Before
    public void setUp() throws Exception {
        update = activityTestRule.getActivity();
    }
    @Test
    public void onCreate() {
        View view = update.findViewById(R.id.edit_text_file_name);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        update = null;
    }
}