package com.ajayam.activity_2_fragment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ajayam.activity_2_fragment.R;

public class FirstFragment extends Fragment {

    TextView name, phone;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        name = view.findViewById(R.id.FragName);
        phone = view.findViewById(R.id.FragPhone);

        Bundle bundle = this.getArguments();

        name.setText(bundle.getString("name"));
        phone.setText(bundle.getString("phone"));


        return view;
    }
}