package com.example.foodies.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodies.R;
import com.example.foodies.models.NewModel;
import com.example.foodies.models.PopularModel;

import java.util.ArrayList;
import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {
    List<NewModel> list = new ArrayList<>();

    public NewAdapter(List<NewModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NewAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.feautured_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.desc.setText(list.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.featured_img);
            name=itemView.findViewById(R.id.featured_name);
            desc=itemView.findViewById(R.id.featured_des);
        }
    }
}
