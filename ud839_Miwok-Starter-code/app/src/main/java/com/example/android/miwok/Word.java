package com.example.android.miwok;

/**
 * Created by prakhar on 9/10/16.
 */

public class Word {
    private String menglish;
    private String mmiwok;
    private int image;
    private int musicid;

    public Word(String english,String miwok,int id,int music)
    {
        menglish = english;
        mmiwok = miwok;
        image = id;
        musicid = music;
    }

    public Word(String english,String miwok,int music)
    {

        menglish = english;
        mmiwok = miwok;
        musicid = music;
    }
    public String getenglish()
    {
        return menglish;
    }
    public String getmiwok()
    {
        return mmiwok;
    }
    public int getimageid()
    {
        return image;
    }
    public int getmusicid()
    {
        return musicid;
    }
    public boolean hasimage()
    {
        if(image==0)
            return false;
        else
            return true;
    }
}
