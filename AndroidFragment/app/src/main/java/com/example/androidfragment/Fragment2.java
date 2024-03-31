package com.example.androidfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    private TextView tvName, tvAge;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.activity_fragment2,container,false);
        tvName = (TextView) view.findViewById(R.id.tvName);
        tvAge = (TextView) view.findViewById(R.id.tvAge);
        return view;
    }
    public void showInfo(String name, String age){
        tvName.setText(name);
        tvAge.setText(age);
    }
}
