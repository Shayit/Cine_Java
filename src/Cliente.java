public class Cliente {
    String name;
    String ape;
    String fecha;

    public void setName(String name) {
        this.name = name;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void asignacion(){
        System.out.println("Señor "+name+" "+ape+" su asiento ya fue asignado para el día: "+fecha);
    }
    public void noAsignacion(){
        System.out.println("Señor "+name+" "+ape+" su asiento no fue asignado porque el asiento deseado ya está ocupado. Pruebe con otro asiento");
    }
}