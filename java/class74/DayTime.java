public class DayTime { 
    public static void main(String[] args) {
        int hour = 18; 
        if (hour < 12) { 
            System.out.println("Bom dia!"); 
            System.out.println("Sao " + hour + " horas da manha"); 
        }else if(hour > 12 && hour < 18){ 
            System.out.println("Boa tarde!"); 
            System.out.println("Sao " + hour + " horas da tarde"); 
        }else{ System.out.println("Boa noite!"); 
            System.out.println("Sao " + hour + " horas da noite"); 
        } 
    } 
}

