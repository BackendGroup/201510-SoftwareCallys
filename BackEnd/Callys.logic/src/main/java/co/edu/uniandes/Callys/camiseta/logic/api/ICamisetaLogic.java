package co.edu.uniandes.Callys.camiseta.logic.api;

import co.edu.uniandes.Callys.camiseta.logic.dto.CamisetaDTO;
import co.edu.uniandes.Callys.camiseta.logic.dto.CamisetaPageDTO;
import java.util.List;

public interface ICamisetaLogic {
    
    public CamisetaDTO createCamiseta(CamisetaDTO detail);

    public List<CamisetaDTO> getCamisetas();

    public CamisetaPageDTO getCamisetas(Integer page, Integer maxRecords);

    public CamisetaDTO getCamiseta(Long id);

    public void deleteCamiseta(Long id);

    public void updateCamiseta(CamisetaDTO detail);
}
