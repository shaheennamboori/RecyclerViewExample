package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> mContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContacts = new ArrayList<>();
        mContacts.add(new Contact("Shaheen","8888888888888"));
        mContacts.add(new Contact("foo","7777777777777"));

        RecyclerView myRecycler = findViewById(R.id.recyclerView);
        MyAdapter myAdapter = new MyAdapter(this,mContacts);
        myRecycler.setLayoutManager(new LinearLayoutManager(this));
        myRecycler.setAdapter(myAdapter);
    }
}
