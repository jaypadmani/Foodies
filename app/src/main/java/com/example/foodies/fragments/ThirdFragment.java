package com.example.foodies.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodies.R;
import com.example.foodies.adapters.NewAdapter;
import com.example.foodies.adapters.NewVerAdapter;
import com.example.foodies.adapters.PopularAdapter;
import com.example.foodies.adapters.PopularVerAdapter;
import com.example.foodies.models.NewModel;
import com.example.foodies.models.NewVerModel;
import com.example.foodies.models.PopularModel;
import com.example.foodies.models.PopularVerModel;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {

    ArrayList<NewModel> newModelArrayList;
    RecyclerView recyclerView4;
    NewAdapter newAdapter;

    ArrayList<NewVerModel> newVerModelArrayList;
    RecyclerView recyclerView5;
    NewVerAdapter newVerAdapter;

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView5 = view.findViewById(R.id.featured_ver_rec);
        recyclerView5.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false)) ;
        newModelArrayList = new ArrayList<NewModel>();
        newVerModelArrayList = new ArrayList<NewVerModel>();

        try {
            newVerModelArrayList.add(new NewVerModel(R.drawable.cholebhature,"Chole bhature","New Item","4.6","7:00AM to 10:00PM"));
            newVerModelArrayList.add(new NewVerModel(R.drawable.aloopartha,"Aloo paratha","New Item","4.7","7:00AM to 10:00PM"));
            newVerModelArrayList.add(new NewVerModel(R.drawable.kulchachole,"Khlcha chole","New Item","4.2","7:00AM to 10:00PM"));
        }catch (Exception e) {

        }



        newVerAdapter = new NewVerAdapter(newVerModelArrayList);
        recyclerView5.setAdapter(newVerAdapter);

        return view;
    }
}