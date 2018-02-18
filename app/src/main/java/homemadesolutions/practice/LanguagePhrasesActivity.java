package homemadesolutions.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguagePhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_words);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Nīvu ellige hōguttiddīrā?","Where are you going?"));
        words.add(new LanguageWord("Ninna hesarēnu?","What is your name?"));
        words.add(new LanguageWord("Nanna hesaru","My name is "));
        words.add(new LanguageWord("Nīvu hēge bhāvisuttīri?","How are you feeling?"));
        words.add(new LanguageWord("Illi bā.","Come Here."));
        words.add(new LanguageWord("Hōgōṇa","Let's Go"));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);
    }
}
