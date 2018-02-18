package homemadesolutions.practice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by I320047 on 11-Feb-18.
 */
public class LanguageWordAdapter extends ArrayAdapter<LanguageWord> {

    private int backgroundColor;

    public LanguageWordAdapter(Context context, List<LanguageWord> objects, int backgroudColor) {
        super(context, 0, objects);
        this.backgroundColor = backgroudColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_language_simple_list_item, parent, false);
        }


        LinearLayout containerLayout = (LinearLayout) listItemView.findViewById(R.id.language_text_view_container);
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        containerLayout.setBackgroundColor(color);

        LanguageWord currentNumber = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.language_image_view);
        if(currentNumber.getIconResourceId() != -1){
            imageView.setImageResource(currentNumber.getIconResourceId());
        }else {
            imageView.setVisibility(View.GONE);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.language_text_view);
        nameTextView.setText(currentNumber.getTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        numberTextView.setText(currentNumber.getWord());

        return listItemView;
    }
}
