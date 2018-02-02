package com.company;

public class Box {
    int x;
    int y;
    int z;

    Box(int x,int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int hashCode(){
        final int prime = 10;
        int result = 1;
        result = prime*result+x;
        result = prime*result+y;
        result = prime*result+z;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        else if(obj == null)
            return false;
        else if(!(obj instanceof Box))
            return false;
        Box other = (Box)obj;
        if(x != other.x)
            return false;
        else if(y != other.y)
            return false;
        else if(z != other.z)
            return false;
        return true;
    }
}
