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


public class MondayFragment extends Fragment {



    public MondayFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_monday, container, false);
        List<EventDetails> eventList=new ArrayList<>();
        EventDetails eventDetails1=new EventDetails();
        eventDetails1.setEventName("Salsa");
        eventDetails1.setTimeSlot("12PM-4PM");
        eventDetails1.setRegistration("Registration:Required");
        eventDetails1.setImage(R.drawable.jalsa);
        eventDetails1.setAbout("Maya Menon (Vidya Balan) is a successful, rich, hard hitting, truth telling, influential TV journalist, with high morals. She hosts a successful TV show aptly called \"Face The Truth\" and enjoys celebrity status which is also desired by her competitors, peers and juniors alike. ");
        eventList.add(eventDetails1);
        EventDetails eventDetails2=new EventDetails();
        eventDetails2.setEventName("Cloud WorkShop");
        eventDetails2.setTimeSlot("10AM-12PM");
        eventDetails2.setRegistration("Registration:Required");
        eventDetails2.setImage(R.drawable.cloud);
        eventDetails2.setAbout("In the past, computing tasks such as word processing were not possible without the installation of application software on a user's computer. A user bought a license for each application from a  vendor and obtained the right to install the application on one computer system.");
        eventList.add(eventDetails2);
        RecyclerView recyclerView=view.findViewById(R.id.mondayEvent);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(view.getContext(),eventList);
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;

    }
}