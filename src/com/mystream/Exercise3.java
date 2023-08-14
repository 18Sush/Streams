package com.mystream;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        List<SurveyReport> surveyReportsList =new ArrayList<>();
	        surveyReportsList.add(new SurveyReport(1,"Alice","Mumbai",5,3,4));
	        surveyReportsList.add(new SurveyReport(2,"Bob","Delhi",4,2,5));
	        surveyReportsList.add(new SurveyReport(3,"Ava","Kolkata",5,4,4));
	        surveyReportsList.add(new SurveyReport(4,"John","Delhi",4,3,2));
	        surveyReportsList.add(new SurveyReport(5,"Peter","Bnagalore",4,2,3));
	    	
	        
	        int maxRequests = surveyReportsList.stream().mapToInt(SurveyReport::getTotal_connection_request).max().orElse(0); 
	        System.out.println("Maximum requests received: " + maxRequests);

	       
	        double averageCompletionTime = surveyReportsList.stream().mapToInt(SurveyReport::getNo_of_days_for_request_completion).average().orElse(0.0);
	        System.out.println("Average time for request completion: " + averageCompletionTime);

	
	        double totalAverageRequestsPerDay = surveyReportsList.stream().mapToInt(SurveyReport::getAverage_request_per_day).average().orElse(0.0);
	        System.out.println("Total average_request_per_day: " + totalAverageRequestsPerDay);

	      
	        long locationCountDelhi = surveyReportsList.stream().filter(report -> "Delhi".equals(report.getLocation())).count();
	        System.out.println("Location count for Delhi: " + locationCountDelhi);
	}
}
