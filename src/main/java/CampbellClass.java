class CampbellClass{

    private CampbellClass(){

    }


    public static String convertString (int value){
        return Integer.toString(value);
    }

    public static String convertString (double value){
        return Double.toString(value);
    }

    public static String convertString (char value){
        return Character.toString(value);
    }

    public static String convertString (boolean value){
        return Boolean.toString(value);
    }

    public static int convertMetersToCenti(int num){
        return num*100;
    }

    public static double convertMetersToCenti(double num){
        return num *100.0;
    }

    public static String removeNonAlpha(String word){

        return word.replaceAll("[^a-zA-Z]", "");

    }

    public static String removeNonAlpha(String word, boolean trueFalse){

        String output = word.replaceAll("[^a-zA-Z]", "");
        
        if (trueFalse){
            return output.toUpperCase();
        }else{
            return output.toLowerCase();
        }
        
    }
    
}