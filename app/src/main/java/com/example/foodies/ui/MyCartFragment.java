package com.example.foodies.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.foodies.R;
import com.example.foodies.activites.LoginActivity;
import com.example.foodies.activites.RegistationActivity;
import com.example.foodies.activites.mycart;
import com.example.foodies.adapters.CartAdapter;
import com.example.foodies.databinding.MakeorderBinding;
import com.example.foodies.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    Button makeOrderButton;



    public MyCartFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_my_cart, container, false);
        makeOrderButton = (Button) view.findViewById(R.id.makeOrderButton) ;

       recyclerView = view.findViewById(R.id.cart_rec);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       list = new ArrayList<>();

       list.add(new CartModel(R.drawable.pizza1,"Margherita","450","4.9"));
       list.add(new CartModel(R.drawable.burger1,"Veg Maharaja","40","3.9"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);


        makeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), mycart.class);
                startActivity(intent);
            }
        });


       return view;


    }

}