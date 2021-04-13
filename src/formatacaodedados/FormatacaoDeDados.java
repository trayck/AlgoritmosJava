package formatacaodedados;

public class FormatacaoDeDados {
    
    
    public static void main(String[] args) {
        
       String cpfFormatado = Mascaras.cpfFormatado("12445688892");
        System.out.println(cpfFormatado);
        
       String cnpjFormatado = Mascaras.cnpjFormatado("98765432134567");
        System.out.println(cnpjFormatado);
        
       String telFormatado = Mascaras.telFormatado("4792453265");
        System.out.println(telFormatado);

       String cepFormatado = Mascaras.cepFormatado("56784935");
        System.out.println(cepFormatado);
       
       String placaFormatado = Mascaras.placaFormatado("trs2345");
        System.out.println(placaFormatado);
}
        
}

    
       

