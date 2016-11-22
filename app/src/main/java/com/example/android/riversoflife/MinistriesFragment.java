package com.example.android.riversoflife;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static android.R.id.list;
import static android.os.Build.VERSION_CODES.M;
import static com.example.android.riversoflife.R.id.exp_list;
import static com.example.android.riversoflife.R.string.heart2heart;
import static com.example.android.riversoflife.R.string.kingdom_kids;
import static com.example.android.riversoflife.R.string.open_arms;
import static com.example.android.riversoflife.R.string.prison_ministry;
import static com.example.android.riversoflife.R.string.sowing_seeds;
import static com.example.android.riversoflife.R.string.van_trans;


/**
 * A simple {@link Fragment} subclass.
 */
public class MinistriesFragment extends Fragment
{
    ExpandableListView e_list;
    View view;
    int lastExpandedGroupPosition = 0;

    private String[] groups;


    private String[][] children;


    public MinistriesFragment()
    {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        groups = new String[] { "Open Arm's Men Ministry", "Heart 2 Heart Women’s Bible Study | Touching the Heart of Women ", "Van Transportation", "Sowing Seeds Ministry",
                                "Prison Ministry", "Kingdom Kids", "L.E.G.A.C.Y Youth Ministry", "Missions/Outreach Ministry"};

        children = new String [][] {
                {getString(R.string.open_arms)},
                {getString(R.string.heart2heart)},
                {getString(R.string.van_trans)},
                {getString(R.string.sowing_seeds)},
                {getString(R.string.prison_ministry)},
                {getString(R.string.kingdom_kids)},
                {getString(R.string.legacy)},
                {getString(R.string.missions_outreach)}

        };
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_ministries, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        e_list = (ExpandableListView) view.findViewById(R.id.exp_list);
        e_list.setAdapter(new ExpandableListAdapter(groups, children));
        e_list.setGroupIndicator(null);


        e_list.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener()
        {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id)
            {
                setListViewHeight(parent, groupPosition);
                return false;
            }
        });

    }


    private void setListViewHeight(ExpandableListView listView,
                                   int group) {
        ExpandableListAdapter listAdapter = (ExpandableListAdapter) listView.getExpandableListAdapter();
        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.EXACTLY);
        for (int i = 0; i < listAdapter.getGroupCount(); i++) {
            View groupItem = listAdapter.getGroupView(i, false, null, listView);
            groupItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

            totalHeight += groupItem.getMeasuredHeight();

            if (((listView.isGroupExpanded(i)) && (i != group))
                    || ((!listView.isGroupExpanded(i)) && (i == group))) {
                for (int j = 0; j < listAdapter.getChildrenCount(i); j++) {
                    View listItem = listAdapter.getChildView(i, j, false, null,
                            listView);
                    listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

                    totalHeight += listItem.getMeasuredHeight();

                }
            }
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        int height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getGroupCount() - 1));
        if (height < 10)
            height = 200;
        params.height = height;
        listView.setLayoutParams(params);
        listView.requestLayout();

    }


    public class ExpandableListAdapter extends BaseExpandableListAdapter
    {

        private final LayoutInflater inf;
        private String[] groups;
        private String[][] children;

        public ExpandableListAdapter(String[] groups, String[][] children) {
            this.groups = groups;
            this.children = children;
            inf = LayoutInflater.from(getActivity());
        }


        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return children[groupPosition].length;
        }

        @Override
        public Object getGroup(int groupPosition) {
            return groups[groupPosition];
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return children[groupPosition][childPosition];
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

            ViewHolder holder;
            if (convertView == null) {
                convertView = inf.inflate(R.layout.ministries_child_layout, parent, false);
                holder = new ViewHolder();

                holder.text = (TextView) convertView.findViewById(R.id.ministries_child_txt);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText(getChild(groupPosition, childPosition).toString());

            return convertView;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            ViewHolder holder;


            if (convertView == null) {
                convertView = inf.inflate(R.layout.ministries_parent_layout, parent, false);

                holder = new ViewHolder();
                holder.text = (TextView) convertView.findViewById(R.id.ministries_parent_txt);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText(getGroup(groupPosition).toString());

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

        private class ViewHolder {
            TextView text;
        }

        @Override
        public void onGroupExpanded(int groupPosition){
            //collapse the old expanded group, if not the same
            //as new group to expand
            if(groupPosition != lastExpandedGroupPosition){
                e_list.collapseGroup(lastExpandedGroupPosition);
            }

            super.onGroupExpanded(groupPosition);
            lastExpandedGroupPosition = groupPosition;
        }

    }

}
