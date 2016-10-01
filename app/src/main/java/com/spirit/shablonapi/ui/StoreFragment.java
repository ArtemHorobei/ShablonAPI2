package com.spirit.shablonapi.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.spirit.shablonapi.R;

public class StoreFragment extends Fragment{

    Context context = getActivity();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = (View) inflater.inflate(R.layout.fragment_store, container, false);

        //Toast.makeText(context, "This is Store Fragment", Toast.LENGTH_LONG).show();
        Log.d("Fragment Store ","onCreateView");

        return v;
    }


}
