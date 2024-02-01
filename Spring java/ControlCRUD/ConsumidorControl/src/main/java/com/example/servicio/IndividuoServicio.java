package com.example.servicio;

import com.example.domain.Individuo;
import java.util.List;


public interface IndividuoServicio {
    
    //Metodos CRUD
    public List<Individuo> listaIndividuo();
    public void salvar(Individuo individuo);
    public void borrar(Individuo individuo);
    public Individuo localizarIndividuo(Individuo individuo); 
    
}
