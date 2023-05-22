package com.company;
interface Camera{
    void takeSnap();
    void Record4kVideo();
    default void gogo(){
        System.out.println("Adarsh");
    }
}
interface Wifi{
    String []getNetwork();
}
class MyCellPhone{
    void pickupcall(){
        System.out.println("Pick up the call");
    }
}
class MySmartPhone extends MyCellPhone implements Camera,Wifi{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void Record4kVideo(){
        System.out.println("Record video");
    }
    public String []getNetwork(){
        System.out.println("Getting list Of networks..");
        String []network={"Adarsh,Kumar"};
        return network;
    }
    public void gogo(){
        System.out.println("Rishu");
    }
}
public class ch11_default_method {
    public static void main(String[] args) {
        MySmartPhone mcp=new MySmartPhone();
        mcp.pickupcall();
        mcp.takeSnap();
        mcp.Record4kVideo();
        String arr[]=mcp.getNetwork();
        for (String element:arr) {
            System.out.println(element);
        }
        mcp.gogo();
    }
}
