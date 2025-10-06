package com.raima.DSOOPS_L52;
    public class Car{
        public String make;
        public int year;

        Car(String make, int year){
        this.make=make;
        this.year=year;
        }
        void display(){
            System.out.println("Make: "+make+ ",Year: " +year );
        }

        public static void main(String[] args) {
            Car c1=new Car("Mustang", 2006);
            c1.display();

        }


}
