package com.example.admin.cricket_info_5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScoreBoard_Fragment extends Fragment {
    private ListView listView1;
    private ListView listView2;
    private ListView listView3;
    private ListView listView4;
    private String[] name;
    private String[] status;
    private String[] runs;
    private String[] balls;
    private String[] fours;
    private String[] sixes;
    private String[] runRate;
    private String[] overs;
    private String[] wickets;
    private String[] maiden;
    ArrayList<Batter_Info> batterInfoArrayList = new ArrayList<Batter_Info>();
    ArrayList<Bowler_Info> bowlerInfoArrayList = new ArrayList<Bowler_Info>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.score_board_fragment, container,false);

         batterInfoArrayList.clear();
         bowlerInfoArrayList.clear();
        listView1 = view.findViewById(R.id.listView1);
        listView2 = view.findViewById(R.id.listView2);
        listView3 = view.findViewById(R.id.listView3);
        listView4 = view.findViewById(R.id.listView4);
        name = getResources().getStringArray(R.array.players);
        status = getResources().getStringArray(R.array.description);
        runs = getResources().getStringArray(R.array.runs);
        balls = getResources().getStringArray(R.array.balls);
        fours = getResources().getStringArray(R.array.fours);
        sixes = getResources().getStringArray(R.array.sixes);
        runRate = getResources().getStringArray(R.array.runRate);
        overs = getResources().getStringArray(R.array.overs);
        wickets = getResources().getStringArray(R.array.wickets);
        maiden = getResources().getStringArray(R.array.maidens);

        for(int i=0; i<name.length; i++){
            Batter_Info batterInfo = new Batter_Info(String.valueOf(i+1), name[i], status[i], runs[i], balls[i], fours[i], sixes[i], runRate[i]);
            batterInfoArrayList.add(batterInfo);
            Bowler_Info bowlerInfo = new Bowler_Info(String.valueOf(i+1), name[i], overs[i], maiden[i], runs[i], wickets[i], runRate[i]);
            bowlerInfoArrayList.add(bowlerInfo);
        }

        ArrayAdapter_Batter adapterBatter = new ArrayAdapter_Batter(getContext(), R.layout.batting_info, batterInfoArrayList);
        View headerViewBatter = getLayoutInflater().inflate(R.layout.header_batting_info, null);
        View footerView1 = getLayoutInflater().inflate(R.layout.footer, null);
        listView1.addHeaderView(headerViewBatter);
        listView1.addFooterView(footerView1);
        listView1.setAdapter(adapterBatter);


        ArrayAdapter_Bowler adapterBowler = new ArrayAdapter_Bowler(getContext(), R.layout.bowler_info, bowlerInfoArrayList);
        View headerViewBowler = getLayoutInflater().inflate(R.layout.header_bowling_info, null);
        View footerView2 = getLayoutInflater().inflate(R.layout.footer, null);
        listView2.addHeaderView(headerViewBowler);
        listView2.addFooterView(footerView2);
        listView2.setAdapter(adapterBowler);

        ArrayAdapter_Batter adapterBatter2 = new ArrayAdapter_Batter(getContext(), R.layout.batting_info, batterInfoArrayList);
        View headerViewBatter2 = getLayoutInflater().inflate(R.layout.header_batting_info, null);
        View footerView3 = getLayoutInflater().inflate(R.layout.footer, null);
        listView3.addHeaderView(headerViewBatter);
        listView3.addFooterView(footerView1);
        listView3.setAdapter(adapterBatter);


        ArrayAdapter_Bowler adapterBowler2 = new ArrayAdapter_Bowler(getContext(), R.layout.bowler_info, bowlerInfoArrayList);
        View headerViewBowler2 = getLayoutInflater().inflate(R.layout.header_bowling_info, null);
        View footerView4 = getLayoutInflater().inflate(R.layout.footer, null);
        listView4.addHeaderView(headerViewBowler);
        listView4.addFooterView(footerView2);
        listView4.setAdapter(adapterBowler);

        setDynamicHeight(listView1);
        setDynamicHeight(listView2);
        setDynamicHeight(listView3);
        setDynamicHeight(listView4);

        return view;
    }

    /**
     * Set listview height based on listview children
     *
     * @param listView
     */
    public static void setDynamicHeight(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        //check adapter if null
        if (adapter == null) {
            return;
        }
        int height = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        for (int i = 0; i < adapter.getCount(); i++) {
            View listItem = adapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            height += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = height + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
        listView.requestLayout();
    }
}
