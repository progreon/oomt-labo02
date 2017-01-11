package be.ugent.oomt.labo02;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        Log.i("Lifecycle", "MainFragment.onCreateView()");
        return textView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Lifecycle", "MainFragment.onActivityCreated()");
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
