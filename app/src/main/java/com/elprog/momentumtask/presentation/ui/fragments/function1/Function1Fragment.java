package com.elprog.momentumtask.presentation.ui.fragments.function1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elprog.momentumtask.R;
import com.elprog.momentumtask.databinding.FragmentFunction1Binding;


public class Function1Fragment extends Fragment {

    private FragmentFunction1Binding binding;
    private String ingredientString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFunction1Binding.inflate(inflater, container, false);
        init();
        btnActions();
        return binding.getRoot();
    }

    private void init() {
        addWatcherToEditText();

    }

    private void btnActions() {
        binding.btnAnalyze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ingredientString = binding.editIngredient.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("ingredientString", ingredientString);
                Navigation.findNavController(getView()).navigate(R.id.action_function1Fragment_to_function2Fragmen, bundle);
            }
        });
        binding.btnNewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ingredientString = "";
                binding.editIngredient.setText("");
            }
        });
    }

    private void addWatcherToEditText() {
        binding.editIngredient.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (charSequence != null) {
                    if (!charSequence.toString().isEmpty()) {
                        enablebtnAnalyze();
                    } else {
                        disablebtnAnalyze();
                    }
                } else {
                    disablebtnAnalyze();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void enablebtnAnalyze() {
        binding.btnAnalyze.setEnabled(true);
        binding.btnAnalyze.setText(getString(R.string.analyze));
    }

    private void disablebtnAnalyze() {
        binding.btnAnalyze.setEnabled(false);
        binding.btnAnalyze.setText(getString(R.string.disable));
    }

}