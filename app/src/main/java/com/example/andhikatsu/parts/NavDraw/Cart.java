package com.example.andhikatsu.parts.NavDraw;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.andhikatsu.parts.Koneksi.Config;
import com.example.andhikatsu.parts.Koneksi.RequestHandler;
//import com.example.andhikatsu.parts.NavDraw.Detail.Detail;
import com.example.andhikatsu.parts.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


public class Cart extends FragmentActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);
        Button btn = (Button)findViewById(R.id.link) ;
        btn.setOnClickListener(this); {
        }}
    @Override
    public void onClick(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tvsmotor.co.id/parts-onlinev2/default.aspx"));
        startActivity(link);

    }
}

