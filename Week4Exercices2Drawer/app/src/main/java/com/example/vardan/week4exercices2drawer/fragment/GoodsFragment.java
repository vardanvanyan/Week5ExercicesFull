package com.example.vardan.week4exercices2drawer.fragment;


import android.app.SearchManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardan.week4exercices2drawer.adapter.ListAdapter;
import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.provider.MyProvider;

import java.util.Objects;

import static android.content.Context.SEARCH_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 */
public class GoodsFragment extends Fragment {


    private RecyclerView usersList;
    private ListAdapter adapter;

    public GoodsFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_goods, container, false);
        usersList = view.findViewById(R.id.rvId);
        usersList.setHasFixedSize(true);
        usersList.setLayoutManager(
                new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        setHasOptionsMenu(true);
        adapter =
                new ListAdapter(getContext(), MyProvider.getUsersList(getActivity()));
        usersList.setAdapter(adapter);
        return view;
    }

    public void changedListData(String category) {
        usersList.setAdapter(new ListAdapter(getActivity(), MyProvider.getCategoryList(category)));
    }

    public void changedBasketData() {
        usersList.setAdapter(new ListAdapter(getActivity(), MyProvider.getCartList()));
    }

    public void changedLikeData() {
        usersList.setAdapter(new ListAdapter(getActivity(), MyProvider.favoriteList()));
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        SearchManager searchManager = (SearchManager) Objects.requireNonNull(getActivity()).getSystemService(SEARCH_SERVICE);
        MenuItem search = menu.findItem(R.id.search);
        SearchView searchView = null;
        if (search != null) {
            searchView = (SearchView) search.getActionView();
        }
        if (searchView != null) {
            assert searchManager != null;
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String query) {

                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    adapter.getFilter().filter(newText);
                    return false;
                }
            });
        }
    }
}