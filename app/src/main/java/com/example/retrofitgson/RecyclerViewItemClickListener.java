package com.example.retrofitgson;

import android.view.View;

public interface RecyclerViewItemClickListener {
    void onClick(View view, int position);
    void onLongClick(View view, int position);
}