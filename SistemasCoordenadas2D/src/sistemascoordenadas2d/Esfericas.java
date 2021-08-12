package sistemascoordenadas2d;

public class Esferica {

    double radio;
    double angulox;
    double anguloy;

    public Esferica() {

    }

    public Esferica(double radio, double angulox, double anguloy) {

        this.radio = radio;
        this.angulox = angulox;
        this.anguloy = anguloy;

    }

    public double getRadio() {

        return radio;

    }

    public double getAngulox() {

        return angulox;

    }

    public double getAnguloy() {

        return anguloy;

    }

    public void setRadio(double radio) {

        this.radio = radio;

    }

    public void setAngulox(double angulox) {

        this.angulox = angulox;

    }

    public void setAnguloy(double anguloy) {

        this.anguloy = anguloy;

    }



}