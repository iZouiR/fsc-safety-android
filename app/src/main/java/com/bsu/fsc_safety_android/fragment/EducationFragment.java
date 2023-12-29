package com.bsu.fsc_safety_android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bsu.fsc_safety_android.R;

public class EducationFragment extends Fragment {
    private View root;
    private RecyclerView modulesRecycler;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_education, container, false);
        initViews();
        fillModulesRecycler();
        return root;
    }

    private void initViews() {
        modulesRecycler = root.findViewById(R.id.modules_recycler);
    }

    private void fillModulesRecycler() {
    }
}
