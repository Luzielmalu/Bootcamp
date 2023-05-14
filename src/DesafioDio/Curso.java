package DesafioDio;

import java.time.LocalDate;

public class Curso extends Conteudo {
   
   private int cargaHoraria;

   public double calcularXp(){
   return XP_PADRAO * cargaHoraria;
   }

   public int getCargaHoraria(){
    return cargaHoraria;
   }
   public void setCargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
   }


   public String toString(){
    return "curso{" +
    "titulo='" + getTitulo() + '\'' +
    ", descricao='" + getDescricao() + '\'' +
    ", cargaHoraria='" + cargaHoraria + 
    '}';

    
   }
}

