package com.example.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.PrjEntities;
import com.example.demo.repositories.PrjRepositories;

@Service
public class PrjServicies {
   
   private final PrjRepositories colaboradorRepository;
   
   @Autowired
   public PrjServicies(PrjRepositories colaboradorrepository) {
       this.colaboradorRepository = colaboradorrepository;
   }
   
   //Criação do produto
   public PrjEntities saveColaborador(PrjEntities PrjEntities) {
       return colaboradorRepository.save(PrjEntities);
   }
   
   //Buscar produto
   public PrjEntities getColaboradorByeId(Long id) {
       return colaboradorRepository.findById(id).orElse(null);
   }
   
   
   //Procurar todos os produtos
   public List<PrjEntities> getAllColaborador(){
       return colaboradorRepository.findAll();
   }
   
   //Excluir os produtos
   public void deleteColaborador(Long id) {
       colaboradorRepository.deleteById(id);
       
   }
}
