package com.example.nndb.testgridview.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.nndb.testgridview.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class HinhAdapter extends ArrayAdapter<Integer>
{

    Activity context;
    int resource;
    List<Integer> objects;

    public HinhAdapter(Activity context, int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);
        ImageView img=row.findViewById(R.id.imgHinh);
        img.setImageResource(this.objects.get(position));
        return row;
    }
}
