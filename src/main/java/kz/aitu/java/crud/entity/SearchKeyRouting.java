package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "search_key_routing")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchKeyRouting {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long search_key_id;
    private String table_name;
    private long table_id;
    private String type;
}
