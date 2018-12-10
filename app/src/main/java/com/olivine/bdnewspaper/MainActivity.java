package com.olivine.bdnewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ProthomAloClicked(View view) {
        Intent intent = new Intent(this, NewsPaper.class);
        intent.putExtra("url", "https://m.prothomalo.com/");
        startActivity(intent);
    }

    public void BangladeshPratidinClicked(View view) {
        Intent intent = new Intent(this, NewsPaper.class);
        intent.putExtra("url", "http://www.bd-pratidin.com/");
        startActivity(intent);
    }

    public void NayaDigantaClicked(View view) {
        Intent intent = new Intent(this, NewsPaper.class);
        intent.putExtra("url", "http://m.dailynayadiganta.com/");
        startActivity(intent);
    }

    public void BbcBanglaClicked(View view) {
        Intent intent = new Intent(this, NewsPaper.class);
        intent.putExtra("url", "https://m.bbc.com/bengali");
        startActivity(intent);
    }

    public void DhakaTribuneClicked(View view) {
        Intent intent = new Intent(this, NewsPaper.class);
        intent.putExtra("url", "https://www.dhakatribune.com");
        startActivity(intent);
    }

    public void KalerKanthoClicked(View view) {
        Intent intent = new Intent(this, NewsPaper.class);
        intent.putExtra("url", "https://www.kalerkantho.com");
        startActivity(intent);
    }
}
