package com.Carpinteria.Carpinteria.Model;

public class ProcesoEstadistico {
    private int numeroProductosFabricados;
    private int numeroEmpleados;
    private double costoTotalMateriales;
    private double costoTotalManoObra;
    private double materialDesperdiciado;
    private double materialTotalUtilizado;
    private int tiempoTotalProduccion;

    public ProcesoEstadistico(int numeroProductosFabricados, int numeroEmpleados, double costoTotalMateriales, double costoTotalManoObra, double materialDesperdiciado, double materialTotalUtilizado, int tiempoTotalProduccion) {
        this.numeroProductosFabricados = numeroProductosFabricados;
        this.numeroEmpleados = numeroEmpleados;
        this.costoTotalMateriales = costoTotalMateriales;
        this.costoTotalManoObra = costoTotalManoObra;
        this.materialDesperdiciado = materialDesperdiciado;
        this.materialTotalUtilizado = materialTotalUtilizado;
        this.tiempoTotalProduccion = tiempoTotalProduccion;
    }

    public int getNumeroProductosFabricados() {
        return numeroProductosFabricados;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public double getCostoTotalMateriales() {
        return costoTotalMateriales;
    }

    public double getCostoTotalManoObra() {
        return costoTotalManoObra;
    }

    public double getMaterialDesperdiciado() {
        return materialDesperdiciado;
    }

    public double getMaterialTotalUtilizado() {
        return materialTotalUtilizado;
    }

    public int getTiempoTotalProduccion() {
        return tiempoTotalProduccion;
    }
}