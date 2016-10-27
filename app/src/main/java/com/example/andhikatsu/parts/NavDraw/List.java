package com.example.andhikatsu.parts.NavDraw;


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

public class List extends FragmentActivity{

    private ListView listView;

    private String JSON_STRING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.list_view);

        getJSON();
    }


    private void tampilkanbarang(){
        JSONObject jsonObject = null;
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);

            for(int i = 0; i<result.length(); i++){
                JSONObject jo = result.getJSONObject(i);
                String id = jo.getString(Config.TAG_id);
                String nama = jo.getString(Config.TAG_nama);
                String stok = jo.getString(Config.TAG_stok);
                String harga = jo.getString(Config.TAG_harga);


                HashMap<String,String> barangbarang = new HashMap<>();
                barangbarang.put(Config.TAG_id,id);
                barangbarang.put(Config.TAG_nama,nama);
                barangbarang.put(Config.TAG_stok,stok);
                barangbarang.put(Config.TAG_harga,harga);

                list.add(barangbarang);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListAdapter adapter = new SimpleAdapter(
                List.this, list, R.layout.activity_list_view_adapter,
                new String[]{Config.TAG_nama,Config.TAG_harga},
                new int[]{R.id.nama,  R.id.harga});

        listView.setAdapter(adapter);
    }

    private void getJSON(){
        class GetJSON extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(List.this,"Mengambil data","Mohon tunggu ...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                tampilkanbarang();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(Config.URL_TAMPILKAN);
                return s;
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }


}