package test.java.com.goalpioneers.shipment;


import main.java.com.goalpioneers.shipment.storage.algorithms.TravelStorage;


public class TravelTest
{
	void search()
	{
		String pathRoot = "/home/madsen/dataset/custom001";
		TravelStorage travel = new TravelStorage( pathRoot );
		travel.list();
	}
}
