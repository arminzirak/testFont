package ir.freedeveloper.fonttest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface ex = Typeface.createFromAsset(getAssets(), "fonts/NotoSansArabic-Regular.ttf");
        TextView tv = (TextView) findViewById(R.id.abc);
        tv.setTypeface(ex);
    }
}
