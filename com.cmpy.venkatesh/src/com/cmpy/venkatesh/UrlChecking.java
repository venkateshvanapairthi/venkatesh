package com.cmpy.venkatesh;

import java.util.ArrayList;
import java.util.List;

public class UrlChecking {
	List<String> allUrlList = new ArrayList<String>();
	List<String> headerUrlList = null ;
	List<String> ChieldUrlList = null;
	List<String> subChieldUrlList = null;
	int depth = 0;
	
	public List<String> getAllUrls(){
		
		if(depth == 0)
		{
			allUrlList.addAll(getHeaderList(allUrlList));
		}
		
		if(depth == 1)
		{
			allUrlList.addAll(getHeaderList(allUrlList));
			allUrlList.addAll(getCheildUrlList(allUrlList));
		}
		
		if(depth == 2)
		{
			allUrlList.addAll(getHeaderList(allUrlList));
			allUrlList.addAll(getCheildUrlList(allUrlList));
			allUrlList.addAll(getSubCheildUrlList(allUrlList));
		}
		
		return allUrlList;
		
		
	}
	
	private List<String> getHeaderList(List<String> allUrlList)
	{
		headerUrlList = new ArrayList<String>();
		
		headerUrlList.add("ContactUs");
		headerUrlList.add("HOME");
		headerUrlList.add("Service");
		headerUrlList.add("Clients");
		headerUrlList.add("Login");
		
		allUrlList.addAll(headerUrlList);
		return allUrlList;
	}
	
	private List<String> getCheildUrlList(List<String> allUrlList)
	{
		ChieldUrlList = new ArrayList<String>();
		
		ChieldUrlList.add("ContactUs");
		ChieldUrlList.add("HOME");
		ChieldUrlList.add("Service");
		ChieldUrlList.add("Clients");
		ChieldUrlList.add("Login");
		
		allUrlList.addAll(ChieldUrlList);
		return allUrlList;
		
	}
	
	private List<String> getSubCheildUrlList(List<String> allUrlList)
	{
		subChieldUrlList = new ArrayList<String>();
		
		subChieldUrlList.add("ContactUs");
		subChieldUrlList.add("HOME");
		subChieldUrlList.add("Service");
		subChieldUrlList.add("Clients");
		subChieldUrlList.add("Login");
		
		allUrlList.addAll(subChieldUrlList);
		return allUrlList;
	}
	
}


