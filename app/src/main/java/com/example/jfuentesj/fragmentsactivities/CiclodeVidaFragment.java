package com.example.jfuentesj.fragmentsactivities;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CiclodeVidaFragment extends Fragment{
    TestInterface objec;

    public CiclodeVidaFragment(TestInterface interf) {
        this.objec = interf;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        App contenido = new App();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ciclode_vida, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment","onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment","onDetach");
    }
}
