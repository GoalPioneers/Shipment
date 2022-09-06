package main.java.com.goalpioneers.shipment.storage.algorithms;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TravelStorage
{
	// Constructors
	public TravelStorage( String root )
	{
		this.property = new TravelProperty( root );
		this.settings = new TravelSettings();
	}
	
	// Variables
	private TravelProperty property;
	
	private TravelSettings settings;
	
	// Codes
	public void list()
	{
		Path rp = Paths.get( this.property.getRootPath() );
		
		try( Stream <Path> paths = Files.walk( rp ) )
		{
			for( Path current : paths.toList() )
			{
				File current_file = current.toFile();
				
				if( current_file.isDirectory() )
				{
				
				}
				
				if( current_file.isFile() )
				{
					
				}
			}
		}
		catch( IOException ex )
		{
		
		}
	}
	
	/**
	 *
	 * @return
	 */
	public boolean hasChildrenDirectories()
	{
		return false;
	}
	
	/**
	 *
	 * @return
	 */
	public boolean hasChildrenFiles()
	{
		return false;
	}
	
	// Accessors
	public TravelProperty getProperty()
	{
		return this.property;
	}
	
	public TravelSettings getSettings()
	{
		return this.settings;
	}
	
	public void setProperty( TravelProperty property )
	{
		this.property = property;
	}
	
	public void setSettings( TravelSettings settings )
	{
		this.settings = settings;
	}
}
