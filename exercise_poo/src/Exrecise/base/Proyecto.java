/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exrecise.base;


import java.util.Date;
import java.util.List;

public class Proyecto {
   private String nombreClave;
   private String denominacion;
   private Date fechaInicio;
   private Date fechaFin;
   private String estado;
   private List<Proyecto> listaDeProyectos;
   private Promotor empleadoPromotor;
   private List<Tarea> listaDeTareas;
   
   public Proyecto(){
   
   }
   public Proyecto(String nombreClave, String denominacion){
       this.nombreClave = nombreClave;
       this.denominacion = denominacion;
       
   }
}
