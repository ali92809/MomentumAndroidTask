package com.elprog.momentumtask.presentation.ui.fragments.function2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.elprog.momentumtask.R;
import com.elprog.momentumtask.databinding.FragmentFunction2Binding;
import com.elprog.momentumtask.domain.model.RequestBodyData.body;
import com.elprog.momentumtask.domain.model.nutritionalInformation.NutritionalInfoResponse;
import com.elprog.momentumtask.presentation.ui.adapters.IngredientListAdapter;
import com.elprog.momentumtask.presentation.viewModels.FunctionsViewModel;

import java.util.Arrays;
import java.util.List;

public class Function2Fragmen extends Fragment {

    private static final String ARG_PARAM1 = "ingredientString";
    private String ingredientString;
    private FragmentFunction2Binding binding;
    private FunctionsViewModel functionsViewModel;
    private IngredientListAdapter ingredientListAdapter;
    private NutritionalInfoResponse nutritionalInfoResponse;

    public Function2Fragmen() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //ingredient list that entered in function 1
            ingredientString = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFunction2Binding.inflate(inflater, container, false);
        functionsViewModel = new ViewModelProvider(this).get(FunctionsViewModel.class);

        init();
        btnActions();
        return binding.getRoot();
    }

    private void init() {
        ingredientListAdapter = new IngredientListAdapter();
        binding.recyclerParsedData.setAdapter(ingredientListAdapter);
        /***
         * app_id and app_key you can get from
         *    https://developer.edamam.com/edamam-nutrition-api
         * */
        //convert string to array list
        List<String> ingredientList = Arrays.asList(ingredientString.split(","));
        body body = new body(ingredientList);
        requestNutritionalInformation(
                "10e14143",
                "f4aa717b0f6f781c2c9e65d482a5ca15",
                body);
    }


    private void btnActions() {
        binding.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nutritionalInfoResponse != null) {
                    if (nutritionalInfoResponse.getTotalNutrientsKCal() != null) {
                        goToFunction3();
                    } else {
                        Toast.makeText(getContext(), getText(R.string.We_cannot_calculate), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), getText(R.string.We_cannot_calculate), Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    /**
     * i will pass
     * totalNutrientsKCal
     * totalDaily
     * totalNutrients
     * to bundel so i put implements Serializable
     * also i can put implements Parcelable
     * <p>
     * to pass data to function 3
     */
    private void goToFunction3() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("totalNutrientsKCal", nutritionalInfoResponse.getTotalNutrientsKCal());
        bundle.putSerializable("totalDaily", nutritionalInfoResponse.getTotalDaily());
        bundle.putSerializable("totalNutrients", nutritionalInfoResponse.getTotalNutrients());
        Navigation.findNavController(getView()).navigate(R.id.action_function2Fragmen_to_function3Fragment, bundle);
    }

    private void requestNutritionalInformation(String app_id,
                                               String app_key,
                                               body body
    ) {
        binding.progress.setVisibility(View.VISIBLE);
        functionsViewModel.requestNutritionalInformation(app_id, app_key, body)
                .observe(getViewLifecycleOwner(), new Observer<NutritionalInfoResponse>() {
                    @Override
                    public void onChanged(NutritionalInfoResponse nutritionalInfoResponse) {
                        binding.progress.setVisibility(View.GONE);
                        if (nutritionalInfoResponse != null) {
                            Function2Fragmen.this.nutritionalInfoResponse = nutritionalInfoResponse;
                            if (nutritionalInfoResponse.getIngredients() != null) {
                               ingredientListAdapter.setIngredientList(nutritionalInfoResponse
                                        .getIngredients());
                            }
                        }

                    }
                });
    }

}