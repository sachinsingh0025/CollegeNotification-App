package com.example.codealpha_project_collegealertapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.codealpha_project_collegealertapplication.R;
import com.example.codealpha_project_collegealertapplication.adapter.RecyclerViewAdapter;
import com.example.codealpha_project_collegealertapplication.model.EventDetails;


import java.util.ArrayList;
import java.util.List;


public class TuesdayFragment extends Fragment {
    public TuesdayFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_tuesday, container, false);
        EventDetails eventDetails=new EventDetails();
        List<EventDetails> eventList=new ArrayList<>();
        eventDetails.setEventName("Webathon");
        eventDetails.setTimeSlot("2:00PM-4:00PM");
        eventDetails.setRegistration("Registration: Required");
        eventDetails.setImage(R.drawable.webathon);
        eventDetails.setAbout("Well now seems to be a great time to get started doesn’t it? We at DSC PESU EC are thrilled to present to you the very first iteration of a Web Development Hackathon- Webathon ’20 on 16th to 17th November, 2020.\n" +
                "\n" +
                "So spark up your imagination and creativity and dazzle us with your unique webpage creations! With no restriction on themes, you and your team have a plethora of ideas to work with and design. ");
        eventList.add(eventDetails);
        RecyclerView recyclerView=v.findViewById(R.id.tuesdayEvent);
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(v.getContext(),eventList);
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }
}