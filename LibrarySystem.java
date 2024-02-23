package com.Opps;

import com.Opps.Book;
import com.Opps.DVD;
import com.Opps.FacultyMember;
import com.Opps.StudentMember;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Chava", 111, "Sawant Shivaji");
		DVD d1 = new DVD("3 Idiots", 777, 150);
		
		System.out.println("Book Information:");
        b1.displayInfo();
        System.out.println("\nDVD Information:");
        d1.displayInfo();
        
        // Create instances of Library Members
        StudentMember student = new StudentMember(1, "Mayur");
        FacultyMember faculty = new FacultyMember(2, "Dr. Smith");

        // Demonstrate borrowing and reserving items
        student.borrowItem(b1);
        faculty.borrowItem(d1);
        faculty.reserveItem(b1);

	}

}

