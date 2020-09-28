package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long request_user_id;
    private long response_user_id;
    private long case_id;
    private long case_index_id;
    private String created_type;
    private String comment;
    private String status;
    private long timestamp;
    private long share_start;
    private long share_finish;
    private boolean favourite;
    private long update_timestamp;
    private long update_by;
    private String decline_note;
    private long company_unit_id;
    private long from_request_id;
}
