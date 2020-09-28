package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "search_key")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchKey {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String name;
    private long company_unit_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
