package com.example.newdatabase;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<ItemClass> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        list.add(new ItemClass("Sayed Zulfikar Mahmud",23,"Madhabbati,Birol,Dinajpur"));
        list.add(new ItemClass("Mezbahun Jannat Maisha",18,"Madhabbati,Birlo,Dinajpur"));
        list.add(new ItemClass("Masudul Haque",45,"Madhabbati,Birol,Dinajpur"));
        list.add(new ItemClass("Shahriar Parvej",30,"Setabgonj"));
        list.add(new ItemClass("Saroan Bin Hamid",22,"Dhaka,Bangladesh"));

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(this,list);
        listView.setAdapter(customArrayAdapter);
    }
}