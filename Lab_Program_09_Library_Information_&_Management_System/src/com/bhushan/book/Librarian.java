package com.bhushan.book;


public class Librarian {
      private Library library;
      private String employeeName;
      
      public Librarian() {
    	  
      }
      
      
     
       
	  public void setLibrary(Library library) {
		this.library = library;
	}




	  public void setEmployeeName(String employeeName) {
		  this.employeeName = employeeName;
	  }




	  public void manageLibrary() {
    	      System.out.println(employeeName+" ");
    	      library.showLibraryData() ;
      }
}
