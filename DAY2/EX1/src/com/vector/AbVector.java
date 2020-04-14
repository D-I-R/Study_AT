package com.vector;



public abstract class AbVector {

    double x;

    double y;

    double z;





    public abstract AbVector sum(AbVector vector); // vector.x и vector.y

    public abstract AbVector diff(AbVector vector);

    public abstract double scalarMult(AbVector vector);

    public abstract AbVector vectorMult(AbVector vector);

    public abstract void print();







}
