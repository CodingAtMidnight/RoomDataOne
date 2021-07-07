package com.example.roomdataone.activities.ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.roomdataone.R;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_ADD_USER = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView addUser = findViewById(R.id.addUser);
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(
                        new Intent(getApplicationContext(), CreateUserActivity.class),
                        REQUEST_CODE_ADD_USER
                );
            }
        });
    }
}