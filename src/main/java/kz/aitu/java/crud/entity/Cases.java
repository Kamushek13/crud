package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table (name = "cases")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cases {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String case_number;
    private String tom_number;
    private String title_ru;
    private String title_kz;
    private String title_en;
    private long start_timestamp;
    private long finish_timestamp;
    private long page_count;
    private boolean eds_signed;
    private Text eds_signature;
    private boolean naf_sent;
    private boolean is_deleted;
    private boolean is_limited;
    private String hash;
    private long version;
    private String version_id;
    private boolean is_active;
    private String note;
    private long location_id;
    private long case_index_id;
    private String record_id;
    private long remove_id;
    private long company_unit_id;
    private String case_address_blockchain;
    private long add_blockchain_timestamp;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
