package com.elprog.momentumtask.data.db;

import com.elprog.momentumtask.domain.model.RequestBodyData.body;

import io.reactivex.rxjava3.core.Single;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import com.elprog.momentumtask.domain.model.nutritionalInformation.NutritionalInfoResponse;
import com.google.gson.JsonObject;

import java.util.Map;

public interface RestApiService {



    @POST("nutrition-details")
    Single<NutritionalInfoResponse> requestNutritionalInformation(@Query("app_id") String app_id,
                                                                  @Query("app_key") String app_key,
                                                                  @Body body body
                                                                  );
}