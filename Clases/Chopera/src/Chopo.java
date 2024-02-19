public class Chopo {
    private double altura; //3-6-9
    private double diametro; //15-30-45
    private int edad; // 1-2-3

    public Chopo(){
        this.altura = 0;
        this.diametro = 0;
        this.edad = 0;
    }
    public Chopo(double altura, double diametro, int edad){
        this.altura = altura;
        this.setAltura(altura);
        this.diametro = diametro;
        this.setDiametro(diametro);
        this.edad = edad;
        this.setEdad(edad);
    }
    public Chopo(Chopo c){
        this.altura = c.altura;
        this.diametro = c.diametro;
        this.edad = c.edad;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getDiametro(){
        return this.diametro;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setAltura(double altura){
        if(altura > 0) this.altura = altura;
    }
    public void setDiametro(double diametro){
        if(diametro > 0) this.diametro = diametro;
    }
    public void setEdad(int edad){
        if(edad > 0) this.edad = edad;
    }
    public String toStringBonito(){
        return "El chopo tiene " + this.edad + " años de edad ," + " su altura es de " + this.altura + " y tiene un diametro de "
        + this.diametro;
    }
    public String toString(){
        return "[ " + this.edad + "-"+ this.altura + "-" + this.diametro + " ]";
    }
    public static void main(String[] args){
        Chopo chopo1 = new Chopo();
        System.out.println(chopo1);
    }
}
