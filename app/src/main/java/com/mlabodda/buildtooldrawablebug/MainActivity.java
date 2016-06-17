package com.mlabodda.buildtooldrawablebug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mlabodda.buildtooldrawablebug.decorator.DividerItemDecoration;
import com.mlabodda.buildtooldrawablebug.recycler.DemoRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
    }

    @Override
    protected void onResume() {
        super.onResume();

        DemoRecyclerAdapter adapter = new DemoRecyclerAdapter(genRandomList(100));
        recyclerView.setAdapter(adapter);

    }

    private List<String> genRandomList(int number) {
        List<String> rStrings = new ArrayList<>(number);

        for (int i = 0; i < number; i++) {
            rStrings.add(UUID.randomUUID().toString());
        }

        return rStrings;
    }
}
