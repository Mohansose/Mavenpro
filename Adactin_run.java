package com.Maven_Pro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Adactin.co.Parent_pom;

public class Adactin_run extends Base_Class {
	public static WebDriver driver=Base_Class.Launchbrowser_and_url();
public static void main(String[] args) throws IOException {
	geturl("https://adactinhotelapp.com/");
	Windowmax();
	Parent_pom a=new Parent_pom(driver);
	Sendkeys(a.getA().getUsername(),File_Read_Manager.getInstance().getInstanceA().getusername());
	Sendkeys(a.getA().getPassword(),File_Read_Manager.getInstance().getInstanceA().getpassword());
	ClickonElement(a.getA().getLogin());
	Dropdown(a.getB().getLocation(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue1());
	Dropdown(a.getB().getHotel(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue2());
	Dropdown(a.getB().getRoomtype(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue3());
	Dropdown(a.getB().getRoomno(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue4());
	Sendkeys(a.getB().getCheckin(),File_Read_Manager.getInstance().getInstanceA().getinputvalue5());
	Sendkeys(a.getB().getCheckout(),File_Read_Manager.getInstance().getInstanceA().getinputvalue6());
	ClickonElement(a.getB().getAdultroom());
	Dropdown(a.getB().getAdultroom(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue4());
	Dropdown(a.getB().getChildroom(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue4());
	ClickonElement(a.getB().getSubmit());
	ClickonElement(a.getC().getFeasiblehotel());
	ClickonElement(a.getC().getCOntinue());
	Sendkeys(a.getD().getFirstname(),File_Read_Manager.getInstance().getInstanceA().getinputvalue7());
	Sendkeys(a.getD().getLastname(),File_Read_Manager.getInstance().getInstanceA().getinputvalue8());
	Sendkeys(a.getD().getAddress(),File_Read_Manager.getInstance().getInstanceA().getinputvalue9());
	Sendkeys(a.getD().getCardno(),File_Read_Manager.getInstance().getInstanceA().getinputvalue10());
	Dropdown(a.getD().getCardtype(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue11());
	Dropdown(a.getD().getCardexpirymonth(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue12());
	Dropdown(a.getD().getCardexpiryyear(),"byvalue",File_Read_Manager.getInstance().getInstanceA().getinputvalue13());
	Sendkeys(a.getD().getCvvno(),File_Read_Manager.getInstance().getInstanceA().getinputvalue14());
	ClickonElement(a.getD().getBook());
	Threadsleep();
	JavaScript("window.scrollBy(0,500)");
	TakesScreenshot(driver,"C:\\\\Users\\\\MOHAN\\\\eclipse-workspace\\\\Maven_Pro\\\\ScreenShot\\adactin1.png");
}
}
