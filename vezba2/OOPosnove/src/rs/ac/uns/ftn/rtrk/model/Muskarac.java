package rs.ac.uns.ftn.rtrk.model;

public class Muskarac {
  private static int x = 0;
  private PolniOrgan polniOrgan = new PolniOrgan();
  private Novcanik novcanik;
  
  {
	  polniOrgan = new PolniOrgan();
  }
  
  public Muskarac() {
	super();
	x++;
	// TODO Auto-generated constructor stub
  }
  
  public PolniOrgan getPolniOrgan() {
	return polniOrgan;
  }

  public void setPolniOrgan(PolniOrgan polniOrgan) {
	this.polniOrgan = polniOrgan;
  }

  public Novcanik getNovcanik() {
	return novcanik;
  }

  public void setNovcanik(Novcanik novcanik) {
	this.novcanik = novcanik;
   }
  

}
