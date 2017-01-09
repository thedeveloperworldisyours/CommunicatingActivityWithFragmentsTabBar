package com.thedeveloperworldisyours.communication.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.communication.R;
import com.thedeveloperworldisyours.communication.adapter.TabsAdapter;

public class ManagerFragment extends Fragment {

    private ViewPager mViewPager;
    private TabsAdapter mAdapter;

    public ManagerFragment() {
        // Required empty public constructor
    }

    public static ManagerFragment newInstance() {
        ManagerFragment fragment = new ManagerFragment();
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
        View view = inflater.inflate(R.layout.fragment_manager, container, false);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.fragment_manager_tab_bar_tab_layout);
        mViewPager = (ViewPager) view.findViewById(R.id.fragment_manager_tab_bar_pager);

        mAdapter = new TabsAdapter(getFragmentManager(), getActivity());

        mViewPager.setAdapter(mAdapter);
        tabLayout.setupWithViewPager(mViewPager);

        return view;
    }

    public void update(String string){
        mAdapter.update(string);
    }

}
