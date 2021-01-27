package com.example.quizbay.builder;

import com.example.quizbay.model.UserRegisterResponse;
import com.example.quizbay.model.LoginSendCommonDTO;
import com.example.quizbay.model.UserRegisterEntity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IApiInterface {

    @POST("/user/authenticate")
    Call<UserRegisterResponse> loginUser(@Body LoginSendCommonDTO loginSendCommonDTO);

    @POST("/user/save")
    Call<UserRegisterResponse> register(@Body UserRegisterEntity userRegisterEntity);

    @POST("/user/appendNotification/{channelId}/{userId}")
    Call<ResponseBody> appendNotification(@Path("channelId") int channelId, @Path("userId") String userId, @Body String notificationToken);
}
