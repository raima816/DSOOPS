package com.raima.DSOOPS_L52;

public class publicAndPrivate {
    public static void main(String[] args) {
        Access a=new Access("raima", 2006);
        a.display();


    }
}
class Access{
    public String name;
    private int year;

    Access (String name, int year){
        this.name=name;
        this.year=year;
    }
    void display(){
        System.out.println("Name: "+this.name+ ",Year: " +this.year );
    }
}
