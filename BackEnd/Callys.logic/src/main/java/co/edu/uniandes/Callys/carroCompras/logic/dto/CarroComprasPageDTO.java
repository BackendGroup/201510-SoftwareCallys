package co.edu.uniandes.Callys.carroCompras.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarroComprasPageDTO {
       
    private Long totalRecords;

    private List<CarroComprasDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<CarroComprasDTO> getRecords() {
        return records;
    }

    public void setRecords(List<CarroComprasDTO> records) {
        this.records = records;
    }
}
