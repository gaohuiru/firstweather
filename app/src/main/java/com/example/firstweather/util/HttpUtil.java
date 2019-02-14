package com.example.firstweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    //传入请求地址并注册一个回调来处理服务器的响应
    public static void SendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
