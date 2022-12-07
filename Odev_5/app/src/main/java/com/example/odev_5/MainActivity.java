package com.example.odev_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.odev_5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
int deger1,deger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonAc.setOnClickListener(view -> {
            binding.sonuc.setText(" ");

        });
        binding.button0.setOnClickListener(view -> {



         binding.sonuc.setText(binding.sonuc.getText()+"0");

        });
        binding.button1.setOnClickListener(view -> {



            binding.sonuc.setText(binding.sonuc.getText()+"1");

        });
        binding.button2.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"2");

        });
        binding.button3.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"3");

        });
        binding.button4.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"4");

        });
        binding.button5.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"5");

        });
        binding.button6.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"6");

        });
        binding.button7.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"7");

        });

        binding.button8.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"8");

        });
        binding.button9.setOnClickListener(view -> {
            binding.sonuc.setText(binding.sonuc.getText()+"9");

        });
        binding.buttonArti.setOnClickListener(view -> {

            deger1 = Integer.parseInt(binding.sonuc.getText()+"");
            binding.sonuc.setText(null);

        });
        binding.buttonEsittir.setOnClickListener(view -> {


            deger2 = Integer.parseInt(binding.sonuc.getText()+"");

            binding.sonuc.setText(deger1+deger2+"");


        });

    }
}