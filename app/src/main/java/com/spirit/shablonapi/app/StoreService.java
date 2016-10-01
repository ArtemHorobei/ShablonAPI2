package com.spirit.shablonapi.app;

import com.spirit.shablonapi.model.Store;
import com.spirit.shablonapi.model.Tools;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StoreService {

    @GET("/stores") Call<List<Store>> getStores(@Query("q") String q, @Query("limit") int limit);

    @GET("/stores/{id}/instruments") Call<List<Tools>> getStoresTools(@Path("id") int id);

}
