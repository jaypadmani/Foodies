package com.example.foodies.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodies.R;
import com.example.foodies.adapters.HomeHorAdapter;
import com.example.foodies.adapters.HomeVarAdapter;
import com.example.foodies.adapters.UpdateVerticalRec;
import com.example.foodies.models.HomeHorModel;
import com.example.foodies.models.HomeVarModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    ////////////////vertical
    ArrayList<HomeVarModel> homeVarModelList;
    HomeVarAdapter homeVarAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontalRec=root.findViewById(R.id.home_hor_rec);
        homeVerticalRec= root.findViewById(R.id.home_var_rec);


        ///////////////////Horizontal RecyclerView
        homeHorModelList=new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.burger,"burger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fry,"fry"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Icecream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"SandWitch"));

        homeHorAdapter= new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        ///////////////////Vertical RecyclerView
        homeVarModelList=new ArrayList<>();

        homeVarAdapter = new HomeVarAdapter(getActivity(),homeVarModelList);
        homeVerticalRec.setAdapter(homeVarAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;


    }


    @Override
    public void callBack(int position, ArrayList<HomeVarModel> list) {

        homeVarAdapter = new HomeVarAdapter(getContext(),list);
        homeVarAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVarAdapter);
    }
}