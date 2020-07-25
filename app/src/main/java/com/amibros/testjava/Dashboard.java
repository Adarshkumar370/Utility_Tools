package com.amibros.testjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Dashboard extends AppCompatActivity {
    private String s1[], s2[];
    int images[] = {R.drawable.splash_icon, R.drawable.splash_icon, R.drawable.splash_icon, R.drawable.splash_icon};
    RecyclerView dashboardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        s1 = getResources().getStringArray(R.array.dashboard_item);
        s2 = getResources().getStringArray(R.array.dashboard_item_description);

        dashboardList = findViewById(R.id.recycler_dashboard);
        DashBoard_Adapter dashBoard_adapter = new DashBoard_Adapter(this, s1, s2, images);
        dashboardList.setAdapter(dashBoard_adapter);
        dashboardList.setLayoutManager(new LinearLayoutManager(this));
    }
}