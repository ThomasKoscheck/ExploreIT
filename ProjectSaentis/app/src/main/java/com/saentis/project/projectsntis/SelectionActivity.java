package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import java.util.ArrayList;

import io.realm.Realm;

public class SelectionActivity extends AppCompatActivity {
    EditText ioOne, ioTwo, ioThree, ioFour;
    AutoCompleteTextView autoCompleteTextView1, autoCompleteTextView2, autoCompleteTextView3, autoCompleteTextView4;
    public static ArrayList<String>zutaten =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        zutaten.add("Kartoffeln");
        zutaten.add("Zwiebeln");
        zutaten.add("Tomaten");
        zutaten.add("Käse");
        zutaten.add("Gnocchi");
        zutaten.add("Schlagsahne");
        zutaten.add("Milch");
        zutaten.add("Zitrone");
        zutaten.add("Rucola");
        zutaten.add("Nudeln");
        zutaten.add("Knoblauch");
        zutaten.add("Speck");
        zutaten.add("Eier");
        zutaten.add("Butter");
        zutaten.add("Puddingpulver");
        zutaten.add("Schokolade");
        zutaten.add("Kekse");
        zutaten.add("Hackfleisch");
        zutaten.add("Champingnons");
        zutaten.add("Paprika");

        Realm.init(this);

        final Realm realm = Realm.getDefaultInstance();

        autoCompleteTextView1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        autoCompleteTextView2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        autoCompleteTextView3 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
        autoCompleteTextView4 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, zutaten);
        autoCompleteTextView1.setAdapter(adapter);
        autoCompleteTextView2.setAdapter(adapter);
        autoCompleteTextView3.setAdapter(adapter);
        autoCompleteTextView4.setAdapter(adapter);
        ioOne = (EditText) findViewById(R.id.autoCompleteTextView1);
        ioTwo = (EditText) findViewById(R.id.autoCompleteTextView2);
        ioThree = (EditText) findViewById(R.id.autoCompleteTextView3);
        ioFour = (EditText) findViewById(R.id.autoCompleteTextView4);
    }

    public static final String INPUT_INGREDIENT1 = "ProjectSaentis.INPUT_INGREDIENT1";
    public static final String INPUT_INGREDIENT2 = "ProjectSaentis.INPUT_INGREDIENT2";
    public static final String INPUT_INGREDIENT3 = "ProjectSaentis.INPUT_INGREDIENT3";
    public static final String INPUT_INGREDIENT4 = "ProjectSaentis.INPUT_INGREDIENT4";
    public static final String INPUT_INGREDIENT5 = "ProjectSaentis.INPUT_INGREDIENT5";
    public static final String INPUT_INGREDIENT6 = "ProjectSaentis.INPUT_INGREDIENT6";
    public static final String INPUT_INGREDIENT7 = "ProjectSaentis.INPUT_INGREDIENT7";
    public static final String INPUT_INGREDIENT8 = "ProjectSaentis.INPUT_INGREDIENT8";

    String inputOne, inputTwo, inputThree, inputFour, inputFive, inputSix, inputSeven, inputEight;

    public void goToOut(View view)  {
        Intent intent = new Intent(this, OutputActivity.class);
        inputOne = ioOne.getText().toString();
        inputTwo = ioTwo.getText().toString();
        inputThree = ioThree.getText().toString();
        inputFour = ioFour.getText().toString();
        intent.putExtra(INPUT_INGREDIENT1, inputOne);
        intent.putExtra(INPUT_INGREDIENT2, inputTwo);               // theoretisch: in for-Scheife packen, INGREDIENT durch i ersetzen, mmittels i.toString()  sollte doch funktionieren?!
        intent.putExtra(INPUT_INGREDIENT3, inputThree);
        intent.putExtra(INPUT_INGREDIENT4, inputFour);
//        intent.putExtra(INPUT_INGREDIENT5, inputFive);
//        intent.putExtra(INPUT_INGREDIENT6, inputSix);               // theoretisch: in for-Scheife packen, INGREDIENT durch i ersetzen, mmittels i.toString()  sollte doch funktionieren?!
//
//        intent.putExtra(INPUT_INGREDIENT7, inputSeven);
//        intent.putExtra(INPUT_INGREDIENT8, inputEight);
        startActivity(intent);
    }
}
