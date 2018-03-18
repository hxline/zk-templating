/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package com.hxline.templating.services;

import com.hxline.templating.models.SidebarPage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public class SidebarPageConfigAjax {
	
	HashMap<String,SidebarPage> pageMap = new LinkedHashMap<String,SidebarPage>();
	public SidebarPageConfigAjax(){
		pageMap.put("fn1",new SidebarPage("","Home","https://3.bp.blogspot.com/-6Gzk96W4jxk/UibBx0yD8XI/AAAAAAAABls/Hze2iPB_RaY/s35/2013-08-01%25252B11.18.32.jpg","content/home.zul"));
		pageMap.put("fn2",new SidebarPage("","Home 2","https://3.bp.blogspot.com/-6Gzk96W4jxk/UibBx0yD8XI/AAAAAAAABls/Hze2iPB_RaY/s35/2013-08-01%25252B11.18.32.jpg","content/home2.zul"));
	}
	
	public List<SidebarPage> getPages(){
		return new ArrayList<SidebarPage>(pageMap.values());
	}
	
	public SidebarPage getPage(String name){
		return pageMap.get(name);
	}
	
}