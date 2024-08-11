package com.example.kofico.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
//import com.bumptech.glide.Glide;
//import com.example.kofico.databinding.PopularItemBinding;
import com.example.kofico.R;
import com.example.kofico.models.item;
import java.util.List;

public class adapter_item extends RecyclerView.Adapter<adapter_item.ViewHolder> {

    List<item> list;

    public adapter_item(List<item> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate=LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item,parent,false);
        return new  ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.getTextView().setText(localDataSet[position]);
        item currentItem = list.get(position); // Get the current item
        holder.name.setText(currentItem.getName()); // Assuming 'item' has a 'getName()' method
        holder.rating.setText(currentItem.getRating()); // Assuming 'item' has a 'getRating()' method
        holder.price.setText(currentItem.getPrice()); // Assuming 'item' has a 'getPrice()' method
        // Set other views similarly

        // Load the image using Glide
//        Glide.with(holder.itemView.getContext())
//                .load(currentItem.getImgUrl())
//                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,rating,price;
        ImageView image;
        ConstraintLayout layout;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemview) {
           super(itemview );
            name= name.findViewById(R.id.all_judul);
            rating= rating.findViewById(R.id.all_rating);
            price= price.findViewById(R.id.all_price);
            image= image.findViewById(R.id.all_image);
            layout= layout.findViewById(R.id.mainlayout);

        }
    }
}
