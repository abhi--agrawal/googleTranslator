package homemadesolutions.practice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LanguageNumberFragment extends Fragment {


    public LanguageNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_language_words, container, false);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Ondu", "One", R.drawable.number_one));
        words.add(new LanguageWord("Eraḍu", "two", R.drawable.number_two));
        words.add(new LanguageWord("Mūru", "three", R.drawable.number_three));
        words.add(new LanguageWord("Nālku", "four", R.drawable.number_four));
        words.add(new LanguageWord("Aidu", "five", R.drawable.number_five));
        words.add(new LanguageWord("Āru", "six", R.drawable.number_six));
        words.add(new LanguageWord("Ēḷu", "seven", R.drawable.number_seven));
        words.add(new LanguageWord("Eṇṭu", "eight", R.drawable.number_eight));
        words.add(new LanguageWord("Ombattu", "nine", R.drawable.number_nine));
        words.add(new LanguageWord("Hattu", "ten", R.drawable.number_ten));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(getActivity(), words, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
