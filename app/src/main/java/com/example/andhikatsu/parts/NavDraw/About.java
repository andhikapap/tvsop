package com.example.andhikatsu.parts.NavDraw;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import android.widget.Button;

import com.example.andhikatsu.parts.R;

public class About extends FragmentActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button btn = (Button)findViewById(R.id.link) ;
        btn.setOnClickListener(this); {


    }
}

    @Override
    public void onClick(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tvsmotor.co.id/parts-onlinev2/default.aspx"));


    startActivity(link);

    }
}
