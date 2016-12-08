package com.chenyun.date;

import javax.persistence.*;

/**
 * Created by thomas.wang on 2016/12/6.
 */
@Entity
@Table(name = "acess", schema = "acess", catalog = "")
public class AcessEntity {
    private int asId;
    private String asAcess;
    private String asName;
    private String asAges;

    @Id
    @Column(name = "as_id")
    public int getAsId() {
        return asId;
    }

    public void setAsId(int asId) {
        this.asId = asId;
    }

    @Basic
    @Column(name = "as_acess")
    public String getAsAcess() {
        return asAcess;
    }

    public void setAsAcess(String asAcess) {
        this.asAcess = asAcess;
    }

    @Basic
    @Column(name = "as_name")
    public String getAsName() {
        return asName;
    }

    public void setAsName(String asName) {
        this.asName = asName;
    }

    @Basic
    @Column(name = "as_ages")
    public String getAsAges() {
        return asAges;
    }

    public void setAsAges(String asAges) {
        this.asAges = asAges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcessEntity that = (AcessEntity) o;

        if (asId != that.asId) return false;
        if (asAcess != null ? !asAcess.equals(that.asAcess) : that.asAcess != null) return false;
        if (asName != null ? !asName.equals(that.asName) : that.asName != null) return false;
        if (asAges != null ? !asAges.equals(that.asAges) : that.asAges != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = asId;
        result = 31 * result + (asAcess != null ? asAcess.hashCode() : 0);
        result = 31 * result + (asName != null ? asName.hashCode() : 0);
        result = 31 * result + (asAges != null ? asAges.hashCode() : 0);
        return result;
    }
}
