package be.ugent.oomt.labo02;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends ListFragment {

    private static final String CURRENT_POSITION = "currPos";

    private int currPos = -1;


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("Lifecycle", "MainFragment.onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Lifecycle", "MainFragment.onCreate()");
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        showDetails(position);
    }

    private void showDetails(int index) {
        this.currPos = index;


        if (getActivity().findViewById(R.id.container) != null && getActivity().findViewById(R.id.container).getVisibility() == View.VISIBLE) {
            getListView().setItemChecked(index, true);
            Log.i("MainFragment", "Index: " + index);

            DetailFragment df = (DetailFragment) getFragmentManager().findFragmentById(R.id.container);
            if (df == null || df.getCurrIndex() != currPos) {
                df = new DetailFragment();
                df.setCurrIndex(currPos);
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, df)
                        .commit();
            }
        } else {
            Intent i = new Intent(getActivity(), DetailActivity.class);
            i.putExtra(DetailFragment.INDEX, index);
            startActivity(i);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Lifecycle", "MainFragment.onActivityCreated()");
        ArrayAdapter<String> aa = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_activated_1, getResources().getStringArray(R.array.superheroes_names));
        setListAdapter(aa);
        if (savedInstanceState != null) {
            currPos = savedInstanceState.getInt(CURRENT_POSITION, 0);
        }
        View details = getActivity().findViewById(R.id.container);
        if (details != null && details.getVisibility() == View.VISIBLE) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            showDetails(currPos);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Lifecycle", "MainFragment.onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Lifecycle", "MainFragment.onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Lifecycle", "MainFragment.onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Lifecycle", "MainFragment.onStop()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(CURRENT_POSITION, currPos);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Lifecycle", "MainFragment.onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "MainFragment.onDestroy()");
    }

}
