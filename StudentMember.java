package com.Opps;

public class StudentMember extends LibraryMember {

	 public StudentMember(int memberID, String name) {
	        super(memberID, name);
	    }

	    @Override
	    public void borrowItem(LibraryItem item) {
	    	System.out.println("");
	        System.out.println( getName() + " Student is borrowing " + item.getTitle());
	    }
	}

	class FacultyMember extends LibraryMember implements Reservable {
	    public FacultyMember(int memberID, String name) {
	        super(memberID, name);
	    }

	    @Override
	    public void borrowItem(LibraryItem item) {
	        System.out.println(getName() + " Faculty is borrowing " + item.getTitle());
	    }

	    @Override
	    public void reserveItem(LibraryItem item) {
	        System.out.println(getName() + " Faculty is reserving " + item.getTitle());
	    }
	
}
