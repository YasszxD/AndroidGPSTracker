package com.example.models;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Bluetooth extends androidx.fragment.app.Fragment{
    int d;
    public Bluetooth(int contentLayoutId) {
        super(contentLayoutId);
        this.d=contentLayoutId;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(d, container, false);
        return v;
    }
}
