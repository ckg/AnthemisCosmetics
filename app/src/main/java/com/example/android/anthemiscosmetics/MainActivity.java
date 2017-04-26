package com.example.android.anthemiscosmetics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFullAddress(View view){
        Toast.makeText(this,getString(R.string.Company_Full_Address),Toast.LENGTH_SHORT).show();
    }

    public void showProducts(View view) {
        Toast.makeText(this, getString(R.string.ProductsList), Toast.LENGTH_SHORT).show();
    }
    public void showFacebookAddress(View view) {
        Toast.makeText(this, getString(R.string.Facebook), Toast.LENGTH_SHORT).show();
    }
}
