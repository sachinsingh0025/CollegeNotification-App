package com.example.codealpha_project_collegealertapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.codealpha_project_collegealertapplication.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codealpha_project_collegealertapplication.model.EventDetails;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context context;
    private List<EventDetails> eventDetails;

    public RecyclerViewAdapter(Context context,List<EventDetails> eventDetails){
        this.context=context;
        this.eventDetails=eventDetails;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        EventDetails cont=eventDetails.get(position);
        holder.eventName.setText(cont.getEventName());
        holder.TimeSlot.setText(cont.getTimeSlot());
        holder.Registration.setText(cont.getRegistration());
        holder.about.setText(cont.getAbout());
        holder.iconButton.setImageResource(cont.getImage());
    }

    @Override
    public int getItemCount() {
        return eventDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView eventName;
        public TextView TimeSlot;
        public TextView Registration;
        public TextView about;
        public ImageView iconButton;

        public ViewHolder(View itemView)
        {
            super(itemView);
            itemView.setOnClickListener(this);
            eventName=itemView.findViewById(R.id.eventName);
            TimeSlot=itemView.findViewById(R.id.TimeSlot);
            Registration=itemView.findViewById(R.id.Registration);
            about=itemView.findViewById(R.id.eventAbout);
            iconButton=itemView.findViewById(R.id.imageView4);

        }
        @Override
        public void onClick(View v) {

        }
    }
}

