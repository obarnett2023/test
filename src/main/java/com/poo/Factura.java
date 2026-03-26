package com.poo;

public class Factura {
    //MIEMBROS DE LA CLASE
    ////ATRIBUTOS
        private String numSer;
    private String numFac;
    private String cli;
    private float subTot;

    ////MÉTODOS CONSTRUCTORES
        public Factura() {
        this.numSer = "001";
        this.numFac = "0000765";
        this.cli = "Gloria";
        this.subTot = 990.00F;
    }
    public Factura(String numSer, String numFac, String cli, float subTot) {
        this.numSer = numSer;
        this.numFac = numFac;
        this.cli = cli;
        this.subTot = subTot;
    }
    ////MÉTODOS DE ACCESO (SETTER Y GETTER)
        public String getNumSer() {
        return numSer;
    }
    public void setNumSer(String numSer) {
        this.numSer = numSer;
    }
    public String getNumFac() {
        return numFac;
    }
    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }
    public String getCliente() {
        return cli;
    }
    public void setCliente(String cli) {
        this.cli = cli;
    }
    public float getSubTot() {
        return subTot;
    }
    public void setSubTot(float subTot) {
        this.subTot = subTot;
    }

    ////MÉTODOS FUNCIONALES
    public float calcularIgv() {
        return (float) (this.subTot * 0.18);
    }

    public void imprimirFactura() {
        System.out.println("Nro de serie: "+numSer);
        System.out.println("Nro de factura: "+numFac);
        System.out.println("Cliente: "+cli);
        System.out.println("SubTotal: "+subTot);
        System.out.println("IGV: "+calcularIgv());
        System.out.println("Total neto: "+(subTot+calcularIgv()));
    }
}
