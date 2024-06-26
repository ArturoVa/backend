package com.microservicios.celulares.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicios.celulares.entity.Celular;
import com.microservicios.celulares.repository.CelularDao;

@Service
public class CelularServiceImpl implements CelularService{
    @Autowired
    private CelularDao celularDao;

    @Override
    public List<Celular> findAll(){
        return (List<Celular>) celularDao.findAll();
    }  
    @Override
    public Celular save(Celular instance){
        return celularDao.save(instance);
    }
    
    @Override
    public boolean existsById(long id){
        return celularDao.existsById(id);
    }
    @Override
    public Celular findById(long id){
        return celularDao.findById(id).get();
    }
    @Override
    public void deleteById(long id){
        celularDao.deleteById(id);
    }

}
