package com.troll.rekky.troll;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Nivel1 extends ActionBarActivity {
    private ImageView vi1, vi2, vi3, vi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);

        vi1 = (ImageView) findViewById(R.id.image1);
        vi2 = (ImageView) findViewById(R.id.image2);
        vi3 = (ImageView) findViewById(R.id.image3);
        vi4 = (ImageView) findViewById(R.id.image4);
    }

    public void cambiaImg1(View v){

    }


}
