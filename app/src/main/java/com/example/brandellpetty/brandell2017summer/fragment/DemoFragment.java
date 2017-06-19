package com.example.brandellpetty.brandell2017summer.fragment;


import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.brandellpetty.brandell2017summer.ActivityA;
import com.example.brandellpetty.brandell2017summer.AdvanceListViewActivity;
import com.example.brandellpetty.brandell2017summer.AdvanceViewPagerActivity;
import com.example.brandellpetty.brandell2017summer.NinePatchActivity;
import com.example.brandellpetty.brandell2017summer.NotificationActivity;
import com.example.brandellpetty.brandell2017summer.R;
import com.example.brandellpetty.brandell2017summer.ScaleTypeActivity;
import com.example.brandellpetty.brandell2017summer.ViewPagerActivity;

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
    private final Context context;

    public DemoFragment(){
        context = getContext();

        contentList = new ArrayList<>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvanceViewPager");
        contentList.add("D");
        contentList.add("LaunchMode");
        contentList.add("F");
        contentList.add("G");
        contentList.add("H");
        contentList.add("I");
        contentList.add("J");
        contentList.add("K");

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NinePatchActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), AdvanceViewPagerActivity.class);
                        startActivity(intent5);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), ActivityA.class);
                        startActivity(intent7);
                    default:
                }
            }
        });
        return view;
    }

}
