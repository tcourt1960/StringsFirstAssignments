
/**
 * Write a description of Part1 here.
 * 
 * @author Tom Courtney
 * @version Jan 11, 2017
 */
public class Part1 {
    public String FindSimpleGene(String dna){
        String result ="";
        
        int startIndex = dna.indexOf("ATG");
            System.out.println("Start Index is " + startIndex);
            if (startIndex == -1) {
                return "";
            }
        
        int tailIndex = dna.indexOf("TAA",startIndex+3);
            System.out.println("Tail Index is " + tailIndex);
            if (tailIndex == -1) {
                return "";
            }
        
            while (tailIndex != -1) {
            //Check if (tailIndex - startIndex) is a multiple of 3
            if((tailIndex - startIndex) % 3 == 0) {
               //If so, the text between startIndex and tailIndex + 3 is your answer
               return dna.substring(startIndex, tailIndex +3);
            }
            //If not, update currIndex to the index of the next TAA, starting from (currIndex+1)
            else {
                  tailIndex = dna.indexOf("TAA", tailIndex + 1);
            }
        }
        //Your answer is the empty string
        return "";
       
    }
    
    
    public void testSimpleGene() {
    //Test 1: DNA with no "ATG"
      
    String dna = "ASTGSGTAATTAATCG";
        System.out.println("DNA with no ATG " + dna);
        String gene = FindSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
     //Test 2: DNA with no "TAA"
        dna = "AATGSGTAGTTASTCG";
        System.out.println("DNA with no TAA " + dna);
        gene = FindSimpleGene(dna);
        System.out.println("Gene is " + gene);
    
    //Test 3: DNA with no "ATG" or "TAA"
        dna = "AATTSGTAGTTASTCG";
        System.out.println("DNA with no ATG or TAA " + dna);
        gene = FindSimpleGene(dna);
        System.out.println("Gene is " + gene);    
    
    //Test 4: DNA with ATG&TAA and the substring between them is a multiple of 3
        dna = "AATGSGGTAATCGTTAATCG";
        System.out.println("DNA with ATG and TAA correct mod3 " + dna);
        gene = FindSimpleGene(dna);
        System.out.println("Gene is " + gene);    
    
    //Test 5" DNA with ATG&TAA and the substring between them is not a multiple of 3
    dna = "AATGSGTAATCGTTAGTCG";     
    //dna = "AATGSGTAATCGTCTAATCG";
        System.out.println("DNA with ATG and TAA incorrect mod3 " + dna);
        gene = FindSimpleGene(dna);
        System.out.println("Gene is " + gene); 
        
    }
}
