package entity;

import javax.persistence.*;

@Entity
@Table ( name = "TAGS")
public class Tags {

    @Id
    @GeneratedValue
    @Column ( name = "tag_id", nullable = false)
    private long id;

    @Column ( name = "tag_name")
    private String nametag;

    public Tags() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNametag() {
        return nametag;
    }

    public void setNametag(String nametag) {
        this.nametag = nametag;
    }

    @OneToOne(optional = false, mappedBy="tags")
    public TagMap tagMap;
}
