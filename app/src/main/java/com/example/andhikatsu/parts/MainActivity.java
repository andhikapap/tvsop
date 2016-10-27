package com.example.andhikatsu.parts;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.NavigationView;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Toast;
        import android.util.Log;

        import com.example.andhikatsu.parts.NavDraw.About;
        import com.example.andhikatsu.parts.NavDraw.Cart;
        import com.example.andhikatsu.parts.NavDraw.List;
        import com.example.andhikatsu.parts.NavDraw.Profile;
        //import com.example.andhikatsu.parts.Otentikasi.Logout;

public class MainActivity extends AppCompatActivity {
    //Mendefinisikan variabel
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private Boolean exit = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Menginisiasi Toolbar dan mensetting sebagai actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Menginisiasi  NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        //Mengatur Navigasi View Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Menutup  drawer item klik
                drawerLayout.closeDrawers();

                Log.d("main_activity_log","menuItem.getItemId : "+menuItem.getItemId());
                //Memeriksa untuk meliokhat item yang akan dilklik dan melalukan aksi
                switch (menuItem.getItemId()){
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity
                    case R.string.navigation_view_item_1:
                        Intent a = new Intent(getApplicationContext(),Profile.class);
                        startActivity(a);

                        return true;
                    case R.string.navigation_view_item_2:
                        Intent b = new Intent(getApplicationContext(),List.class);
                        startActivity(b);
                        return true;

                    case R.string.navigation_view_item_4:
                        Intent d = new Intent(getApplicationContext(),Cart.class);
                        startActivity(d);
                        return true;
                    case R.drawable.ic_logout:
                        //Intent e = new Intent(MainActivity.this, Logout.class);
                        //startActivity(e);
                        return true;
                    case R.string.navigation_view_item_5:

                        Intent f = new Intent(MainActivity.this, About.class);
                        startActivity(f);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(),"Kesalahan Terjadi ",Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        // Menginisasi Drawer Layout dan ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open, R.string.drawer_close){
            @Override
            public void onDrawerClosed(View drawerView) {
                // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
                super.onDrawerOpened(drawerView);
            }
        };
        //Mensetting actionbarToggle untuk drawer layout
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        //memanggil synstate
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed(){

            finish();


    }
}