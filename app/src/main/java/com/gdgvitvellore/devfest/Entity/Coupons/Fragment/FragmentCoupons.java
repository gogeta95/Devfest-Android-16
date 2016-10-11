package com.gdgvitvellore.devfest.Entity.Coupons.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import com.gdgvitvellore.devfest.gdgdevfest.R;

import java.util.List;

/**
 * Created by Shuvam Ghosh on 10/12/2016.
 */

public class FragmentCoupons extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.fragment_coupons,container,false);
        rootInit();
        return root;
    }

    private void rootInit() {
    }


    public class SwipeStackAdapter extends BaseAdapter {

        private List<String> mData;

        public SwipeStackAdapter(List<String> data) {
            this.mData = data;
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public String getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.api_view,parent,false);
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_coupons_item, parent, false);
            TextView textViewCard = (TextView) convertView.findViewById(R.id.apiName);
            textViewCard.setText(mData.get(position));

            return convertView;
        }
    }

}
