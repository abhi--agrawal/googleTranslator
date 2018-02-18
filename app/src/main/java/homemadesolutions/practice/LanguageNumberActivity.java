package homemadesolutions.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_words);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Ondu","One",R.drawable.number_one));
        words.add(new LanguageWord("Eraḍu","two",R.drawable.number_two));
        words.add(new LanguageWord("Mūru","three",R.drawable.number_three));
        words.add(new LanguageWord("Nālku","four",R.drawable.number_four));
        words.add(new LanguageWord("Aidu","five",R.drawable.number_five));
        words.add(new LanguageWord("Āru","six",R.drawable.number_six));
        words.add(new LanguageWord("Ēḷu","seven",R.drawable.number_seven));
        words.add(new LanguageWord("Eṇṭu","eight",R.drawable.number_eight));
        words.add(new LanguageWord("Ombattu","nine",R.drawable.number_nine));
        words.add(new LanguageWord("Hattu","ten",R.drawable.number_ten));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);

    }
}
