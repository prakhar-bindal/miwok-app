package com.example.android.miwok;

/**
 * Created by prakhar on 12/10/16.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mcontext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.category_numbers);
        }else if (position == 1){
            return mcontext.getString(R.string.category_family);
        } else  if(position ==2 ){
            return mcontext.getString(R.string.category_colors);
        } else {
            return mcontext.getString(R.string.category_phrases);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyMembersFragment();
        } else  if(position ==2 ){
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
