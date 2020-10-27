package com.company.lab15;

public class Main {
    public static void main(String[] args) {
        Collection col = new Collection(1,2,3,4,5,6,7,8,9);

        col.add(10);
        col.delete(2);
        System.out.println(col.searchValue(3));
        System.out.println(col.searchInd(2));
        System.out.println(col.getMax());
        System.out.println(col.getMin());
        System.out.println(col.getMiddleArif());
    }
}