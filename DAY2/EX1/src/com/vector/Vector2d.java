package com.vector;



public final class Vector2d extends AbVector {



    public Vector2d(double x, double y) {

        this.x = x;

        this.y = y;

        this.z = 0;

    }



    @Override

    public AbVector sum(AbVector vector) {

        return new Vector2d(this.x + vector.x, this.y + vector.y);

    }



    @Override

    public AbVector diff(AbVector vector) {

        return new Vector2d(this.x - vector.x, this.y - vector.y);



    }



    @Override

    public double scalarMult(AbVector vector) {

        // векторы a и b

        // a = {x=a1,y=a2}

        // b = {x=b1, y=b2}

        // a - это this

        // b - v

        // возвращаем a1*b1 + a2*b2

        return this.x* vector.x + this.y* vector.y;

    }



    @Override

    public AbVector vectorMult(AbVector vector) {

        double x1 = this.x* vector.x;

        double y1 = this.y* vector.y;



        return new Vector2d(x1, y1);

    }



    @Override

    public void print() {

        System.out.println("Vector 2d:" + Double.toString(this.x) + " " + Double.toString(this.y));

//        System.out.println(this.x);

//        System.out.println(this.y);

    }

}
