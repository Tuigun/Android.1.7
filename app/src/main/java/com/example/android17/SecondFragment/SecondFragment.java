package com.example.android17.SecondFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android17.Models.SecondModel;
import com.example.android17.R;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private ArrayList<SecondModel> secondModel;
    private RecyclerView recyclerView;
    private AdapterSecond adapterSecond;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.fragment_second, container, false);

       secondModel = new ArrayList<>();
       secondModel.add(new SecondModel("Earth","Planet"));
       secondModel.add(new SecondModel("Ella","Abadango"));
       secondModel.add(new SecondModel("resort","Planet"));
       secondModel.add(new SecondModel("Saturn","Planet"));
       secondModel.add(new SecondModel("Merkury","Planet"));
       secondModel.add(new SecondModel("Upiter","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));
       secondModel.add(new SecondModel("Neptun","Planet"));





       recyclerView = view.findViewById(R.id.recycler2);
       adapterSecond = new AdapterSecond(secondModel);
       recyclerView.setAdapter(adapterSecond);
       return view;


    }
}