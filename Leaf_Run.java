package com.Maven_Pro;

import org.openqa.selenium.WebDriver;

import Leafground.co.Homepage1;

public class Leaf_Run extends Base_Class{
	public static WebDriver driver=Base_Class.Launchbrowser_and_url();
public static void main(String[] args) {
	geturl("https://www.facebook.com/");
	Windowmax();
	Homepage1 l=new Homepage1(driver);
	Sendkeys(l.getUsername(),"9894694473");
	Sendkeys(l.getPassword(),"66426725moh");
	ClickonElement(l.getLogin());
	ClickonElement(l.getSettings());
	ClickonElement(l.getLogout());

	
}
}
