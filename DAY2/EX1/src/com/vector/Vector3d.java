package com.vector;



public final class Vector3d extends AbVector {



    public Vector3d(double x, double y, double z) {

        this.x = x;

        this.y = y;

        this.z = z;

    }





    @Override

    public AbVector sum(AbVector vector) {

        return new Vector3d(this.x + vector.x, this.y + vector.y, this.z + vector.z);

    }



    @Override

    public AbVector diff(AbVector vector) {

        return new Vector3d(this.x - vector.x, this.y - vector.y, this.z - vector.z);



    }



    @Override

    public double scalarMult(AbVector vector) {

        double a = this.x * vector.x;

        double b = this.y * vector.y;

        double c = this.z * vector.z;

        return a+b+c;

    }



    @Override

    public AbVector vectorMult(AbVector vector) {

        double a = this.x * vector.x;

        double b = this.y * vector.y;

        double c = this.z * vector.z;



        return new Vector3d(a, b, c);

    }





    @Override

    public void print() {

        System.out.println("Vector 3d:" + Double.toString(this.x) + " " + Double.toString(this.y) + " " + Double.toString(this.z));



    }



}
