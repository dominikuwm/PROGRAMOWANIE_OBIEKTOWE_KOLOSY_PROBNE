package pl.edu.uwm.wmii.commerce;

public class Store {
    private String name;
    private String address;
    private int employees;

    public Store(String name, String address, int employees)
    {
        if(name.isEmpty() || name==null)
        {
            this.name= "Centralny Sklep";
        }
        else{
            this.name = name;
        }
    }






}




