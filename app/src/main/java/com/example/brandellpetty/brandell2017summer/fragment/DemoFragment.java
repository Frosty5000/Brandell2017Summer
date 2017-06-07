package com.example.brandellpetty.brandell2017summer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.brandellpetty.brandell2017summer.R;
import com.example.brandellpetty.brandell2017summer.adapter.ListNormalAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DemoFragment.
     */
    // TODO: Rename and change types and number of parameters

    private ListView listView;
    private final ArrayList<String> contentList;

    public DemoFragment(){
        contentList = new ArrayList<>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("Fart");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);

        return view;
    }

}
