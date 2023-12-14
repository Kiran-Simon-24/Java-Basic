package subprogram;

public class Coursera_DNA {
    public static void main(String[] args){
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);

        System.out.println();

        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);

        System.out.println();

        dna = "TTAGTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);

        System.out.println();

        dna = "CGATGGTTTG";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
    }
    public static String findGeneSimple(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return ""; // no ATG
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if(stopIndex  == -1){
            return "NOT FOUND"; // no TAA
        }
        result = dna.substring(startIndex,stopIndex+3);
        return result;
    }

}
