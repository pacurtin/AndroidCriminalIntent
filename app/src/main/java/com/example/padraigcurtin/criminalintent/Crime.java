package com.example.padraigcurtin.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by padraig.curtin on 04/02/2017.
 */

public class Crime {
    private Date mDate;
    private boolean mSolved;
    private String mTitle;
    private UUID mId;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
