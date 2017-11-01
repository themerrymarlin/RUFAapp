package com.example.rufaapp;

/**
 * Created by David Merriman on 10/10/2017.
 */

class Holder<T> {
    private T obj;
    private int typeCode;

    public Holder(T obj,int typeCode){
        this.obj = obj;
        this.typeCode = typeCode;
    }

    public T getObj(){
        return this.obj;
    }

    public int getTypeCode(){
        return this.typeCode;
    }

    public String getAsString(){
        return obj.toString();
    }

    public Integer getAsInteger(){
        return (Integer)obj;
    }
}
