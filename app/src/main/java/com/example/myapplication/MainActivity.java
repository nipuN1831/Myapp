package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView listView;
    String [] fruits = {"Apple", "Mango", "Banana", "Watermelon","Cherry","Orange"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachID();
        adapter = new ArrayAdapter<>(this, R.layout.list_item, fruits);

        listView.setAdapter(adapter);
    }

    private  void attachID()
    {
        listView = findViewById(R.id.list_view_view);
    }
}