package com.example.codealpha_project_collegealertapplication.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.codealpha_project_collegealertapplication.fragment.FridayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.MondayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.SatuardayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.ThusdayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.TuesdayFragment;
import com.example.codealpha_project_collegealertapplication.fragment.WednesdayFragment;

public class FragmentManagerAdapter extends FragmentPagerAdapter {

    public FragmentManagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new MondayFragment();

        else if(position==1)
             return new TuesdayFragment();
        else if(position==2)
            return new WednesdayFragment();
        else if(position==3)
            return new ThusdayFragment();
        else if (position==4)
            return new FridayFragment();
        else
            return new SatuardayFragment();
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return "Monday";

        else if(position==1)
            return "Tuesday";
        else if(position==2)
            return "Wednesday";
        else if(position==3)
            return "Thusday";
        else if (position==4)
            return "Friday";
        else
            return "Satuarday";
    }
}
