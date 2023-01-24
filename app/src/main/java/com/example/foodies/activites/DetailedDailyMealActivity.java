package com.example.foodies.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.foodies.R;
import com.example.foodies.adapters.DetailedDailyAdapter;
import com.example.foodies.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type !=null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b1,"upma recipe","morning meal","4.1","Min - 40","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b2,"Poha","morning meal","4.9","Min - 20","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.b3,"METHI THEPLA","morning meal","4.8","Min - 10","7:00AM to 10:00PM"));

             dailyAdapter.notifyDataSetChanged();
        }

        if(type !=null && type.equalsIgnoreCase("Dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner1,"Panner Tika","best for dinner","4.3","Min - 120","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner2,"Khichadi","best for dinner","4.2","Min - 60","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner3,"Gujarti Thali","best for dinner","4.1","Min - 100","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner4,"Kaju kari","best for dinner","4.9","Min - 90","7:00AM to 10:00PM"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type !=null && type.equalsIgnoreCase("Lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lu1,"Tomato-Garlic Lentil Bowls","lunch meal","4.2","Min - 80","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sandwich2,"Chees sanwich","lunch meal","4.1","Min - 40","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.burger2,"burger","lunch meal","4.6","Min - 50","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l2,"Gujarti Thali","lunch meal","4.7","Min - 80","7:00AM to 10:00PM"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type !=null && type.equalsIgnoreCase("Dessert")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fudgychewybrownies,"Fudgy Chewy Brownies","last course of meal","4.2","Min - 50","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lemontart,"Lemon Tart","last course of meal","4.4","Min - 20","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coconutkheer,"Rice Kheer ","last course of meal","4.9","Min - 30","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chocolatecoffeetruffle,"Chocolate Coffee Truffle","last course of meal","5.0","Min - 60","7:00AM to 10:00PM"));

            dailyAdapter.notifyDataSetChanged();
        }
        if(type !=null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c1,"Cold Coffee","served cold","4.4","Min - 20","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c2,"Hot Coffee","served hot","4.1","Min - 25","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c3,"caffè latte","tasty espresso with fresh","4.3","Min - 15","7:00AM to 10:00PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c4,"CAPPUCCINO","single espresso shot","4.9","Min - 30","7:00AM to 10:00PM"));

            dailyAdapter.notifyDataSetChanged();
        }
    }
}