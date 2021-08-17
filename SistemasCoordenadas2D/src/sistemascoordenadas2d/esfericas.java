package sistemascoordenadas2d;

public class esfericas {

    double radio;
    double angx;
    double angy;
    
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAngx() {
		return angx;
	}
	public void setAngx(double angx) {
		this.angx = angx;
	}
	public double getAngy() {
		return angy;
	}
	public void setAngy(double angy) {
		this.angy = angy;
	}
public esfericas(double radio, double angx, double angy) {
		
		this.radio = radio;
		this.angx = angx;
		this.angy = angy;
		
	}
public esfericas() {
	
}
     public esfericas esfericascarte3d (double x, double y, double z) {
	
	esfericas obj = new esfericas();
	
	x = radio * Math.sin(angx) * Math.cos(angy);
	y = radio * Math.sin(angx) * Math.sin(angy);
	z = radio * Math.cos(angx);
	return obj;
	
}
 	public esfericas esfericascartes3d (Cart3D esf) {
		
		 return esfericascarte3d(esf.getX(), esf.getY(), esf.getZ());
		
	}
 	class Cart3D {
 		
 		double x;
 		double y;
 		double z;
 		
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		public double getZ() {
			return z;
		}
		public void setZ(double z) {
			this.z = z;
		}
 		
 public Cart3D(double x,double y, double z) {
	 this.x=x;
	 this.y=y;
	 this.z=z;
 }	
 public Cart3D (){		
	}		
	public Cart3D cilindrica (double r, double angulo, double Z) {
		
		Cart3D obj = new Cart3D();
		
		r = Math.sqrt(Math.pow(x, 2));
		angulo = Math.pow(Math.tan(y / z), -1);
		Z = z;
		
	return obj;		
	}
	
	public Cart3D cilindrica (Clindrica cil) {
		
		return cilindrica(cil.getAngulo(), cil.getRadio(), cil.getZ());
		
	}
}
}