package entity;

import javax.persistence.*;

@Entity
@Table ( name = "ITEMS")
public class Item {

    @Id
    @GeneratedValue
    @Column( name = "item_id",nullable = false)
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToOne(optional = false, mappedBy="item")
    public TagMap tagMap;
}
