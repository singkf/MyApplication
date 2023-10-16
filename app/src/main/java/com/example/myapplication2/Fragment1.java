package com.example.myapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {
    List<String> name_list = new ArrayList<>();
    RecyclerView recycleView;
    myadapter adapter;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1,container,false);
        recycleView = view.findViewById(R.id.RecyclerView);
        initdata();
        adapter = new myadapter(this.getActivity(),name_list);

        LinearLayoutManager manager = new LinearLayoutManager(this.getActivity());
        manager.setOrientation(RecyclerView.VERTICAL);
        recycleView.setLayoutManager(manager);
        recycleView.addItemDecoration(new DividerItemDecoration(this.requireActivity(),DividerItemDecoration.VERTICAL));
        recycleView.setHasFixedSize(true);
        recycleView.setAdapter(adapter);

        return view;
    }

    private void initdata() {
        name_list.add("我是1");
        name_list.add("我是2");
        name_list.add("我是3");
        name_list.add("我是4");
        name_list.add("我是5");
        name_list.add("我是6");
        name_list.add("我是7");
        name_list.add("我是8");
        name_list.add("我是9");
        name_list.add("我是10");
    }
}