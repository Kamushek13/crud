package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Table (name = "notification")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String object_type;
    private long object_id;
    private long company_unit_id;
    private long user_id;
    private long created_timestamp;
    private long viewed_timestamp;
    private boolean is_viewed;
    private String title;
    private String text;
    private long company_id;
}
