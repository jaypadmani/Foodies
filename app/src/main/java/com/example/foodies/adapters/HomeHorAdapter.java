package com.example.foodies.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodies.R;
import com.example.foodies.models.HomeHorModel;
import com.example.foodies.models.HomeVarModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateverticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check=true;
    boolean select=true;
    int row_index=-1;

    public HomeHorAdapter(UpdateVerticalRec updateverticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateverticalRec = updateverticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
   @Override
    public  ViewHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){
    return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public  void onBindViewHolder (@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position){
            holder.imageView.setImageResource(list.get(position).getImage());
            holder.name.setText(list.get(position).getName());

            if(check) {
                ArrayList<HomeVarModel> homeVarModels = new ArrayList<>();
                homeVarModels.add(new HomeVarModel(R.drawable.pizza1, "Margherita", "7:00AM - 10:00 PM", "4.9", "Min - 80"));
                homeVarModels.add(new HomeVarModel(R.drawable.pizza2, "Greek Pizza", "7:00AM - 10:00 PM", "4.9", "Min - 80"));
                homeVarModels.add(new HomeVarModel(R.drawable.pizza3, "Peppy Paneer", "7:00AM - 10:00 PM", "4.9", "Min - 80"));
                homeVarModels.add(new HomeVarModel(R.drawable.pizza4, "10-Cheese pizza ", "7:00AM - 10:00 PM", "4.9", "Min - 80"));

                updateverticalRec.callBack(position, homeVarModels);
                check = false;
            }
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        row_index=position;
                        notifyDataSetChanged();

                        if(position == 0){
                            ArrayList<HomeVarModel> homeVarModels=new ArrayList<>();

                            homeVarModels.add(new HomeVarModel(R.drawable.pizza1,"Margherita","7:00AM - 10:00 PM","4.9","Min - 450 "));
                            homeVarModels.add(new HomeVarModel(R.drawable.pizza2,"Greek Pizza","7:00AM - 10:00 PM","4.5","Min - 512"));
                            homeVarModels.add(new HomeVarModel(R.drawable.pizza3,"Peppy Paneer ","7:00AM - 10:00 PM","4.3","Min - 600"));
                            homeVarModels.add(new HomeVarModel(R.drawable.pizza4,"10-Cheese pizza ","7:00AM - 10:00 PM","5.00","Min - 798"));

                            updateverticalRec.callBack(position,homeVarModels);
                        }
                        else if(position==1){
                            ArrayList<HomeVarModel> homeVarModels=new ArrayList<>();

                            homeVarModels.add(new HomeVarModel(R.drawable.burger1,"Veg Maharaja ","7:00AM - 10:00 PM","3.9","Min - 40"));
                            homeVarModels.add(new HomeVarModel(R.drawable.burger2,"Tomato Stuffed Burger","7:00AM - 10:00 PM","4.8","Min - 60"));
                            homeVarModels.add(new HomeVarModel(R.drawable.burger4,"Chilli burger","7:00AM - 10:00 PM","4.2","Min - 75"));

                            updateverticalRec.callBack(position,homeVarModels);
                        }
                        else if(position==2){
                            ArrayList<HomeVarModel> homeVarModels=new ArrayList<>();

                            homeVarModels.add(new HomeVarModel(R.drawable.fries1,"potato fries","7:00AM - 10:00 PM","4.3","Min - 50"));
                            homeVarModels.add(new HomeVarModel(R.drawable.fries2,"Chili cheese fries","7:00AM - 10:00 PM","4.7","Min - 70"));
                            homeVarModels.add(new HomeVarModel(R.drawable.fries3,"steak fries","7:00AM - 10:00 PM","3.9","Min - 55"));
                            homeVarModels.add(new HomeVarModel(R.drawable.fries4,"Curly fries","7:00AM - 10:00 PM","4.8","Min - 80"));

                            updateverticalRec.callBack(position,homeVarModels);
                        }
                        else if(position==3){
                            ArrayList<HomeVarModel> homeVarModels=new ArrayList<>();

                            homeVarModels.add(new HomeVarModel(R.drawable.icecream1,"Vanilla","7:00AM - 10:00 PM","4.1","Min - 10"));
                            homeVarModels.add(new HomeVarModel(R.drawable.icecream2,"Chocolate","7:00AM - 10:00 PM","5.0","Min - 20"));
                            homeVarModels.add(new HomeVarModel(R.drawable.icecream3,"Strawberry","7:00AM - 10:00 PM","4.4","Min - 15"));
                            homeVarModels.add(new HomeVarModel(R.drawable.icecream4,"Buttered Pecan","7:00AM - 10:00 PM","4.6","Min - 30"));

                            updateverticalRec.callBack(position,homeVarModels);
                        }
                        else if(position==4){
                            ArrayList<HomeVarModel> homeVarModels=new ArrayList<>();

                            homeVarModels.add(new HomeVarModel(R.drawable.sandwich1,"Ham Sandwich","7:00AM - 10:00 PM","4.9","Min - 20"));
                            homeVarModels.add(new HomeVarModel(R.drawable.sandwich2,"Tomato Sandwich","7:00AM - 10:00 PM","4.5","Min - 25"));
                            homeVarModels.add(new HomeVarModel(R.drawable.sandwich3,"Grilled Sandwich","7:00AM - 10:00 PM","4.2","Min - 35"));
                            homeVarModels.add(new HomeVarModel(R.drawable.sandwich4,"Paneer Sandwich","7:00AM - 10:00 PM","3.9","Min - 30"));

                            updateverticalRec.callBack(position,homeVarModels);
                        }

                    }
                });

              if(select){
                  if(position == 0){
                      holder.cardView.setBackgroundResource(R.drawable.change_bg);
                      select = false;
                  }
              }
              else {
                  if(row_index == position){
                      holder.cardView.setBackgroundResource(R.drawable.change_bg);
                  }else {
                      holder.cardView.setBackgroundResource(R.drawable.default_bg);

                  }
              }

            }


    @Override
    public  int getItemCount() {
            return list.size();
        }


    public class ViewHolder extends RecyclerView.ViewHolder {

       ImageView imageView;
       TextView name;
       CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_text);
            cardView=itemView.findViewById(R.id.cardview);

        }
    }
}
