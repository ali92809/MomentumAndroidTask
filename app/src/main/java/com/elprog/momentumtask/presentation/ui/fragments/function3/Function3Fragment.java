package com.elprog.momentumtask.presentation.ui.fragments.function3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elprog.momentumtask.R;
import com.elprog.momentumtask.databinding.FragmentFunction2Binding;
import com.elprog.momentumtask.databinding.FragmentFunction3Binding;
import com.elprog.momentumtask.domain.model.nutritionalInformation.TotalDaily;
import com.elprog.momentumtask.domain.model.nutritionalInformation.TotalNutrients;
import com.elprog.momentumtask.domain.model.nutritionalInformation.TotalNutrientsKCal;


public class Function3Fragment extends Fragment {

    private static final String ARG_PARAM1 = "totalNutrientsKCal";
    private static final String ARG_PARAM2 = "totalDaily";
    private static final String ARG_PARAM3 = "totalNutrients";
    private TotalNutrientsKCal totalNutrientsKCal;
    private TotalDaily totalDaily;
    private TotalNutrients totalNutrients;
    private FragmentFunction3Binding binding;

    public Function3Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            totalNutrientsKCal = (TotalNutrientsKCal) getArguments().getSerializable(ARG_PARAM1);
            totalDaily = (TotalDaily) getArguments().getSerializable(ARG_PARAM2);
            totalNutrients = (TotalNutrients) getArguments().getSerializable(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFunction3Binding.inflate(inflater, container, false);
        updateUI();
        return binding.getRoot();
    }

    private void updateUI() {
        if (totalNutrientsKCal != null) {
            binding.calories.setText(String.format(" %.0f", totalNutrientsKCal.getENERC_KCAL().getQuantity()));
        }

        if (totalNutrients != null) {
            binding.totalFatg.setText(String.format(" %.1f", totalNutrients.getFAT().getQuantity()) + " " + " " +totalNutrients.getFAT().getUnit());
            binding.saturatedFatg.setText(String.format(" %.0f", totalNutrients.getFASAT().getQuantity()) + " " + totalNutrients.getFASAT().getUnit());
            binding.cholesterolg.setText(String.format(" %.0f", totalNutrients.getCHOLE().getQuantity()) + " " + totalNutrients.getCHOLE().getUnit());
            binding.sodiumg.setText(String.format(" %.0f", totalNutrients.getNA().getQuantity()) + " " + totalNutrients.getNA().getUnit());
            binding.totalCarbohydrateFatg.setText(String.format(" %.1f", totalNutrients.getCHOCDF().getQuantity()) + " " + totalNutrients.getCHOCDF().getUnit());
            binding.dietaryFiberg.setText(String.format(" %.1f", totalNutrients.getFIBTG().getQuantity()) + " " + totalNutrients.getFIBTG().getUnit());
            binding.totalSugarsg.setText(String.format(" %.1f", totalNutrients.getSUGAR().getQuantity()) + " " + totalNutrients.getFIBTG().getUnit());
            binding.includes.setText(totalNutrients.getSUGAR().getQuantity() > 0 ? getText(R.string.AddedSugars) : "-");
            binding.protein.setText(String.format(" %.1f", totalNutrients.getPROCNT().getQuantity()) + " " + totalNutrients.getPROCNT().getUnit());
            binding.vitaminDg.setText(String.format(" %.1f", totalNutrients.getVITD().getQuantity()) + " " + totalNutrients.getVITD().getUnit());
            binding.calciumg.setText(String.format(" %.1f", totalNutrients.getCA().getQuantity()) + " " + totalNutrients.getCA().getUnit());
            binding.Irong.setText(String.format(" %.1f", totalNutrients.getFE().getQuantity()) + " " + totalNutrients.getFE().getUnit());
            binding.potassiumg.setText(String.format(" %.1f", totalNutrients.getK().getQuantity()) + " " + totalNutrients.getK().getUnit());


        }

        if (totalDaily != null) {
            binding.totalFatPercentage.setText(String.format(" %.0f", totalDaily.getFAT().getQuantity()) + " " + totalDaily.getFAT().getUnit());
            binding.saturatedFatPercentage.setText(String.format(" %.0f", totalDaily.getFASAT().getQuantity()) + " " + totalDaily.getFASAT().getUnit());
            binding.cholesterolPercentage.setText(String.format(" %.0f", totalDaily.getCHOLE().getQuantity()) + " " + totalDaily.getCHOLE().getUnit());
            binding.sodiumPercentage.setText(String.format(" %.0f", totalDaily.getNA().getQuantity()) + " " + totalDaily.getNA().getUnit());
            binding.totalCarbohydratePercentage.setText(String.format(" %.0f", totalDaily.getCHOCDF().getQuantity()) + " " + totalDaily.getCHOCDF().getUnit());
            binding.dietaryFiberPercentage.setText(String.format(" %.0f", totalDaily.getFIBTG().getQuantity()) + " " + totalDaily.getFIBTG().getUnit());
            binding.proteinPercentage.setText(String.format(" %.0f", totalDaily.getPROCNT().getQuantity()) + " " + totalDaily.getPROCNT().getUnit());
            binding.vitaminDPercentage.setText(String.format(" %.0f", totalDaily.getVITD().getQuantity()) + " " + totalDaily.getVITD().getUnit());
            binding.calciumPercentage.setText(String.format(" %.0f", totalDaily.getCA().getQuantity()) + " " + totalDaily.getCA().getUnit());
            binding.IronPercentage.setText(String.format(" %.0f", totalDaily.getFE().getQuantity()) + " " + totalDaily.getFE().getUnit());
            binding.potassiumPercentage.setText(String.format(" %.0f", totalDaily.getK().getQuantity()) + " " + totalDaily.getK().getUnit());


        }
    }
}