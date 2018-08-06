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

public class ArrayAdapter_Bowler extends ArrayAdapter<Bowler_Info> {
    Context context;
    int resource;
    ArrayList<Bowler_Info> bowlerInfoArrayList = null;

    public ArrayAdapter_Bowler(@NonNull Context context, int resource, @NonNull ArrayList<Bowler_Info> bowlerInfoArrayList) {
        super(context, resource, bowlerInfoArrayList);
        this.context = context;
        this.resource = resource;
        this.bowlerInfoArrayList = bowlerInfoArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Bowler_Info bowlerInfo = bowlerInfoArrayList.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.bowler_info, parent, false);
        }

        TextView rank = convertView.findViewById(R.id.rank);
        TextView name = convertView.findViewById(R.id.name);
        TextView overs = convertView.findViewById(R.id.overs);
        TextView maiden = convertView.findViewById(R.id.maiden);
        TextView runs = convertView.findViewById(R.id.runs);
        TextView wickets = convertView.findViewById(R.id.wickets);
        TextView average = convertView.findViewById(R.id.avg);

        rank.setText(bowlerInfo.getRank());
        name.setText(bowlerInfo.getName());
        overs.setText(bowlerInfo.getOvers());
        maiden.setText(bowlerInfo.getMaiden());
        runs.setText(bowlerInfo.getRuns());
        wickets.setText(bowlerInfo.getWickets());
        average.setText(bowlerInfo.getAverage());

        return convertView;
    }
}
