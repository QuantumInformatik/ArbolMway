package com.company;

public class ArbolTriWay {
    private NodoMultiCamino raiz;

    public ArbolTriWay() {
    }

    public NodoMultiCamino getRaiz() {
        return this.raiz;
    }

    public String validarIguales(Integer datoKUno,Integer datoKdos, Integer datoBuscado){
        if (datoKUno == datoBuscado) {
            return String.valueOf(datoKUno);
        } else if (datoKdos == datoBuscado) {
            return String.valueOf(datoKdos);
        }
        return "";
    }

    public String buscar(Integer datoBuscado){
        NodoMultiCamino auxiliar = this.raiz;
        String datoHallado = "";
        while (auxiliar != null) {
            datoHallado =  this.validarIguales(auxiliar.getDatoKUno(), auxiliar.getDatoKDos() ,datoBuscado);
            if (!datoHallado.isEmpty()){
                return  datoHallado;
            }else if(datoBuscado < auxiliar.getDatoKUno()){
                // ligaIz?
                if (auxiliar.getLigaIzquierda()!=null){
                    auxiliar = auxiliar.getLigaIzquierda();
                }else{
                    return "";
                }
            }else if(datoBuscado > auxiliar.getDatoKDos()){
                // es mayor ligaDer
                if (auxiliar.getLigaDerecha()!=null){
                    auxiliar = auxiliar.getLigaDerecha();
                }else{
                    return "";
                }
            }else{
                //por logica esta entre k1 y k2 ligaCentral
                if (auxiliar.getLigaCentral()!=null){
                    auxiliar = auxiliar.getLigaCentral();
                }else{
                    return "";
                }
            }
        }
        return "";
    }

    public boolean nodoCompleto(Integer cantidad){
        return (cantidad==2);
    }

    public NodoMultiCamino ordenarClaves(Integer datoNuevo, NodoMultiCamino nodoActual, Integer caso){
        NodoMultiCamino nodoRetorno = nodoActual;
        switch (caso){
            case 0:
                nodoRetorno.setCantidad(nodoActual.getCantidad()+1);
                nodoRetorno.setDatoKUno(datoNuevo);
                nodoRetorno.setDatoKDos(nodoActual.getDatoKUno());
                break;
            case 1:
                nodoRetorno.setCantidad(nodoActual.getCantidad()+1);
                nodoRetorno.setDatoKDos(datoNuevo);
                break;
        }
        return nodoRetorno;

    }

    public boolean almacenar(Integer dato){
        boolean almacenado = false;
        NodoMultiCamino auxiliar = raiz;
        while (auxiliar != null) {
            if(dato < auxiliar.getDatoKUno()){
                // ligaIz?
                if (!this.nodoCompleto(auxiliar.getCantidad())){
                    auxiliar = this.ordenarClaves(dato ,auxiliar ,0);
                    almacenado=true;
                    auxiliar=null;
                }else{
                    if (auxiliar.getLigaIzquierda()!=null){
                        auxiliar = auxiliar.getLigaIzquierda();
                    }else{
                        NodoMultiCamino nodoCreado= this.crearNodo(dato);
                        auxiliar.setLigaIzquierda(nodoCreado);
                        almacenado=true;
                        auxiliar=null;
                    }
                }
            }else if(dato > auxiliar.getDatoKDos()){
                // es mayor ligaDer
                if (!this.nodoCompleto(auxiliar.getCantidad())){
                    auxiliar = this.ordenarClaves(dato ,auxiliar ,1);
                    almacenado=true;
                    auxiliar=null;
                }else{
                    if (auxiliar.getLigaDerecha()!=null){
                        auxiliar = auxiliar.getLigaDerecha();
                    }else{
                        NodoMultiCamino nodoCreado = this.crearNodo(dato);
                        auxiliar.setLigaDerecha(nodoCreado);
                        almacenado=true;
                        auxiliar=null;
                    }
                }

            }else{
                //por logica esta entre k1 y k2 ligaCentral
                if (auxiliar.getLigaCentral()!=null){
                    auxiliar = auxiliar.getLigaCentral();
                }else{
                    NodoMultiCamino nodoCreado= this.crearNodo(dato);
                    auxiliar.setLigaCentral(nodoCreado);
                    almacenado=true;
                    auxiliar=null;

                }
            }
        }
        return almacenado;

    }

    public void mostrarArbol(){

    }

    public boolean insertar(Integer dato){
        boolean registrado = false;
        if (this.getRaiz()!=null){
            // ya hay raiz, ingreselo normalmente
            // pero antes buscar a ver si ya esta.
            if (this.buscar(dato).isEmpty()){
                // no existe, se puede almacenar
                registrado = this.almacenar(dato);
            }
        }else{
            //no hay nada
            this.asigarRaiz(dato);
            registrado=true;
        }

        return registrado;
    }

    public void asigarRaiz(Integer dato){
       this.raiz= this.crearNodo(dato);

    }

    public NodoMultiCamino crearNodo(Integer datoInsertar){
        NodoMultiCamino nodoCrear = new NodoMultiCamino();
        nodoCrear.setCantidad(1);
        nodoCrear.setDatoKUno(datoInsertar);
        nodoCrear.setDatoKDos(datoInsertar);
        nodoCrear.setLigaIzquierda(null);
        nodoCrear.setLigaCentral(null);
        nodoCrear.setLigaDerecha(null);

        return nodoCrear;

    }


}
