package ProblemaExemplo1.entites;

import java.util.Date;

public class Usuario{
    
    private String name;
    private Date instante;
    public Usuario(String name, Date instante) {
        this.name = name;
        this.instante = instante;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getInstante() {
        return instante;
    }
    public void setInstante(Date instante) {
        this.instante = instante;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}

