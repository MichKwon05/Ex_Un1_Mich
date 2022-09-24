package Server;

import Client.BeanPerson;

import java.util.Scanner;
import java.util.Random;
public class MetoditosMich {
    BeanPerson persona = new BeanPerson();
    Scanner read = new Scanner(System.in);
    boolean aux = false;
    String nombre;
    String pAp;
    String sAp;
    String sexo;
    String estado;
    String curp;
    String es;
    String vocA1;
    String conA2;
    String conA1;

    String nc;

    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    String anio;
    String mes;
    String dia;
    String coNom;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///
    public String getpAp() {
        return pAp;
    }
    public void setpAp(String pAp) {
        this.pAp = pAp;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getsAp() {
        return sAp;
    }
    public void setsAp(String sAp) {this.sAp = sAp;}

    public String getEstado() {return estado; }
    public void setEstado(String estado) {this.estado = estado;}

    public String getAnio() {return anio;}
    public void setAnio(String anio) {
        this.anio = anio;
    }

    Random random = new Random();
    public void registro(){
        System.out.println("Indica tu nombre"); // Primer letra
        this.setNombre(read.nextLine().toUpperCase());
        System.out.println("Indica tu primer apellido");
        this.setpAp(read.nextLine().toUpperCase());
        System.out.println("Indica tu segundo apellido");
        this.setsAp(read.nextLine().toUpperCase());
        System.out.println("Sexo (Hombre o mujer)");
        this.setSexo(read.nextLine());
        System.out.println("Indica tu estado");
        this.setEstado(read.nextLine());
        System.out.println("Indica tu año de nacimiento");
        this.setAnio(read.nextLine());
        System.out.println("Indica tu mes de naciminto");
        this.setMes(read.nextLine());
        System.out.println("Indica tu dia de nacimiento");
        this.setDia(read.nextLine());

       // System.out.println(this.getAnio() +this.getMes()+ this.getDia());
    }

    public void datos(){
        System.out.println("Nombre(S): " + getNombre());
        System.out.println("Primer Apellido: " +getpAp());
        System.out.println("Segundo Apellido: " +getsAp());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha de Nacimiento: " +getAnio()+"-"+getMes()+"-"+getDia());

    }

    public String estadoes(){
        if (estado.equals("Aguascalientes")){
            es = "AS";
        }else if (estado.equals("BajaCalifornia")){
            estado = "BC";
        }else if (estado.equals("BajaCaliforniaSur")){
            es = "BS";
        }else if (estado.equals("Campeche")){
            es = "CC";
        }else if (estado.equals("Coahuila")){
            es = "CL";
        }else if (estado.equals("Colima")){
            es = "CM";
        }else if (estado.equals("Chiapas")){
            es = "CS";
        }else if (estado.equals("Chihuahua")){
            es = "CH";
        }else if (estado.equals("DistritoFederal")){
            es = "DF";
        }else if (estado.equals("Durango")){
            es = "DG";
        }else if (estado.equals("Guanajuato")){
            es = "GT";
        }else if (estado.equals("Guerrero")){
            es = "GR";
        }else if (estado.equals("Hidalgo")){
            es = "HG";
        }else if (estado.equals("Jalisco")){
            es = "JC";
        }else if (estado.equals("México")){
            es = "MC";
        }else if (estado.equals("Michoacan")){
            es = "MN";
        }else if (estado.equals("Morelos")){
            es = "MS";
        }else if (estado.equals("Nayarit")){
            es = "NT";
        }else if (estado.equals("Nuevo León")){
            es = "NL";
        }else if (estado.equals("Oaxaca")){
            es = "OC";
        }else if (estado.equals("Puebla")){
            es = "PL";
        }else if (estado.equals("Querétaro")){
            es = "QT";
        }else if (estado.equals("QuintanaRoo")){
            es = "QR";
        }else if (estado.equals("San Luis Potosi")){
            es = "SP";
        }else if (estado.equals("Sinaloa")){
            es = "SL";
        }else if (estado.equals("Sonora")){
            es = "SR";
        }else if (estado.equals("Tabasco")){
            es = "TC";
        }else if (estado.equals("Tamaulipas")){
            es = "TS";
        }else if (estado.equals("Tlaxcala")){
            es = "TL";
        }else if (estado.equals("Veracruz")){
            es = "VZ";
        }else if (estado.equals("Yucatan")){
            es = "YN";
        }else if (estado.equals("Zacatecas")){
            es = "ZS";
        }
        return es;
    }
    public String resulCurp(){
        System.out.println("Tu curp es: ");
        ///MO V M 98 01 19 H MC / RLG01
        //String sSubCadena = getAnio().substring(1,2);
        //PA = 2 SA = 1 Anio= u2 blah bal sexo=1 estado randomnombre randomnum

        String pletraAC = getpAp().substring(0,1);  ///Primer apellido 2

        char sAC = getsAp().charAt(0); /// Segundo apellido 1
        char nC = getNombre().charAt(0); ///Nombre 1
        String aC = getAnio().substring(2,4); /// Anio ul 2
        /// Mes
        // Dia
        char sC = getSexo().charAt(0); //Sexo
        // Estado
        // Random

        char[] pAc = pAp.toCharArray();
        for (int i = 1; i < pAc.length; i++) {
            String bus = pAc[i] + "";
            if (!bus.equals("A") && !bus.equals("E") && !bus.equals("I") && !bus.equals("O") && !bus.equals("U")){
                conA1 = String.valueOf(bus.charAt(0));
                break;
            }
        }

        char[] sAc = sAp.toCharArray(); ////comienza desde 1 por que ya se uso en el anterior
        for (int j = 1; j < sAc.length; j++) {
            String bus2 = sAc[j] + "";
            if (!bus2.equals("A") && !bus2.equals("E") && !bus2.equals("I") && !bus2.equals("O") && !bus2.equals("U")){
                conA2 = String.valueOf(bus2.charAt(0));
                break;
            }
        }

        char[] nc = nombre.toCharArray(); ////comienza desde 1 por que ya se uso en el anterior
        for (int k = 1; k <nc.length; k++) {
            String bus3 = nc[k] + "";
            if (!bus3.equals("A") && !bus3.equals("E") && !bus3.equals("I") && !bus3.equals("O") && !bus3.equals("U")){
                coNom = String.valueOf(bus3.charAt(0));
                break;
            }
        }

        char letraRan = (char)(Math.random()*26 + 'A');

        int numRan = (int) (Math.random()*10 + 1);

        curp = pletraAC + buscarPVocal()+sAC+ nC + aC + getMes()+getDia() + sC + estadoes() + conA1 +conA2 + coNom +letraRan +numRan;
        System.out.println(curp);
        System.out.println("Curp creado con exito");


       /* persona.setNombre(getNombre());
        persona.setpAp(getpAp());
        persona.setsAp(getsAp());
        persona.setSexo(getSexo());
        persona.setEstado(getEstado());
        persona.setfNac(Integer.parseInt(getAnio()+getMes()+getDia()));
        persona.setCurp(resulCurp());*/

        return curp;

    }

    public String buscarPVocal(){
        for (int x =0; x < pAp.length(); x++ ){
            String pAV = pAp.substring(x);
            if (pAV.equals("A")){
                vocA1 = pAV;
            }else if (pAV.equals("E")){
                vocA1 = pAV;
            }else if (pAV.equals("I")){
                vocA1 =pAV;
            } else if (pAV.equals("O")) {
                vocA1 =pAV;
            }else if (pAV.equals("U")) {
                vocA1 =pAV;
            }
        }
        return vocA1 ;
    }

    /*public String buscarCons(){
        for (int y =0; y < sAp.length(); y-- ) {
            String sAC = sAp.substring(y);
            ////BCDFGHJKLMNÑPQRSTUVWXYZ
            if (sAC.equals("B")) {
                conA2 = sAC;
            } else if (sAC.equals("C")) {
                conA2 = sAC;
            } else if (sAC.equals("D")) {
                conA2 = sAC;
            } else if (sAC.equals("F")) {
                conA2 = sAC;
            } else if (sAC.equals("G")) {
                conA2 = sAC;
            } else if (sAC.equals("H")) {
                conA2 = sAC;
            } else if (sAC.equals("J")) {
                conA2 = sAC;
            } else if (sAC.equals("K")) {
                conA2 = sAC;
            } else if (sAC.equals("L")) {
                conA2 = sAC;
            } else if (sAC.equals("M")) {
                conA2 = sAC;
            } else if (sAC.equals("N")) {
                conA2 = sAC;
            } else if (sAC.equals("Ñ")) {
                conA2 = sAC.replace('Ñ', 'N');
            } else if (sAC.equals("P")) {
                conA2 = sAC;
            } else if (sAC.equals("Q")) {
                conA2 = sAC;
            } else if (sAC.equals("R")) {
                conA2 = sAC;
            } else if (sAC.equals("S")) {
                conA2 = sAC;
            } else if (sAC.equals("T")) {
                conA2 = sAC;
            } else if (sAC.equals("V")) {
                conA2 = sAC;
            } else if (sAC.equals("W")) {
                conA2 = sAC;
            } else if (sAC.equals("X")) {
                conA2 = sAC;
            } else if (sAC.equals("Y")) {
                conA2 = sAC;
            } else if (sAC.equals("Z")) {
                conA2 = sAC;
            }
        }
        return conA2;
    }*/

    public boolean buscarCons(String cons){
        String[] consBus = { "B", "C", "D","F", "G", "H","J", "K", "L","M", "N", "Ñ","P", "Q", "R","S", "T", "V","W", "X", "Y","Z"};
        for (int c = 0; c < 22; c++) {
            if (cons.equals(consBus[c])) {
                aux = true;
                break;
            }
        }
        return aux;
    }

   /* public String consPA(){
        for (int x =0; x < pAp.length(); x++ ) {
            String auxPA = pAp.substring(x);

            if(buscarCons(auxPA)){
                enconCPA = auxPA;
                break;
            }
        }
        return enconCPA;
    }*/



}

