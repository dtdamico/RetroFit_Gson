package com.example.retrofitgson;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ContactHolder extends RecyclerView.ViewHolder {

    public CardView cardContact;
    public TextView txtName;
    public TextView txtEmail;
    public ImageView imgContact;

    public ContactHolder(View itemView) {
        super(itemView);
        cardContact = (CardView) itemView.findViewById(R.id.cardContact);
        txtName = (TextView) itemView.findViewById(R.id.txtName);
        txtEmail = (TextView) itemView.findViewById(R.id.txtEmail);
        imgContact = (ImageView) itemView.findViewById(R.id.imgContact);
    }
}