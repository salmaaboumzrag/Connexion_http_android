package com.example.connexion_http_android;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WorldClockApiInterface {
    @GET("{city}")
    Call<WorldTime> getTime(@Path("city") String city);

    @GET("paris")
    Call<WorldTime> getTimeParis();
}
