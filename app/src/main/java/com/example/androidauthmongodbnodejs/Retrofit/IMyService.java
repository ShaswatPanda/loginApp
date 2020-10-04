package com.example.androidauthmongodbnodejs.Retrofit;

import retrofit2.http.Field;
import retrofit2.http.POST;
import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;

public interface IMyService {

    @POST("register")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("email")String email,
                                    @Field("name") String name,
                                    @Field("password") String password);


    @POST("login")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("email")String email,
                                    @Field("password") String password);

}
