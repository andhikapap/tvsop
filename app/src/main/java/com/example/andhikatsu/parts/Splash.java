package com.example.andhikatsu.parts;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import android.content.Intent;
        import android.os.Handler;
        import android.view.Window;
        import android.view.WindowManager;

        import com.example.andhikatsu.parts.Otentikasi.Login;



//Created by Fathur (okedroid.com)
public class Splash extends AppCompatActivity {

    //Set waktu lama splashscreen
    private static int splashInterval = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };

}