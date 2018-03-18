package com.hxline.templating.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.hxline.templating.models.SidebarPage;

public class SidebarPageConfig{
	
	HashMap<String,SidebarPage> pageMap = new LinkedHashMap<String,SidebarPage>();
	public SidebarPageConfig(){
		pageMap.put("fn1",new SidebarPage("fn1","Home","https://3.bp.blogspot.com/-6Gzk96W4jxk/UibBx0yD8XI/AAAAAAAABls/Hze2iPB_RaY/s35/2013-08-01%25252B11.18.32.jpg"
				,"index.zul"));
		pageMap.put("fn2",new SidebarPage("fn2","Home 2","https://3.bp.blogspot.com/-6Gzk96W4jxk/UibBx0yD8XI/AAAAAAAABls/Hze2iPB_RaY/s35/2013-08-01%25252B11.18.32.jpg"
				,"index2.zul"));
	}
	
	public List<SidebarPage> getPages(){
		return new ArrayList<SidebarPage>(pageMap.values());
	}
	
	public SidebarPage getPage(String name){
		return pageMap.get(name);
	}
	
}