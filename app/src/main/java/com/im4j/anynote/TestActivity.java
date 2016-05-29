package com.im4j.anynote;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.im4j.services.TestKotlin;

/**
 * 测试Activity
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText(TestKotlin.Companion.test("测试Activity"));
        setContentView(button);
    }

}
