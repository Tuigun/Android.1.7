package com.example.android17.FirstFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android17.Models.FirstModel;
import com.example.android17.R;

import java.util.ArrayList;

public class firstAdapter extends RecyclerView.Adapter<firstAdapter.ViewHolder> {

    private ArrayList<FirstModel> list;
    private OnItemClickListener onItemClickListener;

    public firstAdapter(Context context,ArrayList<FirstModel> list){
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();

    }
    public FirstModel getItem(int pos){
        return list.get(pos);

    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.firstitemlist,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(firstAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.itemView.setOnClickListener(v -> onItemClickListener.onClick(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView textView,textView2;

        public ViewHolder( View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_item);
            textView = itemView.findViewById(R.id.txt_item);
            textView2 = itemView.findViewById(R.id.txt2_item);


        }

        public void onBind(FirstModel firstModel) {
            image.setImageResource(firstModel.getImage());
            textView.setText(firstModel.getStatus());
            textView2.setText(firstModel.getSureName());


        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
