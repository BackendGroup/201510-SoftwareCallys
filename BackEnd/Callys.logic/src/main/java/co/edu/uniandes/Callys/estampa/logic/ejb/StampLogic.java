package co.edu.uniandes.callys.estampa.logic.ejb;

import co.edu.uniandes.callys.camiseta.logic.entity.CamisetaEntity;
import co.edu.uniandes.callys.estampa.logic.api.IStampLogic;
import co.edu.uniandes.callys.estampa.logic.converter.StampConverter;
import co.edu.uniandes.callys.estampa.logic.dto.StampDTO;
import co.edu.uniandes.callys.estampa.logic.dto.StampPageDTO;
import co.edu.uniandes.callys.estampa.logic.entity.StampEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Default
@Stateless
@LocalBean
public class StampLogic implements IStampLogic{
    
    @PersistenceContext(unitName = "CallysClassPU")
    protected EntityManager entityManager;

    @Override
    public StampDTO createStamp(StampDTO stamp) {
        StampEntity entity = StampConverter.persistenceDTO2Entity(stamp);
        entityManager.persist(entity);
        return StampConverter.entity2PersistenceDTO(entity);
    }

    @Override
    public List<StampDTO> getStamps() {
        Query q = entityManager.createQuery("select u from StampEntity u");
        return StampConverter.entity2PersistenceDTOList(q.getResultList());
    }

    @Override
    public StampPageDTO getStamps(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from StampEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from StampEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        StampPageDTO response = new StampPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(StampConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    @Override
    public StampDTO getStamp(Long id) {
        return StampConverter.entity2PersistenceDTO(entityManager.find(StampEntity.class, id));
    }

    @Override
    public void deleteStamp(Long id) {
        StampEntity entity = entityManager.find(StampEntity.class, id);
        entityManager.remove(entity);
    }

    @Override
    public void updateStamp(StampDTO stamp) {
        StampEntity entity = entityManager.merge(StampConverter.persistenceDTO2Entity(stamp));
        StampConverter.entity2PersistenceDTO(entity);
    }

    @Override
    public List<CamisetaEntity> getCamisetasStamp(StampDTO stamp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}