package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long auth_id;
    private String name;
    private String full_name;
    private String surname;
    private String second_name;
    private String status;
    private long company_unit_id;
    private String password;
    private long last_login_timestamp;
    private String iin;
    private boolean is_active;
    private boolean is_activated;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
