package com.thedeveloperworldisyours.communication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thedeveloperworldisyours.communication.R;
import com.thedeveloperworldisyours.communication.interfaces.UpdateableFragmentListener;


public class SecondFragment extends Fragment implements UpdateableFragmentListener {

    TextView mTextView;

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
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
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        mTextView = (TextView) view.findViewById(R.id.fragment_second_text);
        return view;
    }

    @Override
    public void update(String string) {
        mTextView.setText(string);
    }
}
