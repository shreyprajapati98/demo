package com.demo.demo.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.demo.R;
import com.demo.demo.view.recycler.RecyclerExplore;
import com.demo.demo.api.pojo.ExplorePOJO;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerview_explore;
    GridLayoutManager exploreLayoutManager;
    private List<ExplorePOJO> exploreDataList = new ArrayList<ExplorePOJO>();

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        
        recyclerview_explore = view.findViewById(R.id.recyclerview_explore_home_fragment);
        exploreLayoutManager = new GridLayoutManager(this.getContext(), 1, GridLayoutManager.HORIZONTAL, false);
        recyclerview_explore.setLayoutManager(exploreLayoutManager);
        recyclerview_explore.setItemAnimator(new DefaultItemAnimator());
        RecyclerExplore exploreadapter = new RecyclerExplore(getContext(), exploreDataList);
        recyclerview_explore.setAdapter(exploreadapter);

        exploreData();





        return view;
    }

    private void exploreData() {
        ExplorePOJO data = new ExplorePOJO("https://wpportfolio.net/wp-content/uploads/2017/12/pexels-photo-417328.jpeg");
        exploreDataList.add(data);
        data = new ExplorePOJO("https://wpportfolio.net/wp-content/uploads/2017/12/pexels-photo-417328.jpeg");
        exploreDataList.add(data);
        data = new ExplorePOJO("https://wpportfolio.net/wp-content/uploads/2017/12/pexels-photo-417328.jpeg");
        exploreDataList.add(data);
        data = new ExplorePOJO("https://wpportfolio.net/wp-content/uploads/2017/12/pexels-photo-417328.jpeg");
        exploreDataList.add(data);
        data = new ExplorePOJO("https://wpportfolio.net/wp-content/uploads/2017/12/pexels-photo-417328.jpeg");
        exploreDataList.add(data);

    }
}