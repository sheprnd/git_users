package com.example.git_users.api_handler;

import retrofit2.Call;

public class UserHandler implements GitApiInterface {
    @Override
    public Call<GithubUser> getUser(String username) {
        return null;
    }
}
