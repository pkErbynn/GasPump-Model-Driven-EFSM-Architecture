package edu.iit.architecture.mda.DataStore;

public class DataStore1 extends DataStore{
    public int price;
    public int temp_a;
    public int cash;
    public int temp_c;
    public int total;
    public int w;
    public int l;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public float getPriceFloat() {
        return 0;
    }

//    public int getTemp_a() {
//        return temp_a;
//    }

    @Override
    public int getTemp_a() {
        return 0;
    }

    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(int temp_c) {
        this.temp_c = temp_c;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}
