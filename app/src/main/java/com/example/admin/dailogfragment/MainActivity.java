package com.example.admin.dailogfragment;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.OnOkButtonClickedListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View v){

        FragmentManager manager = getFragmentManager();
        MyDialog myDialog = new MyDialog();
        myDialog.show(manager, "MyDialog");
    }

    @Override
    public void onOkButtonClicked(String testStr) {
        testStr.concat("la");
        Toast.makeText(getApplicationContext(), "ground control to major Tom : " + testStr, Toast.LENGTH_LONG).show();
    }
}
