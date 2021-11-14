package com.example.foodies.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodies.R;
import com.example.foodies.adapters.DailyMealAdapter;
import com.example.foodies.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.copyofbreakfast,"BreakFast","30% Off","morning meal","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","16% Off","eaten midday ","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","20% Off","largest meal","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Dessert","10% Off","last course of a meal","sweet"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffee","15% Off","best Drink","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }

}