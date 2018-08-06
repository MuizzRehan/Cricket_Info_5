package com.example.admin.cricket_info_5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayAdapter_Batter extends ArrayAdapter<Batter_Info> {
    Context context;
    int resource;
    ArrayList<Batter_Info> batterInfoArrayList = null;


    public ArrayAdapter_Batter(@NonNull Context context, int resource, ArrayList<Batter_Info> batterInfoArrayList) {
        super(context, resource, batterInfoArrayList);
        this.context = context;
        this.resource = resource;
        this.batterInfoArrayList = batterInfoArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Batter_Info batterInfo = batterInfoArrayList.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.batting_info, parent, false);
        }

        TextView rank = convertView.findViewById(R.id.rank);
        TextView name = convertView.findViewById(R.id.name);
        TextView status = convertView.findViewById(R.id.status);
        TextView runs = convertView.findViewById(R.id.score);
        TextView balls = convertView.findViewById(R.id.balls);
        TextView fours = convertView.findViewById(R.id.fours);
        TextView sixes = convertView.findViewById(R.id.sixes);
        TextView runRate = convertView.findViewById(R.id.SR);

        rank.setText(batterInfo.getRank());
        name.setText(batterInfo.getName());
        status.setText(batterInfo.getStatus());
        runs.setText(batterInfo.getRuns());
        balls.setText(batterInfo.getBalls());
        fours.setText(batterInfo.getFours());
        sixes.setText(batterInfo.getSixes());
        runRate.setText(batterInfo.getRunRate());

        return convertView;
    }
}
