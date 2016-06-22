package com.co.joluditru.tipcalc.fragments;

import com.co.joluditru.tipcalc.models.TipRecord;

/**
 * Created by joluditru on 21/06/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();

}
