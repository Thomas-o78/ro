package fr.smabtp.ro.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A RefActivite.
 */
@Entity
@Table(name = "ref_activite")
public class RefActivite implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "rac_code")
    private String racCode;

    @Column(name = "rac_lib_court")
    private String racLibCourt;

    @Column(name = "rac_lib_long")
    private String racLibLong;

    @Column(name = "rac_comm")
    private String racComm;



    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove


    public String getRacCode() {
        return racCode;
    }

    public RefActivite racCode(String racCode) {
        this.racCode = racCode;
        return this;
    }

    public void setRacCode(String racCode) {
        this.racCode = racCode;
    }

    public String getRacLibCourt() {
        return racLibCourt;
    }

    public RefActivite racLibCourt(String racLibCourt) {
        this.racLibCourt = racLibCourt;
        return this;
    }

    public void setRacLibCourt(String racLibCourt) {
        this.racLibCourt = racLibCourt;
    }

    public String getRacLibLong() {
        return racLibLong;
    }

    public RefActivite racLibLong(String racLibLong) {
        this.racLibLong = racLibLong;
        return this;
    }

    public void setRacLibLong(String racLibLong) {
        this.racLibLong = racLibLong;
    }

    public String getRacComm() {
        return racComm;
    }

    public RefActivite racComm(String racComm) {
        this.racComm = racComm;
        return this;
    }

    public void setRacComm(String racComm) {
        this.racComm = racComm;
    }


    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        RefActivite that = (RefActivite) o;

        return new EqualsBuilder()
                .append(getRacCode(), that.getRacCode())
                .append(getRacLibCourt(), that.getRacLibCourt())
                .append(getRacLibLong(), that.getRacLibLong())
                .append(getRacComm(), that.getRacComm())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getRacCode())
                .append(getRacLibCourt())
                .append(getRacLibLong())
                .append(getRacComm())
                .toHashCode();
    }

    @Override
    public String toString() {
        return "RefActivite{" +

                ", racCode='" + getRacCode() + "'" +
                ", racLibCourt='" + getRacLibCourt() + "'" +
                ", racLibLong='" + getRacLibLong() + "'" +
                ", racComm='" + getRacComm() + "'" +
                "}";
    }
}
