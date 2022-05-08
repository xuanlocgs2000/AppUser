package com.example.appuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.appuser.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {
    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        if (intent!= null){
            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String adress = intent.getStringExtra("adress");
            int imageid= intent.getIntExtra("imageid",R.drawable.av1);
            binding.nameProfile.setText(name);
            binding.phoneProfile.setText(phone);
            binding.adressProfile.setText(adress);
            binding.profileImage.setImageResource(imageid);



        }
    }
}