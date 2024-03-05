package com.example.foodapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    List<CartModel> lisr;

    public CartAdapter(List<CartModel> lisr) {
        this.lisr = lisr;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(lisr.get(position).getImage());
        holder.name.setText(lisr.get(position).getName());
        holder.price.setText(lisr.get(position).getPrice());
        holder.time.setText(lisr.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return lisr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,price,time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.c_img);
            name=itemView.findViewById(R.id.c_name);
            price=itemView.findViewById(R.id.c_price);
            time=itemView.findViewById(R.id.c_timing);

        }
    }
}
