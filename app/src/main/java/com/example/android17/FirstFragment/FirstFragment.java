package com.example.android17.FirstFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android17.Models.FirstModel;
import com.example.android17.R;
import com.example.android17.ThirdFragment.ThirtFragment;

import java.util.ArrayList;


public class FirstFragment extends Fragment implements firstAdapter.OnItemClickListener {

    private ArrayList<FirstModel> list;
    private firstAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


      View view = inflater.inflate(R.layout.fragment_first, container, false);

      list = new ArrayList<>();

      list.add(new FirstModel(R.drawable.agent, "alive","Jax"));
      list.add(new FirstModel(R.drawable.blackboy, "dead","Black"));
      list.add(new FirstModel(R.drawable.boy, "alive","boy"));
      list.add(new FirstModel(R.drawable.doctor, "alive","Doc"));
      list.add(new FirstModel(R.drawable.girl, "alive","Soniy"));
      list.add(new FirstModel(R.drawable.staric, "dead","tom"));
      list.add(new FirstModel(R.drawable.teacher, "alive","Amanda"));
      list.add(new FirstModel(R.drawable.wife, "alive","Julia"));

      recyclerView = view.findViewById(R.id.recycler);
      adapter = new firstAdapter(getContext(),list);
      recyclerView.setAdapter(adapter);

      return view;


    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter.setOnItemClickListener(this);
    }

    @Override
    public void onClick(int pos) {

        Bundle bundle = new Bundle();
        FirstModel firstModel = adapter.getItem(pos);
        ThirtFragment thirtFragment = new ThirtFragment();
        bundle.putSerializable("Model",firstModel);
        thirtFragment.setArguments(bundle);

        getParentFragmentManager().beginTransaction().replace(R.id.Conteinter,thirtFragment).commit();

    }
}