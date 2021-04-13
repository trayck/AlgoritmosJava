package formatacaodedados;

import static formatacaodedados.Mascaras.placaFormatado;
import javax.swing.text.MaskFormatter;


public class Mascaras {
 
   
    public static String cpfFormatado(String cpf) {
        char[]arrayCpf = cpf.toCharArray();
        String cpfFormatado = "";
        
        for(int i = 0 ; i < arrayCpf.length; i++){
        cpfFormatado = cpfFormatado + arrayCpf[i];    
        if (i == 2 | i == 5){
            cpfFormatado = cpfFormatado+".";
            
        }
        if (i == 8) {
            cpfFormatado = cpfFormatado+"-";
            
        }
        }
         return cpfFormatado;
    }
    public static String cnpjFormatado(String cnpj){
        
     char[]arrayCnpj = cnpj.toCharArray();
        String cnpjFormatado = "";
        
        for(int i = 0 ; i < arrayCnpj.length; i++){
        cnpjFormatado = cnpjFormatado + arrayCnpj[i];    
        if (i == 1 | i == 4){
            cnpjFormatado = cnpjFormatado+".";
            
        }
        if (i == 11) {
            cnpjFormatado = cnpjFormatado+"-";
          
        }
        if (i == 7){
            cnpjFormatado = cnpjFormatado+"/";
        }
        }
         return cnpjFormatado;
        
    }
   public static String telFormatado(String tel){
        char[]arrayTel = tel.toCharArray();
        String telFormatado = "";
        
        for(int i = 0 ; i < arrayTel.length; i++){
          
        if (i == 0 ){
            telFormatado = telFormatado+"(";
          
        }
        telFormatado = telFormatado + arrayTel[i];
        if (i == 1){
            telFormatado = telFormatado+")";
       
        }
        if (i == 5){
            telFormatado =telFormatado+ "-";
        }
        
        }
         return telFormatado;
       
       
   }

    public Mascaras() {
    }
   
   public static String cepFormatado(String cep){
       char[]arrayCep = cep.toCharArray();
        String cepFormatado = "";
        
        for(int i = 0 ; i < arrayCep.length; i++){
        cepFormatado = cepFormatado + arrayCep[i];    
        if (i == 1 ){
            cepFormatado = cepFormatado+".";
            
        }
        if (i == 4 ) {
            cepFormatado = cepFormatado+"-";
          
        }
        }
         return cepFormatado;
       
       
   }
   
   public static String placaFormatado(String placa){
      placa = placa.substring(0, 3) + "-" + placa.substring(3, 7);
       return placa.toUpperCase();
       
   }
   //novo public
   
   public static int letraContMaiusculo(String letras){
       int contadorLetraMaiuscula = 0;
       
       char[] palavraArray = letras.toCharArray();
       
       for(char c : palavraArray) {
           if(Character.isUpperCase(c)){
               contadorLetraMaiuscula++;
           }
       }
   
   




        
    
