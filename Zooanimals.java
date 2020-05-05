package zooanimals;

    
    public static interface iAnimal{
        
        
        public String getAnimalType();
        public int getIdTag();
        public void setIdTag(int anIdTag);
        public int getMinTemperature();
        public int getMaxTemperature();
    }
    
    public static class Animal implements iAnimal{
        class Dog{
            
            public String animalType = "Dog";
            public int tagNumber;
            public int minTemp = 45;
            public int maxTemp = 90;
           
        }
        private Dog puppers;
        
        @Override
        public String getAnimalType(){
           
           
           puppers = new Dog();
           puppers.animalType = "Dog";
           return  puppers.animalType = "Dog";
        
            
        }
        
        @Override
        public int getIdTag(){
        
            return puppers.tagNumber;
        }
        
        @Override
        public void setIdTag(int anIdTag){
            
            puppers.tagNumber = anIdTag;
           
        }
        
        @Override
        public int getMinTemperature(){
            
            return puppers.minTemp;
        }
        
        @Override
        public int getMaxTemperature(){
            
            return puppers.maxTemp;
        }
    }

}
