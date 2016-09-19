package com.example.chris.loginregister2;

/**
 * Created by Chris on 31/08/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import static com.example.chris.loginregister2.R.id.textTitles;

public class ActivityUserProfile extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;

    public static final String LOGIN_URL = "http://37.139.17.25/UserDetails.php";

    public static final String KEY_USERNAME="username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        textView1 = (TextView) findViewById(R.id.textViewUsername);
        textView2 = (TextView) findViewById(textTitles);

        final Intent intent = getIntent();

//        ----------------------------------


//    private void userLogin() {
//        username = editTextUsername.getText().toString().trim();
//        password = editTextPassword.getText().toString().trim();

        // Instantiate the RequestQueue.
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, LOGIN_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        //do stuff here
//                        textView1.setText(intent.getStringExtra(LoginActivity.KEY_USERNAME));
                        textView2.setText(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    //public void onErrorResponse(VolleyError error) {
                        textView1.setText(intent.getStringExtra(LoginActivity.KEY_USERNAME));

//                        Log.d("errorgggg",error.toString());
                        //do stuff here
//                        Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();
//                        textView2.setText("Failed");
                        textView2.setText("Failed" + error.toString());

                    }
                }){

        };

// Add the request to the RequestQueue.
        requestQueue.add(stringRequest);
    }


}