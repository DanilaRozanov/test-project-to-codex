package entity;

import javax.persistence.*;

@Entity
@Table ( name = "ROLEMAP")
public class RoleMap {

    @Id
    @GeneratedValue
    @Column (name = "rolemap_id")
    private long id;

    @Column
    private long role_id;

    @Column
    private long user_id;

    public RoleMap() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="role_id", unique = true, nullable = false, updatable = false)
    private Role role;

    @OneToOne(optional = false)
    @JoinColumn(name="user_id", unique = true, nullable = false, updatable = false)
    private User user;
}
