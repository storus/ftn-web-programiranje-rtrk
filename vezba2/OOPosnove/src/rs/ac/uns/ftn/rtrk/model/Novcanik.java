package rs.ac.uns.ftn.rtrk.model;

import java.util.List;
import java.util.ArrayList ;

public class Novcanik {
	
  List<String> sadrzaj = new ArrayList<>();

  public boolean hasItem(String item)
  {
	 return sadrzaj.contains(item);
  } 
  
  
}
