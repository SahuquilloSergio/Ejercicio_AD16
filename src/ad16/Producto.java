package ad16;

import java.io.Serializable;

public class Producto implements Serializable {

  String cod;
  String desc;
  double prec;

    public Producto() {
    }

    public Producto(String cod, String desc, double prec) {
        this.cod = cod;
        this.desc = desc;
        this.prec = prec;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }
  
}
