package com.example.android.riversoflife;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static android.R.id.button1;
import static android.R.id.button2;
import static android.R.id.button3;
import static com.example.android.riversoflife.R.id.baptism_btn;
import static com.example.android.riversoflife.R.id.jc_btn;
import static com.example.android.riversoflife.R.id.mankind_btn;
import static com.example.android.riversoflife.R.id.salvation_btn;
import static com.example.android.riversoflife.R.id.sanctification_btn;
import static com.example.android.riversoflife.R.id.supper_btn;
import static com.example.android.riversoflife.R.id.textView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WhatWeBelieve extends Fragment
{

    View view;
    TextView bible_txt;
    TextView god_txt;
    TextView jc_txt;
    TextView mankind_txt;
    TextView salvation_txt;
    TextView healing_txt;
    TextView baptism_txt;
    TextView sanctification_txt;
    TextView supper_txt;
    TextView water_bap_txt;

    public WhatWeBelieve()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_what_we_believe,container, false);

        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        bible_txt = (TextView) view.findViewById(R.id.bible_txt);
        bible_txt.setVisibility(View.GONE);
        god_txt = (TextView) view.findViewById(R.id.god_txt);
        god_txt.setVisibility(View.GONE);
        jc_txt = (TextView) view.findViewById(R.id.jc_txt);
        jc_txt.setVisibility(View.GONE);
        mankind_txt = (TextView) view.findViewById(R.id.mankind_txt);
        mankind_txt.setVisibility(View.GONE);
        salvation_txt = (TextView) view.findViewById(R.id.salvation_txt);
        salvation_txt.setVisibility(View.GONE);
        healing_txt = (TextView) view.findViewById(R.id.healing_txt);
        healing_txt.setVisibility(View.GONE);
        baptism_txt = (TextView) view.findViewById(R.id.baptism_txt);
        baptism_txt.setVisibility(View.GONE);
        sanctification_txt = (TextView) view.findViewById(R.id.sanctification_txt);
        sanctification_txt.setVisibility(View.GONE);
        supper_txt = (TextView) view.findViewById(R.id.supper_txt);
        supper_txt.setVisibility(View.GONE);
        water_bap_txt = (TextView) view.findViewById(R.id.water_bap_txt);
        water_bap_txt.setVisibility(View.GONE);

        OnClickListener listener = new View.OnClickListener()
        {


            @Override
            public void onClick(View view)
            {

                switch (view.getId()) {
                    case R.id.bible_btn:
                        bible_txt.setVisibility(View.VISIBLE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        bible_txt.setText("We believe the Bible to be the inspired Word of God, the revelation of God to man, and the only infallible, authoritative rule of faith and conduct.");
                        break;
                    case R.id.god_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.VISIBLE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        god_txt.setText("We believe that there is one God, eternally existent in three persons: God the Father, God the Son, and God the Holy Spirit.");
                        break;
                    case R.id.jc_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.VISIBLE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        jc_txt.setText("We believe in the deity of our Lord Jesus Christ, his virgin birth, His sinless life, His teachings and miracles, His death on the cross, His bodily resurrection, His ascension to the right hand of the Father, and in His future return to this earth for his Church, to be with Him forever.");
                        break;
                    case R.id.mankind_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.VISIBLE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        mankind_txt.setText("We believe man was created good and upright. However, man by voluntary transgression fell and thereby incurred not only physical death, but spiritual death, which is separation from God.");
                        break;
                    case salvation_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.VISIBLE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        salvation_txt.setText("We believe that the only means of being cleansed from sin is through repentance toward God through faith in the Lord Jesus Christ and his shed blood, whereby our fellowship with God is restored.");
                        break;
                    case R.id.healing_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.VISIBLE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        healing_txt.setText("We believe in the healing power of God. The redemptive work of Christ on the cross provides healing for the human body. We therefore practice the prayer of faith, and lay hands on the sick that they may be healed.");
                        break;
                    case baptism_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.VISIBLE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        baptism_txt.setText("We believe in the baptism with the Holy Spirit, with the evidence of speaking in other tongues. This experience is distinct from and subsequent to salvation, empowers us for life and service, and is given to believers who ask for it.");
                        break;
                    case sanctification_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.VISIBLE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.GONE);
                        sanctification_txt.setText("We believe in the sanctifying power of the Holy Spirit to enable us to live a holy life. As we allow Him to work within us, He bears fruit in our character and provides gifts for the work of our ministry.");
                        break;
                    case supper_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.VISIBLE);
                        water_bap_txt.setVisibility(View.GONE);
                        supper_txt.setText("We believe that the Lord’s Supper is to be practiced regularly to remind us of what Jesus did for us. The bread represents His body, given for us, and the juice represents His blood, shed for us. It symbolizes our Communion with God, whereby we can share the divine nature of our Lord Jesus Christ.");
                        break;
                    case R.id.water_bap_btn:
                        bible_txt.setVisibility(View.GONE);
                        god_txt.setVisibility(View.GONE);
                        jc_txt.setVisibility(View.GONE);
                        mankind_txt.setVisibility(View.GONE);
                        salvation_txt.setVisibility(View.GONE);
                        healing_txt.setVisibility(View.GONE);
                        baptism_txt.setVisibility(View.GONE);
                        sanctification_txt.setVisibility(View.GONE);
                        supper_txt.setVisibility(View.GONE);
                        water_bap_txt.setVisibility(View.VISIBLE);
                        water_bap_txt.setText("We believe that Water Baptism by immersion is the commandment of God to all who have repented and believe on Jesus Christ as Savior and Lord. It symbolizes our death to the old life, our sins being washed away, and rising to a new life with a personal relationship with God.");
                        break;

                }

                return;


            }
        };

        view.findViewById(R.id.bible_btn).setOnClickListener(listener);
        view.findViewById(R.id.god_btn).setOnClickListener(listener);
        view.findViewById(R.id.jc_btn).setOnClickListener(listener);
        view.findViewById(R.id.mankind_btn).setOnClickListener(listener);
        view.findViewById(salvation_btn).setOnClickListener(listener);
        view.findViewById(R.id.healing_btn).setOnClickListener(listener);
        view.findViewById(baptism_btn).setOnClickListener(listener);
        view.findViewById(sanctification_btn).setOnClickListener(listener);
        view.findViewById(supper_btn).setOnClickListener(listener);
        view.findViewById(R.id.water_bap_btn).setOnClickListener(listener);

    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }


    public void btn_click(View view)
    {


    }
}

