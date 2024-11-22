package com.htn_hao.task;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTasks;
    private FloatingActionButton fabAddTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        rvTasks = findViewById(R.id.rvTasks);
        fabAddTask = findViewById(R.id.fabAddTask);

        // Setup RecyclerView
        rvTasks.setLayoutManager(new LinearLayoutManager(this));
        // Adapter setup will go here (if tasks exist)

        // FloatingActionButton Click Listener
        fabAddTask.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Add Task Clicked", Toast.LENGTH_SHORT).show();
            // Code to add a new task will go here
        });
    }
}
