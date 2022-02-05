package com.elprog.momentumtask.presentation.viewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.elprog.momentumtask.Utils.SingleMutableLiveData;
import com.elprog.momentumtask.data.repositories.FunctionsRepo;
import com.elprog.momentumtask.domain.model.RequestBodyData.body;
import com.elprog.momentumtask.domain.model.nutritionalInformation.NutritionalInfoResponse;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class FunctionsViewModel extends ViewModel {
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    FunctionsRepo functionsRepo;
    SingleMutableLiveData<NutritionalInfoResponse> nutritionalInfoResponseSingleMutableLiveData;

    public FunctionsViewModel() {
        functionsRepo = new FunctionsRepo();
        nutritionalInfoResponseSingleMutableLiveData=new SingleMutableLiveData<>();
    }

    public LiveData<NutritionalInfoResponse>  requestNutritionalInformation(String app_id,
                                                                            String app_key,
                                                                            body body
    ) {
        Single<NutritionalInfoResponse> single = functionsRepo.requestNutritionalInformation(app_id, app_key, body);
        compositeDisposable.add(single.subscribe(o -> nutritionalInfoResponseSingleMutableLiveData.postValue(o)
                , e -> nutritionalInfoResponseSingleMutableLiveData.postValue(null)));
        return nutritionalInfoResponseSingleMutableLiveData;

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
            compositeDisposable.clear();
        }

    }
}
