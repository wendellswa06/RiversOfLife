package com.example.android.riversoflife;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.example.android.riversoflife.R.id.imageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment
{

    ImageView imageView;

    public WelcomeFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        imageView = (ImageView)getView().findViewById(R.id.welcome_image_view_slider);

        final int []imageArray={R.drawable.welcome,R.drawable.oneservice,R.drawable.november_healing,R.drawable.legacy, R.drawable.iconprime, R.drawable.walkers};
        final Handler handler = new Handler();


        Runnable runnable = new Runnable() {
            int i=0;
            public void run() {
                imageView.setImageResource(imageArray[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 4000);  //for interval...
            }
        };
        handler.postDelayed(runnable, 0); //for initial delay..

    }


}
