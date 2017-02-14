package com.example.padraigcurtin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by padraig.curtin on 04/02/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }



}
