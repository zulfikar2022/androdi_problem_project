package com.example.newdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;




import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<ItemClass> {


    TextView textName,textAge,textAddress;


    LayoutInflater inflater;


    public CustomArrayAdapter(@NonNull Context context, ArrayList<ItemClass> items) {
        super(context,0,items);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemClass item = getItem(position);

        if(convertView == null){
              convertView = inflater.inflate(R.layout.raw_resource,parent,false);
        }

        if(item != null){
            textName = convertView.findViewById(R.id.textName);
            textAge = convertView.findViewById(R.id.textAge);
            textAddress = convertView.findViewById(R.id.textAddress);

            textName.setText(item.getName());
            textAge.setText(item.getAge());
            textAddress.setText(item.getAddress());
        }

        return  convertView;

    }
}
