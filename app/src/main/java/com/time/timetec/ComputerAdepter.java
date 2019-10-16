package com.time.timetec;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComputerAdepter extends RecyclerView.Adapter<ComputerAdepter.computerViewHolder>{

    private List<ComputerModel> computerModels;
    private Context context;

    public ComputerAdepter(List<ComputerModel> computerModels, Context context) {
        this.computerModels = computerModels;
        this.context = context;
    }

    @NonNull
    @Override
    public computerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.computer_item_layout,parent,false);
        return new computerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull computerViewHolder holder, int position) {

        int image = computerModels.get(position).getImage();
        String name = computerModels.get(position).getName();
        String price = computerModels.get(position).getPrice();

        holder.imageIV.setImageResource(image);
        holder.nameTV.setText(name);
        holder.priceTV.setText(price);

    }

    @Override
    public int getItemCount() {
        return computerModels.size();
    }

    public class computerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageIV;
        TextView nameTV,priceTV;

        public computerViewHolder(@NonNull View itemView) {
            super(itemView);

            imageIV = itemView.findViewById(R.id.image_laptop);
            nameTV = itemView.findViewById(R.id.textView_name);
            priceTV = itemView.findViewById(R.id.textView_price_id);
        }
    }
}
