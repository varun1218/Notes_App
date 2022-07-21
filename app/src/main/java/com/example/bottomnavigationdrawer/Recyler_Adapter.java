package com.example.bottomnavigationdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigationdrawer.ui.getset;

import java.util.ArrayList;


public class Recyler_Adapter extends RecyclerView.Adapter<Recyler_Adapter.myviewholder> {
    Context context;
    ArrayList<getset> list ;

    public Recyler_Adapter(Context context , ArrayList<getset> list){
        this.context=context;
        this.list=list;
    }



    @NonNull
    @Override
    public Recyler_Adapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view_design, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recyler_Adapter.myviewholder holder, int position) {
        getset model = list.get(position);
        holder.tv1.setText(model.getTitle());
        holder.tv1.setText(model.getDescription());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView tv1 ,  tv2 ;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.insert_title);
            tv2 = itemView.findViewById(R.id.insert_description);
        }
    }
}
