package com.example.manutdapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {


    String data1[], data2[];
    int  images[] = {R.drawable.away1,R.drawable.away2,R.drawable.away5,R.drawable.away6,R.drawable.back1,R.drawable.back3,R.drawable.boots1};
    Context context;


    public myAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);
        holder.myimg.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mytext1, mytext2;
        ImageView myimg;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mytext1 = itemView.findViewById(R.id.textView4);
            mytext2 = itemView.findViewById(R.id.textView5);
            myimg = itemView.findViewById(R.id.imageView6);
        }
    }
}
