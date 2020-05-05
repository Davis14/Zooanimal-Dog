    public class Dog implements iAnimal {
        
        private int dogTag;
        private final String name;
        private final int minTemp = 45;
        private final int maxTemp = 90;
        
        public Dog(int dogTag, String name){
            
            this.dogTag = dogTag;
            this.name = name;
            
        }
        
        
        @Override
        public String getAnimalType(){

           return this.name;
        
            
        }
        
        @Override
        public int getIdTag(){
        
            return this.dogTag;
        }
        
        @Override
        public void setIdTag(int anIdTag){
            
           this.dogTag = anIdTag;
           
        }
        
        @Override
        public int getMinTemperature(){
        
           
            return minTemp;
        }
        
        @Override
        public int getMaxTemperature(){
            
            return maxTemp;
        }
    }
}
