package pl.edu.uwm.wmii.commerce;

import java.util.Objects;

public class Bookstore extends School{

    private String genre;
    private int booksInStock;

    public Bookstore(String name, String address,int employess, String genre, int booksInStock)
    {
        super(name, address, employess);

        if(genre.isEmpty() || genre==null)
        {
            this.genre ="ogolny";
        }

        else{
            this.genre = genre;
        }

        if(booksInStock<0)
        {
            booksInStock =250;
        }

        else{
            this.booksInStock = booksInStock;
        }
    }

    @Override
    public int getEmployess() {
        return super.getEmployess();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getBooksInStock() {
        return booksInStock;
    }

    public String getGenre() {
        return genre;
    }



    @Override
    public String toString() {
        return super.toString() + " " +getGenre() + " " +getBooksInStock();
    }

    @Override
    public void hireEmployees(int x) {
        super.hireEmployees(x);

    if(getEmployess()>75)
    {
        setEmployess(75);
    }

     this.booksInStock += 10*x;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false; // używa equals z klasy School
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bookstore other = (Bookstore) obj;
        return genre.equals(other.genre);
}

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre); // używa hashCode z klasy School
    }

    public static int CheckCapacity(Bookstore b1)
    {
        return 75-b1.getEmployess();
    }
}
