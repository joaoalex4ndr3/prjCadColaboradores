package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PrjEntities;
import com.example.demo.servicies.PrjServicies;

@RestController
@RequestMapping("/colaborador")
public class PrjController {
   
   private final PrjServicies PrjServicies;
   
   @Autowired
   public PrjController(PrjServicies PrjServicies) {
       this.PrjServicies = PrjServicies;
   }
   
   @PostMapping
   public PrjEntities createColaborador(@RequestBody PrjEntities colaborador) {
       return PrjServicies.saveColaborador(colaborador);
   }
   
   @GetMapping
   public List<PrjEntities> getAllColaborador(){
       return PrjServicies.getAllColaborador();
   }
   
   @GetMapping("/id")
   public PrjEntities getColaborador(@PathVariable Long id) {
       return PrjServicies.getColaboradorByeId(id);
   }
   
   @DeleteMapping("/id")
   public void deleteColaborador(@PathVariable Long id) {
       PrjServicies.deleteColaborador(id);
   }
}