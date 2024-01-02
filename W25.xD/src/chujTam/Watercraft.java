package chujTam;

import java.util.Objects;

public class Watercraft {
    private String type;
    private String  manufacturer;
    private double price;

    public Watercraft(String type, String manufacturer, double price)
    {
        if(type == null)
        {
           this.type = "Motorboat";
        }

        else{
            this.type = type;
        }

        if(manufacturer == null){
            this.manufacturer = "Yamaha";
        }

        else{
            this.manufacturer = manufacturer;
        }

        if(price<0)
        {
            this.price = 10000.0;
        }

        else{
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        if(manufacturer == null){
            this.manufacturer = "Yamaha";
        }
        else{
            this.manufacturer = manufacturer;
        }
    }

    public void setPrice(double price) {
        if(price<0)
        {
            this.price = 10000.0;
        }

        else{
            this.price = price;
        }
    }

    public void setType(String type) {
        if(type == null)
        {
            this.type = "Motorboat";
        }

        else{
            this.type = type;
        }
    }

    public String toString(){

        if(getType() == "")
        {
            return getClass().getSimpleName() + " Manufacturer: "+ getManufacturer() + " Price: " + getPrice();
        }

        if(getManufacturer() == "")
        {
           return  getClass().getSimpleName() +" Type: " + getType() + " Price: " + getPrice();
        }

        if(getManufacturer() == "" & getType() == "")
        {
            return getClass().getSimpleName() + " Price: " + getPrice();
        }
        else{
        return getClass().getSimpleName() +" Type: " + getType() +" Manufacturer: "+ getManufacturer() + " Price: " + getPrice();
    }
    }

    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Watercraft w1 = (Watercraft) object;
        return type.equals(w1.type) && price == w1.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    public void refuel(){
        this.price = this.price + 500;
    }

    public static void changePrice(Watercraft w1, double x)
    {
        if(w1!=null) {
            if (w1.price + x < 0) {
                w1.price = 0;
            } else {
                w1.price = w1.price + x;
            }
        }
    }

}
