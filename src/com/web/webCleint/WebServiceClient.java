package com.web.webCleint;

import java.rmi.RemoteException;

import com.cdyne.ws.WeatherWS.ForecastReturn;
import com.cdyne.ws.WeatherWS.WeatherSoapProxy;

public class WebServiceClient {

	public static void main(String ar[]) throws RemoteException{
		System.out.println("Hello World");

		WeatherSoapProxy proxy = new WeatherSoapProxy();
		String zip = "08536";

		ForecastReturn result = proxy.getCityForecastByZIP(zip);
		System.out.println("test "+result.getCity());
	}
}
