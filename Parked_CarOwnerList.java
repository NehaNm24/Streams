import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parked_CarOwnerList {
	 
	
	
	enum floor{
		f1,f2,f3;
	}

	enum section{
		s1,s2,s3,s4;
	}

	ArrayList<Parked_CarOwner_Details> p=new ArrayList<>();
 HashMap<section,ArrayList<Parked_CarOwner_Details>> secmap=new HashMap<>();
 HashMap<floor,HashMap<section,ArrayList<Parked_CarOwner_Details>>> flrmap=new HashMap<>();
 

 
	String add_new_car(Parked_CarOwner_Details obj) {
		p.add(obj);
		secmap.put(section.s1,p);
		flrmap.put(floor.f1,secmap);
		return "added";
		
	}
	
	String remove_car(Parked_CarOwner_Details obj) {
		p.remove(obj);
		return "Removed";
		
	}
	
	String get_parked_car_location(Parked_CarOwner_Details obj) {
		String section="",floor="";
			
		 for(Map.Entry entry: secmap.entrySet()){
	            if(obj.equals(entry.getValue())){
	                 section = entry.getKey().toString();
	                System.out.println("section : "+section);
	                
	                for(Map.Entry entry2: flrmap.entrySet())
	                {
	    	            if(obj.equals(entry2.getValue()))
	    	            {
	    	                floor = (String) entry2.getKey();
	    	                System.out.println("floor : "+floor);
	                break; 
	            }
	        }


	
		
	}
	        }
	        return "Floor:"+floor+"  Section is : "+section;
	}

}
