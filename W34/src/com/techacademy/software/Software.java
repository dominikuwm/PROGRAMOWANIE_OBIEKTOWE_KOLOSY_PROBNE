package com.techacademy.software;

import java.util.Objects;

public class Software {
    private String name;
    private String version;
    private int users;
    private double price;

    public Software(String name, String version, int users, double price){
        if(name==null || name.isEmpty())
        {
            this.name = "Generic  Software";
        }

        else{
                this.name = name;
        }

        if(version == null || version.isEmpty())
        {
            this.version = "1.0.0";
        }

        else{
            this.version = version;
        }

        if(price<0)
        {
            this.price = 12.89;
        }
        else{
            this.price = price;
        }
        this.users = users;
    }

    //gettery


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getUsers() {
        return users;
    }

    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
        {
            this.name = "Generic Software";
        }
        else{
            this.name = name;
        }
    }

    public void setVersion(String version) {
        if(version == null || version.isEmpty())
        {
            this.version = "1.0.0";
        }
        else{
            this.version = version;
        }
    }

    public void setPrice(double price) {
        if(price < 0)
        {
            this.price = 12.89;
        }
        else{
            this.price = price;
        }
    }

    public void setUsers(int users) {
        this.users = users;
    }


    public String toString(){
        return getClass().getSimpleName() + " Name: " + getName() + " Version: " + getVersion()
                + " Number of users: " + getUsers() + " Price: " + getPrice();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Software software = (Software) object;
        return users == software.users && Double.compare(price, software.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, price);
    }

    public void addUsers(int x){
        if(this.users + x > 100)
        {
            this.users = 100;
        }

        else{
            this.users = this.users + x;
        }

        this.price = this.price + 10;
    }

    public static int checkUserCapacity(Software s)
    {
        return 1000 - s.getUsers();
    }
}
