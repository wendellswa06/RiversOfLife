package com.example.android.riversoflife;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by thompsonw7 on 10/26/2016.
 */

public class DateProvider
{
    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> MinistryDetails = new HashMap<String, List<String>>();

        List<String> Open_Arms_Mens_ministry = new ArrayList<String>();
            Open_Arms_Mens_ministry.add("@string/open_arms");

        List<String> HeartToHeart = new ArrayList<String>();
            HeartToHeart.add("@string/heart2heart");

        List<String> VanTransportation = new ArrayList<String>();
            VanTransportation.add("@string/van_trans");

        List<String> SowingSeeds = new ArrayList<String>();
            SowingSeeds.add("@string/sowing_seeds");

        List<String> PrisonMinistry = new ArrayList<String>();
            PrisonMinistry.add("@string/prison_ministry");

        List<String> KingdowmKids = new ArrayList<String>();
            KingdowmKids.add("@string/kindom_kids");

        List<String> Legacy = new ArrayList<String>();
            Legacy.add("@string/legacy");

        List<String> MissionsOutreach = new ArrayList<String>();
            MissionsOutreach.add("@string/missions_outreach");

            MinistryDetails.put("Open Arm's Men Ministry", Open_Arms_Mens_ministry);
            MinistryDetails.put("Heart 2 Heart Women's Bible Study | Touching the Heart of Women", HeartToHeart);
            MinistryDetails.put("Van Transportation", VanTransportation);
            MinistryDetails.put("Sowing Seeds Ministry", SowingSeeds);
            MinistryDetails.put("Prison Ministry", PrisonMinistry);
            MinistryDetails.put("Kingdom Kids", KingdowmKids);
            MinistryDetails.put("L.e.g.a.c.y Youth Ministry", Legacy);
            MinistryDetails.put("Missions/Outreach Ministry", MissionsOutreach);

        return MinistryDetails;

        }

}
