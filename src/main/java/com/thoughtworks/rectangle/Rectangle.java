package com.thoughtworks.rectangle;

public class Rectangle{
    public static void main(String[] args){ 
}

private final int length;
private final int breadth;

public Rectangle(int len,int bred){
length=len;
breadth=bred;
}

public int calculate(){
    return length*breadth;
}
}