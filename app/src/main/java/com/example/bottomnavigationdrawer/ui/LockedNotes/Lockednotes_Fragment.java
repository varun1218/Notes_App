package com.example.bottomnavigationdrawer.ui.LockedNotes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bottomnavigationdrawer.R;
import com.example.bottomnavigationdrawer.databinding.FragmentLockednotesBinding;

public class Lockednotes_Fragment extends Fragment {

    private FragmentLockednotesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_lockednotes, container, false);

    }

}