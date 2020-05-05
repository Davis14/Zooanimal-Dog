/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooanimals;

/**
 *
 * @author D
 */
public class Zooanimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
       Animal puppers = new Animal();
       
       System.out.println("This animal is a: " 
               + puppers.getAnimalType());
       System.out.println("Dog's initial ID number: "
               + puppers.getIdTag());
       puppers.setIdTag(11);
       System.out.println("Dog's ID number after setting: "
               + puppers.getIdTag());
       System.out.println("Dog enclosure minimum temperature: "
               + puppers.getMinTemperature());
       System.out.println("Dog enclosure maximum temperature: "
               + puppers.getMaxTemperature());
    }
    
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

 /*   interface iAnimal{
        
        
        public String getAnimalType();
        public int getIdTag();
        public void setIdTag(int anIdTag);
        public int getMinTemperature();
        public int getMaxTemperature();
    }
    
    class Animal implements iAnimal{
        class Dog{
            
            public String dogName = "Dog";
            public int tagNumber;
            public int minTemp = 45;
            public int maxTemp = 90;
           
        }
        private Dog puppers;
        
        @Override
        public String getAnimalType(){
           
           
           puppers = new Dog();
           puppers.dogName = "Dog";
           return  puppers.dogName = "Dog";
        
            
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
    }*/