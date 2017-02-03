package tk.wablanchett.inclass_activity_01_blanchett;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    DatePicker daDate;
    TimePicker daTime;
    TextView dateWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daDate = (DatePicker) findViewById(R.id.dadate);
        daTime = (TimePicker) findViewById(R.id.datime);
        dateWindow = (TextView) findViewById(R.id.dateWindow);
        dateWindow.setText(Calendar.getInstance().getTime().toString());


        dateWindow.setText(Calendar.getInstance().getTime().toString());
            daDate.init(2017, 2, 3, new DatePicker.OnDateChangedListener()
            {
                public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                {
                    Calendar cal = Calendar.getInstance();
                    cal.set(year,monthOfYear,dayOfMonth);
                    dateWindow.setText(cal.getTime().toString());
                }
            });







    }
}



