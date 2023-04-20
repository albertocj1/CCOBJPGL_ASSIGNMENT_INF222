public class example1 {
    
        static boolean iwillGraduate = true;
        static boolean iwillBehave = true;
       
       public static void main(String[] args) throws Exception {
        //Pre-condition
        assert iwillBehave == true : "magbehave ka para di ka paluin ni mama mo";
        
        College();
    
        //Post-conditon
        assert iwillGraduate == true : "galingan mo para grumaduate";
        
        
        
        }
    
        public static void College() {
            iwillGraduate = false;
            System.out.println("Congrats!!");
        }
    }
    
