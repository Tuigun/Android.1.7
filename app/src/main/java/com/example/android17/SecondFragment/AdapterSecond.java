package com.example.android17.SecondFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android17.Models.SecondModel;
import com.example.android17.R;

import java.util.ArrayList;

public class AdapterSecond extends RecyclerView.Adapter<AdapterSecond.ViewHolder> {

    private ArrayList<SecondModel> list;

    public AdapterSecond(ArrayList<SecondModel> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AdapterSecond.ViewHolder holder, int position) {

        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView, textView2;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemtext);
            textView2 = itemView.findViewById(R.id.itemtext2);


        }

        public void onBind(SecondModel secondModel) {

            textView.setText(secondModel.getTextView());
            textView2.setText(secondModel.getTextView());

        }
    }
}
