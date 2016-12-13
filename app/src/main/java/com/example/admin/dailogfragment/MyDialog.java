package com.example.admin.dailogfragment;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Admin on 12/12/2016.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener{

    Button yes, no;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_dialog, null);
        yes = (Button)view.findViewById(R.id.button3);
        no = (Button)view.findViewById(R.id.button2);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button3) {
            dismiss();
            Toast.makeText(getActivity(), "yes was clicked", Toast.LENGTH_LONG).show();
        }

        else {
            dismiss();
            Toast.makeText(getActivity(), "no was clicked", Toast.LENGTH_LONG).show();
        }

    }


}
