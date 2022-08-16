class RnaTranscription {

    public static String dnaToRna(char dnaPart)
    {
        switch(dnaPart)
        {
            case 'G' : return "C";
            case 'C' : return "G";
            case 'T' : return "A";
            case 'A' : return "U";
            default :  return "";
        }
    }

    public String transcribe(String dnaStrand) {
        String rnaStrand = "";
        if(dnaStrand.length()==0)
            rnaStrand= "";
        else
        {
            for(int i=0;i<dnaStrand.length();i++)
            {
                rnaStrand+= dnaToRna(dnaStrand.charAt(i));
            }
        }

        return rnaStrand;
    }
}