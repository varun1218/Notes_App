package com.example.bottomnavigationdrawer.ui.privacypolicy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bottomnavigationdrawer.R;
import com.example.bottomnavigationdrawer.databinding.FragmentAllnotesBinding;


public class privacy_policy_fragment extends Fragment {

    private FragmentAllnotesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_privacy_policy, container, false);
    }

}