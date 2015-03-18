/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.Callys.catalogo.logic.entity;
/**
 *
 * @author estudiante
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CatalogoEntity {

    @Id
    @GeneratedValue(generator = "Catalogo")
    private Long id;
    private String name;
    private Integer numElementos;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumeroElementos() {
        return numElementos;
    }

    public void setNumeroElementos(Integer nNum) {
        this.numElementos = nNum;
    }
}
