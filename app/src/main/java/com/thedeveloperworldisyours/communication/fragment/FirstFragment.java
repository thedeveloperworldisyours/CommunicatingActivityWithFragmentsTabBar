package com.thedeveloperworldisyours.communication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thedeveloperworldisyours.communication.R;
import com.thedeveloperworldisyours.communication.interfaces.UpdateableFragmentListener;

public class FirstFragment extends Fragment implements UpdateableFragmentListener {

    TextView mTextView;

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        mTextView = (TextView) view.findViewById(R.id.fragment_first_text);
        return view;
    }

    //received from Adapter with our Listener
    @Override
    public void update(String string) {
        mTextView.setText(string);
    }
}
