package fr.smabtp.ro.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A RefGroupeActivite.
 */

@Entity
@Table(name = "ref_groupe_activite")
public class RefGroupeActivite implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "rga_code")
    private String rgaCode;

    @Column(name = "rga_lib_court")
    private String rgaLibCourt;

    @Column(name = "rga_lib_long")
    private String rgaLibLong;

    @Column(name = "rga_comm")
    private String rgaComm;

    @OneToMany(mappedBy = "refGroupeActivite")
    private Set<ActeGestionDelai> acteGestionDelais = new HashSet();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove


    public String getRgaCode() {
        return rgaCode;
    }

    public RefGroupeActivite rgaCode(String rgaCode) {
        this.rgaCode = rgaCode;
        return this;
    }

    public void setRgaCode(String rgaCode) {
        this.rgaCode = rgaCode;
    }

    public String getRgaLibCourt() {
        return rgaLibCourt;
    }

    public RefGroupeActivite rgaLibCourt(String rgaLibCourt) {
        this.rgaLibCourt = rgaLibCourt;
        return this;
    }

    public void setRgaLibCourt(String rgaLibCourt) {
        this.rgaLibCourt = rgaLibCourt;
    }

    public String getRgaLibLong() {
        return rgaLibLong;
    }

    public RefGroupeActivite rgaLibLong(String rgaLibLong) {
        this.rgaLibLong = rgaLibLong;
        return this;
    }

    public void setRgaLibLong(String rgaLibLong) {
        this.rgaLibLong = rgaLibLong;
    }

    public String getRgaComm() {
        return rgaComm;
    }

    public RefGroupeActivite rgaComm(String rgaComm) {
        this.rgaComm = rgaComm;
        return this;
    }

    public void setRgaComm(String rgaComm) {
        this.rgaComm = rgaComm;
    }

    public Set<ActeGestionDelai> getActeGestionDelais() {
        return acteGestionDelais;
    }

    public RefGroupeActivite acteGestionDelais(Set<ActeGestionDelai> acteGestionDelais) {
        this.acteGestionDelais = acteGestionDelais;
        return this;
    }

    public RefGroupeActivite addActeGestionDelai(ActeGestionDelai acteGestionDelai) {
        this.acteGestionDelais.add(acteGestionDelai);
        acteGestionDelai.setRefGroupeActivite(this);
        return this;
    }

    public RefGroupeActivite removeActeGestionDelai(ActeGestionDelai acteGestionDelai) {
        this.acteGestionDelais.remove(acteGestionDelai);
        acteGestionDelai.setRefGroupeActivite(null);
        return this;
    }

    public void setActeGestionDelais(Set<ActeGestionDelai> acteGestionDelais) {
        this.acteGestionDelais = acteGestionDelais;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        RefGroupeActivite that = (RefGroupeActivite) o;

        return new EqualsBuilder()
                .append(getRgaCode(), that.getRgaCode())
                .append(getRgaLibCourt(), that.getRgaLibCourt())
                .append(getRgaLibLong(), that.getRgaLibLong())
                .append(getRgaComm(), that.getRgaComm())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getRgaCode())
                .append(getRgaLibCourt())
                .append(getRgaLibLong())
                .append(getRgaComm())
                .toHashCode();
    }

    @Override
    public String toString() {
        return "RefGroupeActivite{" +

                ", rgaCode='" + getRgaCode() + "'" +
                ", rgaLibCourt='" + getRgaLibCourt() + "'" +
                ", rgaLibLong='" + getRgaLibLong() + "'" +
                ", rgaComm='" + getRgaComm() + "'" +
                "}";
    }
}
