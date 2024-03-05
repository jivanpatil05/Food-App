package com.example.foodapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

   UpdateVerticalRec updateVerticalRec;
   Activity activity;
   ArrayList<HomeHorModel> list;

   boolean check=true;
   boolean select=true;
   int row_index=-1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "pizza 1", "01:00 - 12:00", "4.9", "Min - $53"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "pizza 2", "01:00 - 12:00", "4.9", "Min - $53"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "pizza 3", "01:00 - 12:00", "4.9", "Min - $53"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "pizza 4", "01:00 - 12:00", "4.9", "Min - $53"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){
                        ArrayList<HomeVerModel>homeVerModels=new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"pizza 1","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"pizza 2","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"pizza 3","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"pizza 4","01:00 - 12:00","4.9","Min - $53"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 1)
                    {
                        ArrayList<HomeVerModel>homeVerModels=new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Burger 1","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Burger 2","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Burger 3","01:00 - 12:00","4.9","Min - $53"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 2)
                    {
                        ArrayList<HomeVerModel>homeVerModels=new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries1,"fries 1","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2,"fries 2","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3,"fries 3","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4,"fries 3","01:00 - 12:00","4.9","Min - $53"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 3)
                    {
                        ArrayList<HomeVerModel>homeVerModels=new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"icecream 1","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"icecream 2","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"icecream 3","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4,"icecream 3","01:00 - 12:00","4.9","Min - $53"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 4)
                    {
                        ArrayList<HomeVerModel>homeVerModels=new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"sandwich 1","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"sandwich 2","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"sandwich 3","01:00 - 12:00","4.9","Min - $53"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"sandwich 3","01:00 - 12:00","4.9","Min - $53"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if (select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select=false;
                }
            }
            else{
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else{
                    holder.cardView.setBackgroundResource(R.drawable.defauilt_bg);
                }

            }
        }


    @Override
    public int getItemCount() {
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
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
