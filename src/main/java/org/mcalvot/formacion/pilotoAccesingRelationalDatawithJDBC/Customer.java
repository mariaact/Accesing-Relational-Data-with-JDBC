package org.mcalvot.formacion.pilotoAccesingRelationalDatawithJDBC;

public class Customer {

    private long id;
    private String first_name, last_name;

    public Customer(long id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String toSting(){

        return String.format("Customer[id=%d, firstName='%s', lastName='%s']",
                id, first_name, last_name);

    }
}
