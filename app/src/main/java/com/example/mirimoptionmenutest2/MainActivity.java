package com.example.mirimoptionmenutest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDegree;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDegree = findViewById(R.id.edit_degree);
        img1 = findViewById(R.id.img1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_rotate:
                img1.setRotation(Float.parseFloat(editDegree.getText().toString()));
                return true;
            case R.id.item_puppy:
                img1.setImageResource(R.drawable.puppy);
                return true;
            case R.id.item_cat:
                img1.setImageResource(R.drawable.cat);
                return true;
            case R.id.item_rabbit:
                img1.setImageResource(R.drawable.rabbit);
                return true;
        }

        return false;
    }
}