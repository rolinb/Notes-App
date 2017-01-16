package com.example.android.shortnotes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rolin on 1/12/2017.
 */

public class FormulaAdapter extends ArrayAdapter<Formula> {
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.two_item_layout, parent, false);
        }


        Formula currentFormula = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.col_one_two_item);

        TextView derivativeTextView = (TextView) listItemView.findViewById(R.id.col_two_two_item);

        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.col_one_image_two_item);

        ImageView derivativeImageVIew = (ImageView) listItemView.findViewById(R.id.col_two_image_two_item);

        if(!currentFormula.hasImages()) {

            defaultTextView.setText(currentFormula.getIntegral());

            derivativeTextView.setText(currentFormula.getDefaultFormula());

            defaultImageView.setVisibility(View.GONE);

            derivativeImageVIew.setVisibility(View.GONE);

        }
        else {

            defaultImageView.setImageResource(currentFormula.getImageOne());
            defaultImageView.setVisibility(View.VISIBLE);
            derivativeImageVIew.setImageResource(currentFormula.getImageTwo());
            derivativeImageVIew.setVisibility(View.VISIBLE);
            defaultTextView.setVisibility(View.GONE);
            derivativeTextView.setVisibility(View.GONE);
        }



        return listItemView;
    }

    public FormulaAdapter(Activity context, ArrayList<Formula> formulae){
        super(context, 0, formulae);
    }
}
