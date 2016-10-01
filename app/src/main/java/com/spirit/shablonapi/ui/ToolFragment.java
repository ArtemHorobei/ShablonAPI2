package com.spirit.shablonapi.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spirit.shablonapi.R;

public class ToolFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = (View) inflater.inflate(R.layout.fragment_tools, container, false);

        //Toast.makeText(context, "This is Store Fragment", Toast.LENGTH_LONG).show();
        Log.d("Fragment Tool ","onCreateView   Tools");

        return v;
    }
}
