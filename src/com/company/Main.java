package com.company;

public class Main {

    public static void main(String[] args) {

        PostOffice postoffice = new PostOffice();
        Person sorin = new Person("Sorin");
        Person ion = new Person("Ion");
        Mail m = new Mail("Ion", "Didenco", "Buna, ce mai faci?");

        postoffice.Attach(sorin);
        postoffice.Attach(ion);

        postoffice.addMail(m);
    }
}