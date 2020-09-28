package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "catalog_case")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatalogCase {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long case_id;
    private long catalog_id;
    private long company_unit_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;


}
