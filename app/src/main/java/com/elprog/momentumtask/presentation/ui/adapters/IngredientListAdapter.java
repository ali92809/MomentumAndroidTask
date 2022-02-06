package com.elprog.momentumtask.presentation.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elprog.momentumtask.R;
import com.elprog.momentumtask.databinding.ItemContentBinding;
import com.elprog.momentumtask.domain.model.nutritionalInformation.Ingredient;
import com.elprog.momentumtask.domain.model.nutritionalInformation.Parsed;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class IngredientListAdapter extends RecyclerView.Adapter<IngredientListAdapter.IngredientListViewHolder> {

    List<Ingredient> ingredientList;
    Context mContext;

    public IngredientListAdapter() {
        ingredientList = new ArrayList<>();

    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public IngredientListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        ItemContentBinding itemContentBinding = ItemContentBinding.inflate(LayoutInflater.from(mContext), parent, false);
        IngredientListViewHolder IngredientListViewHolder = new IngredientListViewHolder(itemContentBinding);
        return IngredientListViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull IngredientListViewHolder holder, int position) {
        Ingredient ingredient = ingredientList.get(position);
        if (ingredient.getParsed()!=null) {
            holder.binding.qty.setText(String.format(" %.0f", ingredient.getParsed().get(0).getQuantity()));
            holder.binding.Unit.setText(String.valueOf(ingredient.getParsed().get(0).getMeasure()));
            holder.binding.Food.setText(String.valueOf(ingredient.getParsed().get(0).getFoodMatch()));
            holder.binding.Calories.setText(String.format(" %.1f", ingredient.getParsed().get(0).getNutrients().getENERC_KCAL().getQuantity()) +
                    ingredient.getParsed().get(0).getNutrients().getENERC_KCAL().getUnit());
            holder.binding.Weight.setText(String.format(" %.0f", ingredient.getParsed().get(0).getWeight()) +
                    " g");
        }

    }

    @Override
    public int getItemCount() {
        return ingredientList.size();
    }

    public class IngredientListViewHolder extends RecyclerView.ViewHolder {
        ItemContentBinding binding;

        public IngredientListViewHolder(@NonNull ItemContentBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
