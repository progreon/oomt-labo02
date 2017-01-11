package be.ugent.oomt.labo02;


import android.os.Bundle;
//import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public static String INDEX = "index";


    public DetailFragment() {
        // Required empty public constructor
    }

    public int getCurrIndex() {
        return getArguments().getInt(INDEX, 0);
    }

    public void setCurrIndex(int index) {
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
        getArguments().putInt(INDEX, index);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Lifecycle", "DetailFragment.onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Lifecycle", "DetailFragment.onCreateView()");
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        String[] names = getResources().getStringArray(R.array.superheroes_names);
        String[] histories = getResources().getStringArray(R.array.superheroes_history);
        int index = getCurrIndex();
        if (index >= 0 && index < names.length) {
            TextView tvName = (TextView) view.findViewById(R.id.name);
            TextView tvHistory = (TextView) view.findViewById(R.id.history);
            tvName.setText(names[index]);
            tvHistory.setText(histories[index]);
        }

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Lifecycle", "DetailFragment.onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Lifecycle", "DetailFragment.onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Lifecycle", "DetailFragment.onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Lifecycle", "DetailFragment.onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Lifecycle", "DetailFragment.onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "DetailFragment.onDestroy()");
    }

}
