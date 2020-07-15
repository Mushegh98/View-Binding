package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.test.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //mer classi anunov bindin karanq sarqenq ete build.gradle(app) um dnenq viewBinding{
    //        enabled = true
    //    }
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"GO",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,GoActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}