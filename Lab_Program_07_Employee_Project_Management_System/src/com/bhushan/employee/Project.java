package com.bhushan.employee;

public class Project {
     private String projectId;
     private String projectName;
     private String duration;
     
     
	 public Project(String projectId, String projectName, String duration) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.duration = duration;
	 }



	 public String getProjectId() {
		return projectId;
	}



	 public String getProjectName() {
		 return projectName;
	 }



	 public String getDuration() {
		 return duration;
	 }



	 public void showProjectDetails() {
	        System.out.println(projectName + " (" + duration + ")");
	    }
     
     
	
     
}
