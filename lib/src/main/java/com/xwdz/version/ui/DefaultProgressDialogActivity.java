package com.xwdz.version.ui;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xwdz.version.R;

/**
 * 下载进度条
 */
public class DefaultProgressDialogActivity extends AbstractActivity {

    private static final int MAX = 100;

    private ProgressBar mProgressBar;
    private TextView mSizeNote;

    @Override
    public int getContentLayoutId() {
        return R.layout.quiet_version_activity_progress_layout;
    }

    @Override
    public void onViewCreated() {
        mProgressBar = findViewById(R.id.progressBar);
        mSizeNote = findViewById(R.id.percent);
    }

    @Override
    public void onUpdateProgress(int percent, long currentLength, long total) {
        update(percent, percent + "/" + 100);
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, DefaultProgressDialogActivity.class);
        starter.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(starter);
    }

    public void update(int percent, String text) {
        mProgressBar.setProgress(percent);
        mSizeNote.setText(text);

        if (percent == MAX) {
            finish();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return true;
    }

}
