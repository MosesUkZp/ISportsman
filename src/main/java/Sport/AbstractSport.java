package Sport;

 abstract class AbstractSport implements Sportsman {
     String name;
     String sport;
     static int count = 1;

     public AbstractSport() {
         name = this.getClass().getSimpleName() + count++;
         sport = this.getClass().getSimpleName();
     }

     public String getName() {
         return name;
     }

     public String getSport() {
         return sport;
     }

     @Override
     public String toString() {
         return '\n' + getName() + " is a " + getSport();
     }
 }
