package com.example.petcaramelo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    public MenuFragment()
    {}
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        return inflater.inflate(R.layout.menu_fragment, container,false);
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.menu, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.doar:
                break;
            case R.id.adotar:
                break;
            case R.id.denuncia:
                break;
    }
    return super.onOptionsItemSelected(item);
    }
}
