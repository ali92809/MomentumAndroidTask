package com.elprog.momentumtask.data.repositories;

import android.util.Log;

import com.elprog.momentumtask.Utils.Singleton;
import com.elprog.momentumtask.domain.model.RequestBodyData.body;
import com.elprog.momentumtask.domain.model.nutritionalInformation.NutritionalInfoResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.RequestBody;

public class FunctionsRepo {



    public Single<NutritionalInfoResponse> requestNutritionalInformation(String app_id,
                                                                         String app_key,
                                                                         body body
    ) {

        return Singleton.getInstance()
                .getApiService().requestNutritionalInformation(app_id, app_key, body)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }



}
