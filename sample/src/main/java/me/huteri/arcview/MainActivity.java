package me.huteri.arcview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import me.huteri.analogclock.ArcSlice;
import me.huteri.analogclock.AnalogClockView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.MINUTE, 0);

        ArcSlice arcSlice = new ArcSlice();
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        arcSlice.setStartTime(calendar.getTime());

        calendar.set(Calendar.HOUR_OF_DAY, 14);

        arcSlice.setEndTime(calendar.getTime());
        arcSlice.setColor(Color.parseColor("#e74c3c"));

        ArcSlice arcSlice2 = new ArcSlice();
        calendar.set(Calendar.HOUR_OF_DAY, 15);

        arcSlice2.setStartTime(calendar.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, 16);

        arcSlice2.setEndTime(calendar.getTime());
        arcSlice2.setColor(Color.parseColor("#16a085"));

        ArcSlice arcSlice3 = new ArcSlice();
        calendar.set(Calendar.HOUR_OF_DAY, 17);

        arcSlice3.setStartTime(calendar.getTime());

        calendar.set(Calendar.HOUR_OF_DAY, 20);

        arcSlice3.setEndTime(calendar.getTime());
        arcSlice3.setColor(Color.parseColor("#f1c40f"));

        final ArrayList<ArcSlice> arcSliceList = new ArrayList<>();
        arcSliceList.add(arcSlice);
        arcSliceList.add(arcSlice2);
        arcSliceList.add(arcSlice3);

        final AnalogClockView analogClockView = findViewById(R.id.analogClockView);
        analogClockView.setList(arcSliceList);
        analogClockView.setOnSliceClickListener(new AnalogClockView.SliceClickListener() {
            @Override
            public void onSliceClick(int pos) {
                Toast.makeText(MainActivity.this, "Clicked on slice at " + DateFormat.getTimeInstance().format(arcSliceList.get(pos).getStartTime()), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
