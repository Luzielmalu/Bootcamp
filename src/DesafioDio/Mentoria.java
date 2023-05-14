package DesafioDio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
   
   private LocalDate data;

   public double calcularXp(){
    return XP_PADRAO + 20d;
   }

   public LocalDate getData(){
    return data;
   }
   public void setData(LocalDate data){
    this.data = data;
   }

   public String toString(){
    return "mentoria{" +
    "titulo='" + getTitulo() + '\'' +
    ", descricao='" + getDescricao() + '\'' +
    ", data='" + data + 
    '}';
   }
}


