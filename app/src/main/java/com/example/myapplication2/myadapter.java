package com.example.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.myholder> {
    Context context1;
    List list1;
    public myadapter(Context context, List list) {
        context1 = context;
        list1 = list;
    }

    @NonNull
    @Override
    public myadapter.myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        myholder myholder = new myholder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter.myholder holder, int position) {
        holder.textView.setText(list1.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class myholder extends RecyclerView.ViewHolder{
        TextView textView;
        public myholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item);
        }
    }
}
