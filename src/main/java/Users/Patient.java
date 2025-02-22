package Users;
import Register.RegistroMedico;
import Register.EPS;
import java.util.*;
public class Patient extends Person {
    private List<RegistroMedico> historiaClinica;
    private EPS eps;

    public Patient(int id, String userName, String password, String name, String lastName, String birthdate, String gender, String address, String phone, String email,EPS eps) {
        //initiate for User and Person info
        super(id, userName, password, name, lastName, birthdate, gender, address, phone, email);
        //initiate for Patient info
        this.historiaClinica = new LinkedList<>();
        this.eps = eps;
    }

    public List<RegistroMedico> getHistoriasClinica() {
        return historiaClinica;
    }

    public void setHistoriasClinica(List<RegistroMedico> historiasClinica) {
        this.historiaClinica = historiasClinica;
    }

    public EPS getEps() {
        return eps;
    }

    public void setEps(EPS eps) {
        this.eps = eps;
    }
    

    
}
