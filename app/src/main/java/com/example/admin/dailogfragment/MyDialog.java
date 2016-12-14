package com.example.admin.dailogfragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 12/12/2016.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener{

    Button yes, no, ok;
    Activity activity;
    TextView test;

    OnOkButtonClickedListener myListener;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //getDialog().setTitle("Στοιχεία επιβάτη");
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);


        View view = inflater.inflate(R.layout.dialog_fragment_1, null);
        ok = (Button)view.findViewById(R.id.done_button);
        ok.setOnClickListener(this);

        test = (TextView)view.findViewById(R.id.adults_number_pick);

/*
        yes = (Button)view.findViewById(R.id.button3);
        no = (Button)view.findViewById(R.id.button2);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        setCancelable(false);
        */

        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button3) {
            dismiss();
            Toast.makeText(getActivity(), "yes was clicked", Toast.LENGTH_LONG).show();
        }

        else if(view.getId() == R.id.done_button) {
            dismiss();

            try{
                Toast.makeText(getActivity(), "all good  " + test.getText().toString(), Toast.LENGTH_LONG).show();
                ((OnOkButtonClickedListener) activity).onOkButtonClicked(test.getText().toString());
            }catch (ClassCastException cce){
                Toast.makeText(getActivity(), "must implement shit brah", Toast.LENGTH_LONG).show();
            }

        }

        else {
            dismiss();
            Toast.makeText(getActivity(), "no was clicked", Toast.LENGTH_LONG).show();
        }


    }


    //container activity must implement this interface
    public interface OnOkButtonClickedListener {
        public void onOkButtonClicked(String testStr);
    }

}
