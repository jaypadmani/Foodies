package com.example.foodies.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodies.R;
import com.example.foodies.adapters.PopularAdapter;
import com.example.foodies.adapters.PopularVerAdapter;
import com.example.foodies.models.PopularModel;
import com.example.foodies.models.PopularVerModel;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    ArrayList<PopularModel> popularModelList;
    RecyclerView recyclerView1;
    PopularAdapter popularAdapter;

    ArrayList<PopularVerModel> popularVerModelList;
    RecyclerView recyclerView3;
    PopularVerAdapter popularVerAdapter;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        recyclerView3 = view.findViewById(R.id.featured_ver_rec);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false)) ;
        popularModelList = new ArrayList<PopularModel>();
        popularVerModelList = new ArrayList<PopularVerModel>();

        try {
            popularVerModelList.add(new PopularVerModel(R.drawable.samsoa,"samosa","Best Food","4.8","7:00AM to 10:00PM"));
            popularVerModelList.add(new PopularVerModel(R.drawable.vadapav,"Vadapav","Best Food","4.1","7:00AM to 10:00PM"));
            popularVerModelList.add(new PopularVerModel(R.drawable.dablie,"Dabeli","Best Food","4.3","7:00AM to 10:00PM"));
        }catch (Exception e) {

        }



        popularVerAdapter = new PopularVerAdapter(popularVerModelList);
        recyclerView3.setAdapter(popularVerAdapter);

        return view;
    }
}