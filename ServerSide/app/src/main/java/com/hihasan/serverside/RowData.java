package com.hihasan.serverside;

/**
 * Created by hasan on 9/27/16.
 */
public class RowData
{
    private String title;
    //private String description;
    private String img_url;
    public RowData(String title,String img_url){
        this.title=title;
        //this.description=description;
        this.img_url=img_url;

    }

    public String getTitle(){
        return title;

    }
    /*public String getDescription(){
        return description;

    }*/
    public String getImageURL(){
        return img_url;

    }
}