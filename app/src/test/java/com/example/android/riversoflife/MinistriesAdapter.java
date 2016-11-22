package com.example.android.riversoflife;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by thompsonw7 on 10/27/2016.
 */

public class MinistriesAdapter extends BaseExpandableListAdapter
{
    private Context ctx;
    private HashMap<String, List<String>> Ministries_category;
    private List<String> Ministries_list;

    public MinistriesAdapter(Context ctx, HashMap<String, List<String>> Ministries_Category, List<String> Ministries_List)
    {
        this.ctx = ctx;
        this.Ministries_category = Ministries_Category;
        this.Ministries_list = Ministries_List;
    }

    @Override
    public int getGroupCount()
    {
        return Ministries_list.size();
    }

    @Override
    public int getChildrenCount(int i)
    {
        return Ministries_category.get(Ministries_list.get(i)).size();
    }

    @Override
    public Object getGroup(int i)
    {
        return Ministries_list.get(i);
    }

    @Override
    public Object getChild(int parent, int child)
    {
        return Ministries_category.get(Ministries_list.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int i)
    {
        return 0;
    }

    @Override
    public long getChildId(int parent, int child)
    {
        return child;
    }

    @Override
    public boolean hasStableIds()
    {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertview, ViewGroup parentview)
    {
        String group_title = (String)getGroup(parent);
        if(convertview == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = inflater.inflate(R.layout.ministries_parent_layout, parentview, false);
        }
        TextView parent_textview = (TextView) convertview.findViewById(R.id.ministries_parent_txt);
        parent_textview.setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertview;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView)
    {
        String child_title = (String) getChild(parent, child);
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.ministries_child_layout, parentView, false);
        }
        TextView child_textview = (TextView) convertView.findViewById(R.id.ministries_child_txt);
        child_textview.setText(child_title);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1)
    {
        return false;
    }
}
