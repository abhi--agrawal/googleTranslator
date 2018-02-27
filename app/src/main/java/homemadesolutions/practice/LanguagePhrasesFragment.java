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
public class LanguagePhrasesFragment extends Fragment {


    public LanguagePhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_language_words, container, false);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Nīvu ellige hōguttiddīrā?", "Where are you going?"));
        words.add(new LanguageWord("Ninna hesarēnu?", "What is your name?"));
        words.add(new LanguageWord("Nanna hesaru", "My name is "));
        words.add(new LanguageWord("Nīvu hēge bhāvisuttīri?", "How are you feeling?"));
        words.add(new LanguageWord("Illi bā.", "Come Here."));
        words.add(new LanguageWord("Hōgōṇa", "Let's Go"));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(getActivity(), words, R.color.category_phrases);

        ListView listView = (ListView) rootView.findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
