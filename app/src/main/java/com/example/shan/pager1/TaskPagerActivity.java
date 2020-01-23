package com.example.shan.pager1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TaskPagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<Task> mTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_pager);

        mTasks = new ArrayList<Task>();

        mTasks.add( new Task(1, "Submit Project on 3rd Feb") ) ;
        mTasks.add( new Task(2, "Visit Doctor") ) ;
        mTasks.add( new Task(3, "Collect Passport") ) ;

        mViewPager = (ViewPager) findViewById(R.id.task_view_pager);

        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new
          FragmentStatePagerAdapter(fragmentManager) {
              @Override
              public Fragment getItem(int position) {
                  Task task = mTasks.get(position);
                  Bundle bundle= new Bundle();
                  bundle.putInt("tid", task.getTaskId());
                  bundle.putString("tdesc", task.getTaskDesc());
                  Fragment fragment = new TaskFragment();
                  fragment.setArguments(bundle);
                  return fragment;
              }
              @Override
              public int getCount() {
                  return mTasks.size();
              }
          });
    }
}
