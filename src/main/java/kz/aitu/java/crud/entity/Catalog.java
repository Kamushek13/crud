package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalIdCache;
import org.hibernate.service.spi.InjectService;

import javax.persistence.*;

@Entity
@Table (name = "catalog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catalog {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String name_ru;
    private String name_kz;
    private String name_en;
    private long parent_id;
    private long company_unit_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
