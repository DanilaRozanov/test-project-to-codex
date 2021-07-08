package entity;

import javax.persistence.*;

@Entity
@Table ( name = "TAGMAP")
public class TagMap {

    @Id
    @GeneratedValue
    @Column ( name = "map_id",nullable = false)
    private long id;

    @Column
    private long user_id;

    @Column
    private  long tag_id;

    public TagMap() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="item_id", unique = true, nullable = false, updatable = false)
    private Item item;

    @OneToOne(optional = false)
    @JoinColumn(name="tag_id", unique = true, nullable = false, updatable = false)
    private Tags tags;
}
