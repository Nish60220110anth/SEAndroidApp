package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class SolarFragment extends Fragment {

    ViewPager viewPager;
    GraphFragmentPageAdapter pageAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // placeholder for the BarChart Created in layout
        // layout parent
        View v=inflater.inflate(R.layout.fragment_solar, container, false);
//        BarChart barChart = v.findViewById(R.id.bar_Chart);
//        ArrayList<BarEntry>  barData = new ArrayList<>();
//
//        for(int i=0;i<5;i++) {
//            BarEntry barEntry = new BarEntry(i,5*i);
//            barData.add(barEntry);
//        }
//
//        BarDataSet dataSet = new BarDataSet(barData,"MyClimate");
//        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
//        dataSet.setDrawValues(false);
//
//        barChart.setData(new BarData(dataSet));
//        barChart.animateY(2000);
//
//        barChart.getDescription().setText("MyClimateText");
//        barChart.getDescription().setTextColor(Color.BLUE);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
        viewPager = view.findViewById(R.id.pager);
        pageAdapter = new GraphFragmentPageAdapter(getChildFragmentManager());
        viewPager.setAdapter(pageAdapter);
    }
}

