package com.roomorama.caldroid;


import android.view.View;

import java.util.Date;

public interface CaldroidListenerInterface {

    void onSelectDate(Date date, View view);
    void onLongClickDate(Date date, View view);
    void onChangeMonth(int month, int year);
    void onCaldroidViewCreated();
}
