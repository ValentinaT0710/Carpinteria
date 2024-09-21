package com.Carpinteria.Carpinteria.Controller;

import java.util.ArrayList;
import java.util.List;

import com.Carpinteria.Carpinteria.Model.ProcesoEstadistico;

public class Estadistica {
    private String descripcion;
    private double valor;

    public Estadistica(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    /*Valores aleatorios generados ya predefinidos*/
    public static ProcesoEstadistico generarProceso() {
        return new ProcesoEstadistico(
                2000,
                15,
                450000,
                150000,
                300,
                30000,
                60
        );
    }

    public static List<Estadistica> generarEstadisticas(ProcesoEstadistico proceso) {
        List<Estadistica> estadisticas = new ArrayList<>();

        /*Productividad por empleado*/
        double productividadPorEmpleado = (double) proceso.getNumeroProductosFabricados() / proceso.getNumeroEmpleados();
        estadisticas.add(new Estadistica("Productividad por empleado", productividadPorEmpleado));

        /*Costo por producto*/
        double costoPromedioPorProducto = (proceso.getCostoTotalMateriales() + proceso.getCostoTotalManoObra()) / proceso.getNumeroProductosFabricados();
        estadisticas.add(new Estadistica("Costo promedio por producto", costoPromedioPorProducto));

        /*Porcentaje de desperdicio*/
        double porcentajeDesperdicio = (proceso.getMaterialDesperdiciado() / proceso.getMaterialTotalUtilizado()) * 100;
        estadisticas.add(new Estadistica("Porcentaje de desperdicio de material", porcentajeDesperdicio));

        /*Tiempo promedio de produccion*/
        double tasaProduccionPorHora = (double) proceso.getTiempoTotalProduccion() / proceso.getNumeroProductosFabricados();
        estadisticas.add(new Estadistica("Tasa de producción por hora", tasaProduccionPorHora));

        return estadisticas;
    }
}

