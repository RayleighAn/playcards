package com.myCard;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class Card {
	int x=0;      //横坐标1111111
	int y=0;	  //纵坐标
	int width;    //宽度
	int height;   //高度4444444444444444444444444
	Bitmap bitmap;//图片 
	String name; //Card的名称555555555555555555555555555555
	boolean rear=true;//是否是背面
	boolean clicked=false;//是否被点击66666666666666666666666666666666
	public Card(int width,int height,Bitmap bitmap){
		this.width=width;
		this.height=height;
		this.bitmap=bitmap;
	}
	public void setLocation(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setName(String name){
		this.name=name;
	}
	public Rect getSRC(){
		return new Rect(0,0,width,height);
	}
	public Rect getDST(){
		return new Rect(x, y,x+width, y+height);
	}
}
