package chujTam;

import java.util.Objects;

public class Boat extends Watercraft {
    private double length;
    private int capacity;

    public Boat(String type, String manufacturer, double price, double length, int capacity)
    {
        super(type, manufacturer,price);
        if(length < 0 )
        {
            this.length = 5.0;
        }

        else{
            this.length = length;
        }

        if(capacity< 0)
        {
            this.capacity =4;
        }
        else{
            this.capacity = capacity;
        }
    }


    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public double getLength() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setLength(double length) {
        if(length < 0 )
        {
            this.length = 5.0;
        }

        else{
            this.length = length;
        }
    }

    public void setCapacity(int capacity) {
        if(capacity< 0)
        {
            this.capacity =4;
        }
        else{
            this.capacity = capacity;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Length: " + getLength() + "Capacity: " + getCapacity();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Boat boat = (Boat) object;
        return Double.compare(length, boat.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }

    @Override
    public void refuel() {
       setPrice(-250);
    }


    public static void changePrice(Boat b1, double x)
    {
        if(b1!=null) {

            double wynik = b1.getPrice() - x;
            b1.setPrice(wynik);
        }
    }
}
