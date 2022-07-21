package com.example.bottomnavigationdrawer.ui.Faqs;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bottomnavigationdrawer.R;
import com.example.bottomnavigationdrawer.databinding.FragmentFaqsBinding;


public class FaQs_Fragment extends Fragment {

    private FragmentFaqsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_faqs, container, false);
    }


}