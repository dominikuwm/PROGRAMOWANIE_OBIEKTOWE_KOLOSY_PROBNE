package com.techacademy.software;

import java.util.Objects;

public class TextEditor extends Software {
    private String fileFormat;
    private int features;

    public TextEditor(String name, String version, int users, double price, String fileFormat, int features) {
        super(name, version, users, price);

        if (fileFormat == null || fileFormat.isEmpty()) {
            this.fileFormat = ".txt";
        } else {
            this.fileFormat = fileFormat;
        }
        if (features < 0) {
            this.features = 10;
        } else {
            this.features = features;
        }
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public int getFeatures() {
        return features;
    }

    public String toString(){
        return super.toString() + "File Format:" + getFileFormat() + "Price:" + getPrice();
    }

    @Override
    public void addUsers(int x) {
        super.addUsers(x);
        if(getUsers()>2000)
        {
            setUsers(2000);
        }

        this.features = this.features + 2*x;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        TextEditor that = (TextEditor) object;
        return features == that.features && Objects.equals(fileFormat, that.fileFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fileFormat, features);
    }
}

