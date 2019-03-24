package com.example.git_users.api_handler;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitApiInterface {

    @GET("/users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);

    // Another endpoints...
}
