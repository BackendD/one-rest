package ir.nje.onerest.domain;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Id;

/**
 * Base class to drive entitiy classes from.
 * 
 * @author Hasan Karimi
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @Id
    private Long id;

    /**
     * Return the identifier of entity.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id == null ? 0 : this.id.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractEntity other = (AbstractEntity) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    private static final long serialVersionUID = 5016748046289970854L;
}