package com.company.Java_sem1.lab7;

public class FurnitureShop {
        private Shelf shelf;
        private Table table;
        private Bed bed;
        private Chair chair;
        public FurnitureShop(Shelf shelf)
        {
            this.shelf = shelf;
        }
        public FurnitureShop(Table table){
            this.table = table;
        }
        public FurnitureShop(Bed bed){
            this.bed = bed;
        }
        public FurnitureShop(Chair chair){
            this.chair = chair;
        }
        public FurnitureShop(Shelf shelf,Table table,Bed bed,Chair chair)
        {
            this.shelf = shelf;
            this.table = table;
            this.bed = bed;
            this.chair = chair;
        }

    public Shelf getShelf() {
        return shelf;
    }

    public Table getTable() {
        return table;
    }

    public Bed getBed() {
        return bed;
    }

    public Chair getChair() {
        return chair;
    }
}
