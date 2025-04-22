package com.pluralsight;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;      // Default value
        this.checkedOutTo = "";         // Default value
    }

// GETTER AND SETTER FUNCTIONS

    // Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // CheckedOut
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // CheckOutTo
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

// OTHER METHODS

    public void checkOut(String name){
        this.isCheckedOut = true;               // "this" refers to the class object
        this.checkedOutTo = name;               // But "this" is NOT required here (it is only for specificity)
    }   // Comp knows you're talking about the class object bc there's no alternative for these variable names within the method

    public void checkIn(){
        this.isCheckedOut = false;
        this.checkedOutTo = "";          // "" (blank string) works & Null works -- since no one checked out the book
    }





}