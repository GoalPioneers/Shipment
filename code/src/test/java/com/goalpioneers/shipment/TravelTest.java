package test.java.com.goalpioneers.shipment;


import main.java.com.goalpioneers.shipment.storage.algorithms.TravelStorage;
import org.junit.jupiter.api.Test;


public class TravelTest
{
	@Test
	void search()
	{
		String pathRoot = "/home/madsen/dataset/custom001";
		TravelStorage travel = new TravelStorage( pathRoot );
		travel.list();
	}
}
