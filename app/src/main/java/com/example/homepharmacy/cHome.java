package com.example.homepharmacy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class cHome extends AppCompatActivity {
    private DrawerLayout mDrawerLayout ;
    private ActionBarDrawerToggle mToggle;
    private Button button1, viewReport, visitStore;
    private Button prescrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);

        mDrawerLayout =(DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button1 = findViewById(R.id.button101);
        viewReport = findViewById(R.id.ViewReport);
        visitStore = findViewById(R.id.vistCart);
        prescrip = findViewById(R.id.daana);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cHome.this,cLogin.class));
                cPreferences.clearData(cHome.this);
                finish();
            }
        });

        viewReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AddPrescription.class);
                startActivity(intent);
            }
        });


        visitStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Intent intent = new Intent(getApplicationContext(),MedicingHome.class);
             //   startActivity(intent);
            }
        });




    }
        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}