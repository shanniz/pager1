package com.example.shan.pager1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TaskFragment extends Fragment {

    private TextView mTextViewId, mTextViewDesc;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_task, container, false);

        Bundle bundle = this.getArguments();
        mTextViewId = view.findViewById(R.id.textViewTaskId);
        mTextViewDesc = view.findViewById(R.id.textViewDesc);
        mTextViewId.setText( String.valueOf(bundle.getInt("tid")) );
        mTextViewDesc.setText( bundle.getString("tdesc") );

        return view;
    }

}
