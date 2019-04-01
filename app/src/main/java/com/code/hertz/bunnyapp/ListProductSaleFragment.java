package com.code.hertz.bunnyapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ListProductSaleFragment extends Fragment {

    public ListProductSaleFragment() {
        // Required empty public constructor
    }


    public static ListProductSaleFragment newInstance(String param1, String param2) {
        ListProductSaleFragment fragment = new ListProductSaleFragment();

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
        return inflater.inflate(R.layout.fragment_list_product_sale, container, false);
    }


}
