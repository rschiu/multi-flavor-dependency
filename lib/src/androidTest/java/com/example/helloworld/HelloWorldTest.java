
package com.example.helloworld;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.TextView;

public class HelloWorldTest extends ActivityInstrumentationTestCase2<HelloWorld> {
    private TextView mTextView;

    public HelloWorldTest() {
        super("com.example.helloworld", HelloWorld.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        final HelloWorld a = getActivity();
        // ensure a valid handle to the activity has been returned
        assertNotNull(a);
        mTextView = (TextView) a.findViewById(R.id.text);

    }

    @MediumTest
    public void testPreconditions() {
        assertNotNull(mTextView);
    }
}
