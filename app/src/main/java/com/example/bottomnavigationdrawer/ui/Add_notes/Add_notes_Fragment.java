package com.example.bottomnavigationdrawer.ui.Add_notes;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;
import com.example.bottomnavigationdrawer.My_Database;
import com.example.bottomnavigationdrawer.R;

import com.example.bottomnavigationdrawer.ui.All_notes.Allnotes_Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Add_notes_Fragment extends Fragment {
    EditText insert_title , insert_description ;
    FloatingActionButton floatingActionButton;
    View view;
    My_Database mydatabase;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_addnotes, container, false);
        floatingActionButton = view.findViewById(R.id.fab_add_new_notes);
        insert_title = view.findViewById(R.id.insert_title);
        insert_description = view.findViewById(R.id.insert_description);


        mydatabase = new My_Database(getActivity().getApplicationContext());


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getting_Title = insert_title.getText().toString();
                String getting_Description = insert_description.getText().toString();

                if (getting_Title.isEmpty() ){
                    Toast.makeText(getActivity().getApplicationContext(), "title is empty", Toast.LENGTH_SHORT).show();
                }else if(getting_Description.isEmpty()){
                    Toast.makeText(getActivity().getApplicationContext(), "description is empty", Toast.LENGTH_SHORT).show();
                }else{
                    mydatabase.addnewData(getting_Title,getting_Description);
                    insert_title.setText("");
                    insert_description.setText("");
                    Toast.makeText(getActivity().getApplicationContext(),"Your data has been added",Toast.LENGTH_SHORT).show();
                     loadFragment();

                }

            }
        });


        return  view ;
    }

    private void loadFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        Allnotes_Fragment allnotes_fragment = new Allnotes_Fragment();
        fragmentTransaction.replace(R.id.add_notes_fm, allnotes_fragment);
        fragmentTransaction.commit();
    }

}