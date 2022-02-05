package com.elprog.momentumtask.Utils;

import com.elprog.momentumtask.data.db.RestApiService;
import com.elprog.momentumtask.data.db.RetrofitInstance;

import java.io.Serializable;

//Make singleton from serialize and deserialize operation.
public class Singleton implements Serializable {
    private static volatile Singleton sSoleInstance;
    private RestApiService apiService;
    RetrofitInstance retrofitInstance;


    private Singleton() {
        //Prevent form the reflection api.
        if (sSoleInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Singleton getInstance() {
        if (sSoleInstance == null) { //if there is no instance available... create new one
            synchronized (Singleton.class) {
                if (sSoleInstance == null) sSoleInstance = new Singleton();

            }
        }

        return sSoleInstance;
    }


    public RestApiService getApiService() {
        retrofitInstance = new RetrofitInstance();
        apiService = retrofitInstance.getApiService();
        return apiService;
    }
}


