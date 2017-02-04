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
    Calendar cali;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cali = Calendar.getInstance();
        cali.set(cali.get(Calendar.YEAR),cali.get(Calendar.MONTH),cali.get(Calendar.DAY_OF_MONTH), cali.get(Calendar.HOUR_OF_DAY),cali.get(Calendar.MINUTE));
        daDate = (DatePicker) findViewById(R.id.dadate);
        daTime = (TimePicker) findViewById(R.id.datime);
        dateWindow = (TextView) findViewById(R.id.dateWindow);
        dateWindow.setText(cali.getTime().toString());

        daDate.init(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, new DatePicker.OnDateChangedListener()
        {
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
            cali.set(year,monthOfYear,dayOfMonth);
            dateWindow.setText(cali.getTime().toString());
            }
        });

        daTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(){
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute)
            {
                cali.set(cali.get(Calendar.YEAR),cali.get(Calendar.MONTH),cali.get(Calendar.DAY_OF_MONTH),hourOfDay,minute);
                dateWindow.setText(cali.getTime().toString());
            }
        });












    }
}



