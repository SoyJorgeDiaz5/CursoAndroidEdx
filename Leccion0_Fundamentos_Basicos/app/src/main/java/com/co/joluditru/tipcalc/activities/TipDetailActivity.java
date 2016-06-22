package com.co.joluditru.tipcalc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.co.joluditru.tipcalc.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TipDetailActivity extends AppCompatActivity {

    @BindView(R.id.lbl_bill_total)
    TextView lblBillTotal;
    @BindView(R.id.lbl_tip)
    TextView lblTip;
    @BindView(R.id.lbl_time_stamp)
    TextView lblTimeStamp;

    public final static String TIP_KEY = "tip";
    public final static String DATE_KEY = "timestamp";
    public final static String BILL_TOTAL_KEY = "total";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String strTotal = String.format(getString(R.string.tipdetail_message_bill),
                            intent.getDoubleExtra(BILL_TOTAL_KEY, 0d));
        String strTip = String.format(getString(R.string.global_message_tip),
                intent.getDoubleExtra(TIP_KEY, 0d));

        lblBillTotal.setText(strTotal);
        lblTip.setText(strTip);
        lblTimeStamp.setText(intent.getStringExtra(DATE_KEY));
    }
}
