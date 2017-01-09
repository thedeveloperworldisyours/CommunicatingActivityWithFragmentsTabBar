package com.thedeveloperworldisyours.communication.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.thedeveloperworldisyours.communication.R;
import com.thedeveloperworldisyours.communication.fragment.FirstFragment;
import com.thedeveloperworldisyours.communication.fragment.SecondFragment;
import com.thedeveloperworldisyours.communication.interfaces.UpdateableFragmentListener;


/**
 * Created by javierg on 20/05/16.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {

    public static final int TOTAL_TABS = 2;
    public String mGeneralString;
    public Context mContext;

    public TabsAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment().newInstance();

            case 1:
                return new SecondFragment().newInstance();
        }
        return null;
    }

    //received from ManagerFragment
    public void update(String string) {
        mGeneralString = string;
        //updated
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        if (object instanceof UpdateableFragmentListener) {
            //sent to FirstFragment and SecondFragment
            ((UpdateableFragmentListener) object).update(mGeneralString);
        }
        return super.getItemPosition(object);
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.fragment_first_title);
            case 1:
                return mContext.getString(R.string.fragment_second_title);
            default:
                return mContext.getString(R.string.fragment_first_title);
        }
    }
}
