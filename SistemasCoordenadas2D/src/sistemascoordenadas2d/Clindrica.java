
package sistemascoordenadas2d;

public class Clindrica {
 private double radio;
private double angulo; 
private double Z;

public Clindrica(double radio, double angulo, double Z) {
	
	this.radio = radio;
	this.angulo = angulo;
	this.Z = Z;	
}

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

public double getAngulo() {
	return angulo;
}

public void setAngulo(double angulo) {
	this.angulo = angulo;
}

public double getZ() {
	return Z;
}

public void setZ(double Z) {
	this.Z = Z;
}

public Clindrica() {
	
}
public Clindrica cilindrica_cart3D(double x, double y, double coordez) {
	  
	Clindrica obj = new Clindrica();
	
	x = radio * Math.sin(angulo);
    y = radio * Math.cos(angulo);
    coordez = Z;
        
    return obj;
}

public Clindrica cilindricacart3D(Carte3D Cil) {
	
    return cilindricacart3D(Cil.getX(), Cil.getY(), Cil.getZ());
    
}

        class Carte3D {
        	private double x;
        	private double y;
        	private double z;
        	
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

        public Carte3D(double x, double y, double z) {
    		
    		this.x = x;
    		this.y = y;
    		this.z = z;
    		
    		 public Carte3D (){		
   		}	
    	}
        public Carte3D esferica (double r, double angx, double angy) {
    		
    		Carte3D obj = new Carte3D();
    		
    		r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    		angx = Math.acos(z / r);
    		angy = Math.atan(y / x);
    		
    		return obj;  		
    	}
    	public Carte3D esferica (Esfericas Esf) {
    		
    		return esferica(Esf.getRadio(), Esf.getAngx(), Esf.getAngy());
    		
    	}
        
   }
}
