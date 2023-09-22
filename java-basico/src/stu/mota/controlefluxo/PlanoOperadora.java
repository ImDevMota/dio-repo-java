package stu.mota.controlefluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; 

        switch (plano) {
            case "B":{
                System.out.println("100 minutos de ligação.");
                break;
            } 
            case "M":{
                System.out.println("Whats e Insta ilimitados");
                break;
            }
            case "T":{
                System.out.println("5Gb de Youtube.");
                break;
            }
        }
    }
}
