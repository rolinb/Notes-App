package com.example.android.shortnotes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.math_item, parent, false);
        }

        Formula currentFormula = getItem(position);

        TextView integralTextView = (TextView) listItemView.findViewById(R.id.integral);

        integralTextView.setText(currentFormula.getIntegral());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultValue);

        defaultTextView.setText(currentFormula.getDefaultFormula());

        TextView derivativeTextView = (TextView) listItemView.findViewById(R.id.derivative);

        derivativeTextView.setText(currentFormula.getDerivative());
        //derivativeTextView.setText("test");



        return listItemView;
    }

    public FormulaAdapter(Activity context, ArrayList<Formula> formulae){
        super(context, 0, formulae);
    }
}
