package com.company;

/*
Nodos de grado <= m
m = es el orden = el numero maximo de hijos que puede tener un NODO


 */
public class NodoMultiCamino {
    private Integer cantidad;
    private NodoMultiCamino ligaIzquierda;
    private NodoMultiCamino ligaCentral;
    private NodoMultiCamino ligaDerecha;
    private Integer datoKUno;
    private Integer datoKDos;

    public NodoMultiCamino(){
    }

    public NodoMultiCamino(Integer cantidad, NodoMultiCamino ligaIzquierda, NodoMultiCamino ligaCentral, NodoMultiCamino ligaDerecha, Integer datoKUno, Integer datoKDos) {
        this.cantidad = cantidad;
        this.ligaIzquierda = ligaIzquierda;
        this.ligaCentral = ligaCentral;
        this.ligaDerecha = ligaDerecha;
        this.datoKUno = datoKUno;
        this.datoKDos = datoKDos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public NodoMultiCamino getLigaIzquierda() {
        return ligaIzquierda;
    }

    public void setLigaIzquierda(NodoMultiCamino ligaIzquierda) {
        this.ligaIzquierda = ligaIzquierda;
    }

    public NodoMultiCamino getLigaCentral() {
        return ligaCentral;
    }

    public void setLigaCentral(NodoMultiCamino ligaCentral) {
        this.ligaCentral = ligaCentral;
    }

    public NodoMultiCamino getLigaDerecha() {
        return ligaDerecha;
    }

    public void setLigaDerecha(NodoMultiCamino ligaDerecha) {
        this.ligaDerecha = ligaDerecha;
    }

    public Integer getDatoKUno() {
        return datoKUno;
    }

    public void setDatoKUno(Integer datoKUno) {
        this.datoKUno = datoKUno;
    }

    public Integer getDatoKDos() {
        return datoKDos;
    }

    public void setDatoKDos(Integer datoKDos) {
        this.datoKDos = datoKDos;
    }
}
