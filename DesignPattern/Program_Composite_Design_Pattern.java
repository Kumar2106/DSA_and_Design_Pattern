package DesignPattern;

import java.util.ArrayList;

/**
 * Program_Composite_Design_Pattern
 */
public class Program_Composite_Design_Pattern {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street-First Floor");
        int FirstFloor = building.addStructure(floor1);
        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1f = new Room("1F Women's Washroom");
        Room common1 = new Room("1F common Area");

        int FristMens = floor1.addStructure(washroom1m);
        int FirstWomen = floor1.addStructure(washroom1f);
        int firstCommon = floor1.addStructure(common1);

        //Enter the building
        building.enter();

        Housing currentFloor = (Housing) building.getStructure(FirstFloor);

        //walk into the first floor
        currentFloor.enter();

        //walk into the men's room
        Room currentRoom = (Room) currentFloor.getStructure(FristMens);
        currentRoom.enter();

        //walk into the common area
        currentRoom =(Room) currentFloor.getStructure(FirstWomen);
        currentRoom.enter();
        
    }

    //type that will be implemented on leaf class as well as composite class
    public static interface IStructure{
        public void enter();
        public void exit();
        public void location();
        public String getName();
    }

    public static class Housing implements IStructure{
        private ArrayList<IStructure> structures;
        private String address;

        public Housing(String address){
            this.structures = new ArrayList<>();
            this.address = address;
        }

        public String getName(){
            return this.address;
        }

        public int addStructure(IStructure component){
            this.structures.add(component);
            return this.structures.size()-1;
        }

        public IStructure getStructure(int componentNumber){
            return this.structures.get(componentNumber);
        }

        public void location(){
            System.out.println("Your are currently in "+this.getName()+". It has ");
            for ( IStructure structure : structures) {
                System.out.println(structure.getName());
            }
        }

        public void enter(){
            System.out.println("You entered into "+this.address);
        }

        public void exit(){
            System.out.println("You exit from "+this.address);
        }
    }

    public static class Room implements IStructure{
        public String name;

        Room(String name){
            this.name = name;
        }

        public void enter(){
            System.out.println("You have entered the "+this.name);
        }

        public void exit(){
            System.out.println("You have left the "+this.name);
        }

        public void location(){
            System.out.println("You are currently in the "+this.name);
        }

        public String getName(){
            return this.name;   
        }
    }
}