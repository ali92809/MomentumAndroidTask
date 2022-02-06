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

    private static final String ARG_PARAM2 = "totalDaily";
    private static final String ARG_PARAM3 = "totalNutrients";
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

        if (totalNutrients != null) {
            if (totalNutrients.getENERC_KCAL() != null) {
                binding.calories.setText(String.format(" %.0f", totalNutrients.getENERC_KCAL().getQuantity()));
            }
            if (totalNutrients.getFAT() != null) {

                binding.totalFatg.setText(String.format(" %.1f", totalNutrients.getFAT().getQuantity()) + " " + " " + totalNutrients.getFAT().getUnit());
                if (totalNutrients.getFASAT() != null) {
                    binding.saturatedFatg.setText(String.format(" %.0f", totalNutrients.getFASAT().getQuantity()) + " " + totalNutrients.getFASAT().getUnit());
                }
                if (totalNutrients.getCHOLE() != null) {
                    binding.cholesterolg.setText(String.format(" %.0f", totalNutrients.getCHOLE().getQuantity()) + " " + totalNutrients.getCHOLE().getUnit());
                }
                if (totalNutrients.getNA() != null) {
                    binding.sodiumg.setText(String.format(" %.0f", totalNutrients.getNA().getQuantity()) + " " + totalNutrients.getNA().getUnit());
                }
                if (totalNutrients.getCHOCDF() != null) {
                    binding.totalCarbohydrateFatg.setText(String.format(" %.1f", totalNutrients.getCHOCDF().getQuantity()) + " " + totalNutrients.getCHOCDF().getUnit());
                }
                if (totalNutrients.getFIBTG() != null) {
                    binding.dietaryFiberg.setText(String.format(" %.1f", totalNutrients.getFIBTG().getQuantity()) + " " + totalNutrients.getFIBTG().getUnit());
                }
                if (totalNutrients.getSUGAR() != null) {
                    binding.totalSugarsg.setText(String.format(" %.1f", totalNutrients.getSUGAR().getQuantity()) + " " + totalNutrients.getFIBTG().getUnit());
                }
                if (totalNutrients.getSUGAR() != null) {
                    binding.includes.setText(totalNutrients.getSUGAR().getQuantity() > 0 ? getText(R.string.AddedSugars) : "-");
                }
                if (totalNutrients.getPROCNT() != null) {
                    binding.protein.setText(String.format(" %.1f", totalNutrients.getPROCNT().getQuantity()) + " " + totalNutrients.getPROCNT().getUnit());
                }
                if (totalNutrients.getVITD() != null) {
                    binding.vitaminDg.setText(String.format(" %.1f", totalNutrients.getVITD().getQuantity()) + " " + totalNutrients.getVITD().getUnit());
                }
                if (totalNutrients.getCA() != null) {
                    binding.calciumg.setText(String.format(" %.1f", totalNutrients.getCA().getQuantity()) + " " + totalNutrients.getCA().getUnit());
                }
                if (totalNutrients.getFE() != null) {
                    binding.Irong.setText(String.format(" %.1f", totalNutrients.getFE().getQuantity()) + " " + totalNutrients.getFE().getUnit());
                }
                if (totalNutrients.getK() != null) {
                    binding.potassiumg.setText(String.format(" %.1f", totalNutrients.getK().getQuantity()) + " " + totalNutrients.getK().getUnit());

                }
            }

            if (totalDaily != null) {
                if (totalNutrients.getFAT() != null) {
                    binding.totalFatPercentage.setText(String.format(" %.0f", totalDaily.getFAT().getQuantity()) + " " + totalDaily.getFAT().getUnit());
                }
                if (totalNutrients.getFASAT() != null) {
                    binding.saturatedFatPercentage.setText(String.format(" %.0f", totalDaily.getFASAT().getQuantity()) + " " + totalDaily.getFASAT().getUnit());
                }
                if (totalNutrients.getCHOLE() != null) {
                    binding.cholesterolPercentage.setText(String.format(" %.0f", totalDaily.getCHOLE().getQuantity()) + " " + totalDaily.getCHOLE().getUnit());
                }
                if (totalNutrients.getNA() != null) {
                    binding.sodiumPercentage.setText(String.format(" %.0f", totalDaily.getNA().getQuantity()) + " " + totalDaily.getNA().getUnit());
                }
                if (totalNutrients.getCHOCDF() != null) {
                    binding.totalCarbohydratePercentage.setText(String.format(" %.0f", totalDaily.getCHOCDF().getQuantity()) + " " + totalDaily.getCHOCDF().getUnit());
                }
                if (totalNutrients.getFIBTG() != null) {
                    binding.dietaryFiberPercentage.setText(String.format(" %.0f", totalDaily.getFIBTG().getQuantity()) + " " + totalDaily.getFIBTG().getUnit());
                }
                if (totalNutrients.getPROCNT() != null) {
                    binding.proteinPercentage.setText(String.format(" %.0f", totalDaily.getPROCNT().getQuantity()) + " " + totalDaily.getPROCNT().getUnit());
                }
                if (totalNutrients.getVITD() != null) {
                    binding.vitaminDPercentage.setText(String.format(" %.0f", totalDaily.getVITD().getQuantity()) + " " + totalDaily.getVITD().getUnit());
                }
                if (totalNutrients.getCA() != null) {
                    binding.calciumPercentage.setText(String.format(" %.0f", totalDaily.getCA().getQuantity()) + " " + totalDaily.getCA().getUnit());
                }
                if (totalNutrients.getFE() != null) {
                    binding.IronPercentage.setText(String.format(" %.0f", totalDaily.getFE().getQuantity()) + " " + totalDaily.getFE().getUnit());
                }
                if (totalNutrients.getK() != null) {
                    binding.potassiumPercentage.setText(String.format(" %.0f", totalDaily.getK().getQuantity()) + " " + totalDaily.getK().getUnit());
                }
            }

        }
    }
}