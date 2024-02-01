package com.example.servicio;

import com.example.dao.IndividuoDao;
import com.example.domain.Individuo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class IndividuoServicioImp implements IndividuoServicio {

    @Autowired
    private IndividuoDao individuoDao;
    
    @Override
    @Transactional(readOnly = true)// solo lectura
    public List<Individuo> listaIndividuo() {
        return (List<Individuo>) individuoDao.findAll();
    }

    @Transactional
    @Override
    public void salvar(Individuo individuo) {
        individuoDao.save(individuo);
    }

    @Transactional
    @Override
    public void borrar(Individuo individuo) {
        individuoDao.delete(individuo);
    }

    @Transactional(readOnly = true)
    @Override
    public Individuo localizarIndividuo(Individuo individuo) {
        return individuoDao.findById(individuo.getId_individuo()).orElse(null);
    }
    
    
}
