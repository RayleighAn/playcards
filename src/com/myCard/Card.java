package com.myCard;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class Card {
	int x=0;      //������
	int y=0;	  //������
	int width;    //���
	int height;   //�߶�4444444444444444444444444
	Bitmap bitmap;//ͼƬ 
	String name; //Card������555555555555555555555555555555
	boolean rear=true;//�Ƿ��Ǳ���
	boolean clicked=false;//�Ƿ񱻵��66666666666666666666666666666666
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
