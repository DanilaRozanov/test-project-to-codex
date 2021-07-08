package entity;

import javax.persistence.*;

@Entity
@Table ( name = "ROLES")
public class Role {

    @Id
    @GeneratedValue
    @Column ( name = "role_id")
    private long id;

    @Column (name = "role_name")
    private String rolename;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @OneToOne(optional = false, mappedBy="role")
    public RoleMap roleMap;
}
