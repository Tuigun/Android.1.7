package com.example.android17.ThirdFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android17.Models.FirstModel;
import com.example.android17.R;


public class ThirtFragment extends Fragment {


    private FirstModel firstModel;
    private ImageView imageView;
    private TextView textView, textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thirt, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = view.findViewById(R.id.image_item);
        textView = view.findViewById(R.id.status);
        textView2 = view.findViewById(R.id.surname);

        firstModel =  (FirstModel) getArguments().getSerializable("Model");

        imageView.setImageResource(firstModel.getImage());
        textView.setText(firstModel.getStatus());
        textView2.setText(firstModel.getSureName());

    }
}