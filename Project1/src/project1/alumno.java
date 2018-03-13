package project1;

public class alumno {
    String sNombre ="JOHN";
    String sApellido ="Maquera Delgado";
    String sFechadenacimiento="22/08/1977";
    

    public alumno(String sNombre, String sApellido, String sFechadenacimiento, String scodigo, String ssexo,
                  int nEdad) {
        super();
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.sFechadenacimiento = sFechadenacimiento;
        this.scodigo = scodigo;
        this.ssexo = ssexo;
        this.nEdad = nEdad;
    }
    String scodigo="2010225245";
    String ssexo="Masculino";

    public alumno(String sNombre,String ssexo,
                  int nEdad, String sApellido,String scodigo
                  , String sFechadenacimiento){
        super();
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.nEdad = nEdad;
        this.sNombre = sFechadenacimiento;
        this.scodigo= scodigo;
        this.ssexo= ssexo;
    }
    
    public void setSsexo(String ssexo) {
        this.ssexo = ssexo;
    }

    public String getSsexo() {
        return ssexo;
    }
    
    
    
    
    
    
    public void setScodigo(String scodigo) {
        this.scodigo = scodigo;
    }

    public String getScodigo(){
        return scodigo;
    }




    public void setSFechadenacimiento(String sFechadenacimiento) {
        this.sFechadenacimiento = sFechadenacimiento;
    }

    public String getSFechadenacimiento() {
        return sFechadenacimiento;
    }





    public void setSApellido(String sApellido){
        this.sApellido= sApellido;
    }

    public String getSApellido(){
        return sApellido;
    }

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getNEdad() {
        return nEdad;
    }
    int nEdad ;
    public alumno() {
        super();
    }
    public String saludoBienvenido(String psNombre){
        return psNombre + "John";
    }
    public static void main(String[] args) {
        alumno myAlumno = new alumno();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.saludoBienvenido("Hola mundo!!!. bienbenido"));

        }

    }
}