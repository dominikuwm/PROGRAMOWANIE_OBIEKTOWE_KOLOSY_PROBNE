package com.retailmanagement.store;

public class Store {
    private String catergory;
    private String address;
    private double staffCount;

    public Store(String catergory, String address, double staffCount)
    {
        this.catergory = catergory;
        this.address = address;
        this.staffCount = staffCount;
    }
    public static  Store createDepartmentStore(String catergory, String address, double staffCount)
    {
        if(catergory == null)
        {
            catergory = "";
        }

        if(address==null)
        {
            address = "";
        }
        return new Store(catergory,address,staffCount);
    }

    public Store createSpecialtyStore(String catergory, String address, double staffCount)
    {
        if(catergory == null)
        {
            catergory = "";
        }

        if(address==null)
        {
            address = "";
        }
        return new Store(catergory,address,staffCount);
    }

}
