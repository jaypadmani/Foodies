package com.example.foodies.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodies.R;
import com.example.foodies.adapters.FeaturedAdapter;
import com.example.foodies.adapters.FeaturedverAdapter;

import com.example.foodies.models.FeaturedModel;
import com.example.foodies.models.FeaturedverModel;


import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {


    ///////Featured Hor RecycleView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ///////Featured Ver RecycleView
    List<FeaturedverModel> featuredverModelList;
    RecyclerView recyclerView2;
    FeaturedverAdapter featuredverAdapter;




    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        ///////Featured Hor RecycleView


        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false)) ;
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.dinner3,"Gujarati thali","best for Gujarati"));
        featuredModelsList.add(new FeaturedModel(R.drawable.dosha,"Dosha","Dinner meal"));
        featuredModelsList.add(new FeaturedModel(R.drawable.puri,"Puri","best Food"));

        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);

        ///////Featured Ver RecycleView

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false)) ;
        featuredverModelList = new ArrayList<>();

        featuredverModelList.add(new FeaturedverModel(R.drawable.samsoa,"samosa","Best Food","4.8","7:00AM to 10:00PM"));
        featuredverModelList.add(new FeaturedverModel(R.drawable.vadapav,"Vadapav","Best Food","4.1","7:00AM to 10:00PM"));
        featuredverModelList.add(new FeaturedverModel(R.drawable.dablie,"Dabeli","Best Food","4.3","7:00AM to 10:00PM"));


        featuredverAdapter = new FeaturedverAdapter(featuredverModelList);
        recyclerView2.setAdapter(featuredverAdapter);

      //////popular ver recyclerview



        return view;
    }


}