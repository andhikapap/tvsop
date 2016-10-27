package com.example.andhikatsu.parts;


        import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.os.Handler;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import com.example.andhikatsu.parts.Koneksi.Config;
        import com.example.andhikatsu.parts.NavDraw.About;
        import com.example.andhikatsu.parts.NavDraw.Cart;
        import com.example.andhikatsu.parts.NavDraw.List;
        import com.example.andhikatsu.parts.NavDraw.Profile;
        import com.example.andhikatsu.parts.Otentikasi.Login;
        //import com.example.andhikatsu.parts.Otentikasi.Logout;

        import static android.app.ProgressDialog.show;


public class Awal extends AppCompatActivity {

    private Button menu_profil,menu_list,menu_cart,menu_about;
    private Activity menuutama = this;
    private Boolean exit = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        menu_profil = (Button) findViewById(R.id.menu_profil);
        menu_list = (Button) findViewById(R.id.menu_list);

        menu_cart  = (Button) findViewById(R.id.menu_cart);

        menu_about  = (Button) findViewById(R.id.menu_about);


        SharedPreferences sharedPreferences = getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        String email = sharedPreferences.getString(Config.EMAIL_SHARED_PREF,"Not Available");

        //Showing the current logged in email to textview


        menu_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama, Profile.class);
                startActivity(intent);
            }
        });
        menu_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama, List.class);
                startActivity(intent);
            }
        });

        menu_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama, Cart.class);
                startActivity(intent);
            }
        });



        menu_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuutama, About.class);
                startActivity(intent);
            }
        });

        //


        }




        @Override
    public void onBackPressed(){
        if (exit) {
            finish();
        }
        else Toast.makeText(this,"Tekan lagi untuk keluar",
                Toast.LENGTH_SHORT).show();
        exit =true;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                exit = false;

            }
        },3*1000);

    }
}

