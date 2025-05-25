package com.example.codealpha_project_collegealertapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codealpha_project_collegealertapplication.adapter.FragmentManagerAdapter;
import com.example.codealpha_project_collegealertapplication.fragment.FridayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.MondayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.SatuardayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.ThusdayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.TuesdayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.WednesdayFragment;
import com.google.android.material.tabs.TabLayout;

public class CollegeEvent extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_event);
        tab=findViewById(R.id.tabLa);
        viewPager=findViewById(R.id.viewPager);

        FragmentManagerAdapter fragmentManagerAdapter=new FragmentManagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentManagerAdapter);
        tab.setupWithViewPager(viewPager);

        logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Alert",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("ch",false);
                editor.apply();
                startActivity(new Intent(CollegeEvent.this, Login.class));
                finish();
            }
        });

    }
}