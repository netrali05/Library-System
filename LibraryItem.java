package com.Opps;

public class LibraryItem {
	
	private String title;
    private int itemID;

    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }
    
    public void displayInfo() {
        System.out.println("Item Title: " + title);
        System.out.println("Item ID: " + itemID);
    }

}
