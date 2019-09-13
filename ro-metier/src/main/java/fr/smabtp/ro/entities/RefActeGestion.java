package fr.smabtp.ro.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A RefActeGestion.
 */

@Entity
@Table(name = "ref_acte_gestion")
public class RefActeGestion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "rag_code")
    private String ragCode;

    @Column(name = "rag_lib_court")
    private String ragLibCourt;

    @Column(name = "rag_lib_long")
    private String ragLibLong;

    @Column(name = "rag_comm")
    private String ragComm;

    @OneToMany(mappedBy = "refActeGestion")
    private Set<ActeGestionDelai> acteGestionDelais = new HashSet();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove


    public String getRagCode() {
        return ragCode;
    }

    public RefActeGestion ragCode(String ragCode) {
        this.ragCode = ragCode;
        return this;
    }

    public void setRagCode(String ragCode) {
        this.ragCode = ragCode;
    }

    public String getRagLibCourt() {
        return ragLibCourt;
    }

    public RefActeGestion ragLibCourt(String ragLibCourt) {
        this.ragLibCourt = ragLibCourt;
        return this;
    }

    public void setRagLibCourt(String ragLibCourt) {
        this.ragLibCourt = ragLibCourt;
    }

    public String getRagLibLong() {
        return ragLibLong;
    }

    public RefActeGestion ragLibLong(String ragLibLong) {
        this.ragLibLong = ragLibLong;
        return this;
    }

    public void setRagLibLong(String ragLibLong) {
        this.ragLibLong = ragLibLong;
    }

    public String getRagComm() {
        return ragComm;
    }

    public RefActeGestion ragComm(String ragComm) {
        this.ragComm = ragComm;
        return this;
    }

    public void setRagComm(String ragComm) {
        this.ragComm = ragComm;
    }

    public Set<ActeGestionDelai> getActeGestionDelais() {
        return acteGestionDelais;
    }

    public RefActeGestion acteGestionDelais(Set<ActeGestionDelai> acteGestionDelais) {
        this.acteGestionDelais = acteGestionDelais;
        return this;
    }

    public RefActeGestion addActeGestionDelai(ActeGestionDelai acteGestionDelai) {
        this.acteGestionDelais.add(acteGestionDelai);
        acteGestionDelai.setRefActeGestion(this);
        return this;
    }

    public RefActeGestion removeActeGestionDelai(ActeGestionDelai acteGestionDelai) {
        this.acteGestionDelais.remove(acteGestionDelai);
        acteGestionDelai.setRefActeGestion(null);
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

        RefActeGestion that = (RefActeGestion) o;

        return new EqualsBuilder()
                .append(getRagCode(), that.getRagCode())
                .append(getRagLibCourt(), that.getRagLibCourt())
                .append(getRagLibLong(), that.getRagLibLong())
                .append(getRagComm(), that.getRagComm())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getRagCode())
                .append(getRagLibCourt())
                .append(getRagLibLong())
                .append(getRagComm())
                .toHashCode();
    }

    @Override
    public String toString() {
        return "RefActeGestion{" +

                ", ragCode='" + getRagCode() + "'" +
                ", ragLibCourt='" + getRagLibCourt() + "'" +
                ", ragLibLong='" + getRagLibLong() + "'" +
                ", ragComm='" + getRagComm() + "'" +
                "}";
    }
}
