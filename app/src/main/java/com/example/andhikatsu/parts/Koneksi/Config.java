package com.example.andhikatsu.parts.Koneksi;

/**
 * Created by andhikatsu on 8/13/2016.
 */
public class Config {

    //Alamat skrip untuk CRUD
    public static final String URL_TAMBAHBARANG ="http://tvsop.hol.es/tambahbarang.php";
    public static final String URL_TAMPILKAN = "http://tvsop.hol.es/tampilkan.php";
    public static final String URL_TAMPILKANDETAIL = "http://tvsop.hol.es/tampilkandetail.php";
    public static final String URL_INVOICE = "http://tvsop.hol.es/invoice.php";
    public static final String URL_UPDATEBARANG = "http://tvsop.hol.es/updatebarang.php";
    public static final String URL_HAPUSBARANG = "http://tvsop.hol.es/hapusbarang.php";
    public static final String URL_INSERT_SEMENTARA =   "http://tvsop.hol.es/insertsementara.php";
    public static final String LOGIN_URL =              "http://tvsop.hol.es/login.php";
    //public static final String LOGIN_URL = "http://192.168.137.1/konek/login.php";

    //Keys yang dikirim untuk request php script
    public static final String KEY_id = "id";
    public static final String KEY_nama = "nama";
    public static final String KEY_harga= "harga";
    public static final String KEY_stok = "stok";
    public static final String KEY_model = "model";

    public static final String KEY_namaLengkap = "namaLengkap";
    public static final String KEY_alamat = "alamat";
    public static final String KEY_EMAIL = "username";
    public static final String KEY_PASSWORD = "password";

    public static final String KEY_no = "no";
    public static final String KEY_tgl = "tgl";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_id = "id";
    public static final String TAG_nama = "nama";
    public static final String TAG_harga = "harga";
    public static final String TAG_stok = "stok";
    public static final String TAG_model = "model";
    public static final String TAG_tgl = "tgl";
    public static final String TAG_no = "no";


    public static final String TAG_namaLengkap = "namaLengkap";
    public static final String TAG_alamat = "alamat";

    //employee id to pass with intent
    public static final String EMP_id = "emp_id";
    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "username";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";
}

