package com.example.nndb.testgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.nndb.testgridview.adapter.HinhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        GridView gvHinh;
        ArrayList<Integer> dsHinh;
        HinhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        gvHinh=findViewById(R.id.gvHInh);
        dsHinh=new ArrayList<>();
        dsHinh.add(R.drawable.h1);
        dsHinh.add(R.drawable.h10);
        dsHinh.add(R.drawable.h2);
        dsHinh.add(R.drawable.h3);
        dsHinh.add(R.drawable.h4);
        dsHinh.add(R.drawable.h5);
        dsHinh.add(R.drawable.h6);
        dsHinh.add(R.drawable.h7);
        dsHinh.add(R.drawable.h8);
        dsHinh.add(R.drawable.h9);

        adapter=new HinhAdapter(MainActivity.this,R.layout.item,dsHinh);
        gvHinh.setAdapter(adapter);

    }
}
