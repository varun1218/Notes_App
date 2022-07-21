package com.example.bottomnavigationdrawer.ui.All_notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.bottomnavigationdrawer.R;
import com.example.bottomnavigationdrawer.ui.Add_notes.Add_notes_Fragment;
import com.example.bottomnavigationdrawer.ui.getset;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;


public class Allnotes_Fragment extends Fragment {
    View view;
   RecyclerView recyclerView;
   ArrayList<getset> list ;
   FloatingActionButton fa_allnotes;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_allnotes, container, false);
       fa_allnotes = view.findViewById(R.id.fab_add_notes);
        recyclerView = view.findViewById(R.id.recyclerview);
        fa_allnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                Add_notes_Fragment addfragment = new Add_notes_Fragment();
                fragmentTransaction.replace(R.id.all_notes_fm, addfragment);
                fragmentTransaction.commit();

            }
        });


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }

}