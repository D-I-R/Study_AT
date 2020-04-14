package com.vector;



public class Main {

    public static void main(String[] args) {

        Vector2d v1 = new Vector2d(1,1);

        Vector2d v2 = new Vector2d(2,2);

        AbVector sum_vector = v1.sum(v2);

        AbVector diff_vectors = v2.diff(v1);

        double scalar = v1.scalarMult(v2);

        AbVector vector_mult = v1.vectorMult(v2);

        sum_vector.print();

        diff_vectors.print();

        System.out.println(scalar);

        vector_mult.print();

        System.out.println();



        Vector3d vec1 = new Vector3d(1,1, 1);

        Vector3d vec2 = new Vector3d(2,2, 2);

        AbVector sum_vector2 = vec1.sum(vec2);

        AbVector diff_vectors2 = vec2.diff(vec1);

        double scalar2 = vec1.scalarMult(vec2);

        AbVector vector_mult2 = vec1.vectorMult(vec2);



        sum_vector2.print();

        diff_vectors2.print();

        System.out.println(scalar2);

        vector_mult2.print();













    }

}
