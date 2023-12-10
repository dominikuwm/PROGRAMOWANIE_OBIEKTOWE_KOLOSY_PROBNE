package pl.edu.uwm.wmii.commerce;

import java.util.Objects;

public class School {
private String name;
private String address;
private int employess;

public School(String name, String address,int employess)
{
    if(address.isEmpty() || address==null)
    {
        this.address= "ul. Handlowa 123, 00-001 Warszawa";
    }

    else{
        this.address = address;
    }

    if(name.isEmpty() || name==null)
    {
        this.name =  "Centralny Sklep";
    }

    else{
        this.name = name;
    }

    if(employess<0)
    {
        this.employess =10;
    }

    else{
        this.employess = employess;
    }

}
    public void setEmployess(int employess) {
    if(employess<0)
    {
        this.employess=10;
    }
    else {
        this.employess = employess;
    }
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getEmployess() {
        return employess;
    }


    public String toString() {
        return getClass().getName() + " " + getName() + " " + getAddress() + " " + getEmployess();
    }


    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(getClass() != obj.getClass() || obj == null)
        {
            return false;
        }

        School school = (School) obj;

        return employess == school.employess;
    }


    public int hashCode() {
        return Objects.hash(employess);
    }

    public void hireEmployees(int x)
    {
        this.employess = employess+x;
        if(this.employess>50)
        {
            this.employess = 50;
        }
    }

    public static int CheckCapacity(School s1)
    {
        return 50- s1.employess;
    }

}
