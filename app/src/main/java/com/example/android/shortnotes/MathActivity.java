package com.example.android.shortnotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by rolin on 1/9/2017.
 */

public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math_activity);


        ArrayList<Formula> formulae = new ArrayList<Formula>();


        formulae.add(new Formula("one Integral", "Tan(x)", "sec^2x"));
        formulae.add(new Formula("two Integral", "two default value", "two derivative"));
        formulae.add(new Formula("two Integral", "two default value", "two derivative"));
        formulae.add(new Formula("two Integral", "two default value", "two derivative"));
        formulae.add(new Formula("two Integral", "two default value", "two derivative"));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        FormulaAdapter adapter =
                new FormulaAdapter(this, formulae);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView gridView = (ListView) findViewById(R.id.grid);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        gridView.setAdapter(adapter);
    }

}
