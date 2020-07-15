package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.test.myapplication.databinding.ActivityGoBinding;

public class GoActivity extends AppCompatActivity {

    ActivityGoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}