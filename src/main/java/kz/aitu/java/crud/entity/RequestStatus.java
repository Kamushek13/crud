package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "request_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestStatus {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long request_id;
    private String status;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
