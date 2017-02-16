package com.example.padraigcurtin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by padraig.curtin on 14/02/2017.
 */

public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
