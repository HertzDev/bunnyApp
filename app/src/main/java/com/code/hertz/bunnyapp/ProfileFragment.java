package com.code.hertz.bunnyapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class ProfileFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        ImageButton btnProfileMaintenance = (ImageButton) view.findViewById(R.id.imageButton2);
        btnProfileMaintenance.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent=new Intent(getContext(),ProfileMaintenance.class);
                startActivity(intent);
            }
        });

        return view;
    }


}

