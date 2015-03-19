/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.Callys.Cliente.logic.converter;


import co.edu.uniandes.Callys.Cliente.logic.dto.ClienteDTO;
import co.edu.uniandes.Callys.Cliente.logic.entity.ClienteEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class ClienteConverter {
    
    public static ClienteDTO entity2PersistenceDTO(ClienteEntity entity) {
        if (entity != null) {
            ClienteDTO dto = new ClienteDTO();
            dto.setId(entity.getId());
            
            dto.setNombre(entity.getNombre());
            dto.setNumeroCompras(entity.getNumeroCompras());
            dto.setNumeroTargeta(entity.getNumeroTargeta());
            dto.setCodigoDeSeguridad(entity.getCodigoSeguridad());
            dto.setCarroDeCompras(entity.getCarroDecompras());
            
            return dto;
        } else {
            return null;
        }
    }

    public static ClienteEntity persistenceDTO2Entity(ClienteDTO dto) {
        if (dto != null) {
            ClienteEntity entity = new ClienteEntity();
            entity.setNombre(dto.getNombre());
            entity.setNumeroCompras(dto.getNumeroCompras());
            entity.setNumeroTargeta(dto.getNumeroTargeta());
            entity.setCodigoDeSeguridad(dto.getCodigoSeguridad());
            entity.setCarroDeCompras(dto.getCarroDecompras());

            return entity;
        } else {
            return null;
        }
    }

    public static List<ClienteDTO> entity2PersistenceDTOList(List<ClienteEntity> entities) {
        List<ClienteDTO> dtos = new ArrayList<ClienteDTO>();
        for (ClienteEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<ClienteEntity> persistenceDTO2EntityList(List<ClienteDTO> dtos) {
        List<ClienteEntity> entities = new ArrayList<ClienteEntity>();
        for (ClienteDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }   
}