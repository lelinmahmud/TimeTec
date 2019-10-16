package com.time.timetec;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvFragment extends Fragment {

    private RecyclerView recyclerView;
    private ComputerAdepter computerAdepter;
    private List<ComputerModel> computerModels;



    public TvFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_tv, container, false);
        recyclerView = view.findViewById(R.id.recycler_id);
        return view;

    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        computerModels = new ArrayList<>();
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));
        computerModels.add(new ComputerModel(R.drawable.smart,"Samsung65'","$4,999.00"));

        computerAdepter = new ComputerAdepter(computerModels,getContext());
        GridLayoutManager gm = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gm);
        recyclerView.setAdapter(computerAdepter);
        computerAdepter.notifyDataSetChanged();

    }


}
