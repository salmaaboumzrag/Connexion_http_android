package com.example.connexion_http_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    // Trailing slash is needed
    public static final String BASE_URL = "https://worldtimeapi.org/api/timezone/Europe/";
    WorldClockApiInterface service;
    TextView tv;
    EditText eCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);
        eCity=findViewById(R.id.eCity);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(WorldClockApiInterface.class);

        /*Call<WorldTime> callTimeParis = service.getTimeParis();

        callTimeParis.enqueue(new Callback<WorldTime>() {
            @Override
            public void onResponse(Call<WorldTime> call, Response<WorldTime> response) {
                Log.d("onResponse",response.body().toString());
                //if (response.isSuccessful()) tv.setText(response.body().getDatetime().split("T")[1].substring(0,8));
            }

            @Override
            public void onFailure(Call<WorldTime> call, Throwable t) {
                Log.d("onFailure","pd call API");
            }
        });*/

    }


    public void callApi(View view) {

        Call<WorldTime> callTimeCity = service.getTime(eCity.getText().toString());

        callTimeCity.enqueue(new Callback<WorldTime>() {
            @Override
            public void onResponse(Call<WorldTime> call, Response<WorldTime> response) {
                if (response.isSuccessful()) {
                    Log.d("onResponse", response.body().toString());
                    tv.setText(response.body().getDatetime().split("T")[1].substring(0, 8));
                    //response.body().setDatetime("");
                }
                else
                    tv.setText("Invalid city name :/");

            }

            @Override
            public void onFailure(Call<WorldTime> call, Throwable t) {
                Log.d("onFailure","pd call API");
            }
        });
    }
}